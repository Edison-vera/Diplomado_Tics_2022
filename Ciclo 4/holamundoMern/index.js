/* Importing the express module. */
const express = require('express');

/* Creating an instance of the express module. */
const app = express();

/* This is a route. It is a way to tell the server what to do when a certain URL is called. In this
case, when the root URL is called, the server will send the text "Hola mundo desde express!!!" to
the browser. */
app.get('/', function(req, res) {
    res.send('Hola mundo desde express!!!');
})

/* Creating a variable called port and assigning it the value of 5005. */
const port = 5000;

/* Listening for the port to be called. */
app.listen(port, () => {
    console.log('Server run port: ' + port);
});