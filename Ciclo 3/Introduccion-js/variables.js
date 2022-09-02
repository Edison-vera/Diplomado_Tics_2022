//Variables
//Constante
const n1 = 10;
//Variable
let n2 = 50;
n2 = 10;
var n3 = 40;
n3 = 50;
let flag = false;

const suma = n1 + n2 + n3;
//Mostrar datos por consola
console.log("Suma:" + suma);

//Estructura de datos
let numeros = [20, 20, 30, 40, 60];
console.log(numeros);
//Añadir elementos
numeros.push(70);
console.log(numeros);
//Eliminar elementos
numeros.pop(2);
console.log("Numeros->" + numeros);
//Iterar numeros
for (let i = 0; i < numeros.length; i++) {
    console.log("Numeros->" + numeros[i]);
}
//Objetos
let persona = {
    nombre: "Edison",
    apellido: "Vera",
    edad: "28",
    hijo: {
        nombre: "Santiago"
    },
    telefono: ["31234", "4576"]
};
console.log(persona);
console.log(persona.nombre);
console.log(persona['apellido']);
//Obtener los valores como arry
console.log(Object.values(persona));
console.log(Object.keys(persona));

//Imprimir valores de un objecto
let values = Object.values(persona);
for (let i = 0; i < values; i++) {
    console.log(values[i]);
}