import numpy as np
from numpy import random as r
guion = lambda : print('----------------------------------------------------------------------------------------------------------------------------------')

#Crear matriz

matriz = np.array([[10,20],[30, 40]])
print(matriz)

guion()
matriz_1 = np.array([[10,20],[30, 40.2]])
print(matriz_1)

guion ()
matriz_2 = np.array([[10,20],[30, '40']])
print(matriz_2)

guion ()
matriz_3 = np.array([[10,20],[30, 40.2],['50', '60']])
print(matriz_3)

guion ()
matriz_4 = np.array([[0, 0, 0],[0, 0, 0]])
print(matriz_4)

guion ()
matriz_5 = np.zeros([4, 3])
print(matriz_5)

guion ()
matriz_6 = np.ones([10, 3])
print(matriz_6)

nombres = ['Juan', 'Maria', 'Juliana', 'Sebastian']
ganadores = r.choice(nombres, size =r.choice([1, 2], size=[1]), p=[0.1, 0.2, 0.5, 0.2], replace=False)
print(ganadores)

guion()
print('Operaciones')
guion()

numeros_1 = np.array([[10, 20, 30, 40], [60, 70, 80, 90]])
numeros_2 = np.array([[12, 15, 45, 35], [90, 80, 90, 10]])

#Sumar
suma = np.add(numeros_1, numeros_2)
print(suma)

#Resta
guion()
resta = np.subtract(numeros_1, numeros_2)
print(suma)

#Multipliacion elemento a elemento
guion()
mult = numeros_1 * numeros_2
print(mult)

#Dividir
guion()
div = numeros_1 / numeros_2
print(div)

matriz_7 = np.array([ [2, 5, 4], [1, 2, 10] ])
matriz_8 = np.array([ [10, 2], [8, 4], [1, 5] ])

#Multiplicacion de matrices
guion()
mult = np.dot(matriz_7, matriz_8)
print(mult)

nombres = ['Juan', 'Maria', 'Juliana', 'Sebastian']

#Reordenar la lista
guion()
r.shuffle(nombres)
print(nombres)