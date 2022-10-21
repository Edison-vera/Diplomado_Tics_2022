/* This is importing the express module. */
const express = require('express');

/* Creating an instance of the express module. */
const app = express();

//Setting
app.set('port', process.env.PORT || 5005);

/* This is exporting the app instance of the express module. */
module.exports = app;