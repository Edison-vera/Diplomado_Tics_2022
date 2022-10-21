/* Loading the environment variables from the .env file. */
require('dotenv').config();

/* Importing the app.js file. */
const app = require('./app');

/**
 * The main function is an asynchronous function that waits for the app to listen on the port specified
 * by the app.get('port') function, then logs a message to the console.
 */
async function main() {
    await app.listen(app.get('port'));
    console.log('Server run port: ' + app.get('port'));
}

/* Calling the main function. */
main();