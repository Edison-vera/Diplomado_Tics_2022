/* Loading the environment variables from the .env file. */
require('dotenv').config();

/* Importing the app.js file. */
const app = require('./app');

app.get('/', (req, res) => {
    res.send('Hola mi server esta en express!!!');
});

app.get('/nueva-ruta', (req, res) => {
    res.send('Esto es una nueva ruta!!!');
});

app.get('/categorias', (req, res) => {
    res.json([{
            id: 1,
            name: 'Categoria 1'
        },
        {
            id: 2,
            name: 'Categoria 2'
        },
        {
            id: 3,
            name: 'Categoria 3'
        },
        {
            id: 4,
            name: 'Categoria 4'
        }
    ]);
});

app.get('/categorias/:id', (req, res) => {
    const { id } = req.params;
    res.json({
        id,
        id: 3,
        name: 'Categoria 3'
    })
})

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