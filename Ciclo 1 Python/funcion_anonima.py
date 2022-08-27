def sumar(n1, n2):
    return n1 + n2

funcion_anonima = lambda : "HOLA MUNDO"

print(funcion_anonima())

suma_lamda = lambda n1,n2: n1 + n2
print(suma_lamda(20, 10))

def fabricar_funcion(operador: str):
    operacion = lambda n1 , n2 : f"No existe operacion para {n1}{operador}{n2}"
    if operador =="+": operacion = lambda n1 , n2: n1 + n2
    elif operador == "-": operacion = lambda n1, n2: n1 - n2
    elif operador == "*": operacion = lambda n1, n2: n1 * n2
    elif operador == "/": operacion = lambda n1, n2: n1 / n2
    elif operador == "**": operacion = lambda n1, n2: n1 ** n2
    elif operador == "**": operacion = lambda n1, n2: n1 ** n2
    return operacion

operacion = fabricar_funcion("a")
print(operacion(12,2))

# 1) Desarrolle una función anónima que retorne el promedio de una lista de números
#     sum([])


promedio = lambda lista: (sum(lista)/len(lista))
lista = [2, 3 , 4 , 5 , 6 ,7 ]
print(promedio(lista))

# 2) Desarrolle un función anónima que reciba como parámetro un String y retorne 
#     el primer caracter del string


string = lambda nom: nom[0]
print(string("Hola"))

# 3) Desarrolle una función anónima que reciba como parámetro nombre y apellido, retorne
#     en una tupla las iniciales.
#         Ejemplo:
#             Luis Torres -> (L, T)

iniciales = lambda nombre, apellido: (nombre[0],apellido[0])
print(iniciales("Edison","Vera"))

# 4) Desarrolle un software que eleve al cubo todos los números de una lista.
#         NOTA: Para este punto debe hacer uso de funciones lambda y funciones
#         de orden superior

def elevar(funcion, lista):
    lista_cubos = []
    for n in lista:
        result = funcion(n)
        lista_cubos.append(result)
    return lista_cubos


cubo = lambda n:  n**3
print(elevar(cubo, [2,5,4]) )

