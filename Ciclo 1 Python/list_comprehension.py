
guion = lambda : print('--------------------------------------------------')

numeros= [10, 20, 30, 40, 50, 60, 70, 80, 90]

numeros_al_cuadrado = [n**2 for n in numeros ]
print(numeros_al_cuadrado)

lista = []
for n in numeros:
    lista.append(n**2)

nombres = [ 'Anfres', 'Juliana', 'Clauida', 'Oliver', 'Bladimir']

iniciales = [n[0] for n in nombres]
print(iniciales)

nombres_mayuscula = [n.upper() for n in nombres]
print(nombres_mayuscula)

formula = lambda n: (n+10)*2
lista = [formula(n) for n in numeros]
print(lista)

#Ejercicio

tuplas = [tuple(n) for n in nombres]
print(tuplas)

numeros = [10, 20, 30, 40, 50, 60, 70, 80, 90, 15, 25, 35, 45, 55, 65 , 67, 88 ]

numeros_pares = [n for n in numeros if n%2==0]
print(numeros_pares)
guion()
numeros_impares = [n for n in numeros if n%2!=0]
print(numeros_impares)

numeros_impares = [n if n%2==0 else 0 for n in numeros ]
print(numeros_impares)
guion()

nombres = [ 'Anfres', 'Juliana', 'Clauida', 'Oliver', 'Bladimir', 'Jorge', 'Julieta']

##Generar una lista con los nombres que empiezan por j y guardarlos en minusculas, de lo contrario guardarlos en mayusculas

nombres_x_j = [n.lower() if n[0].lower()=='j' else n.upper() for n in nombres ]
print(nombres_x_j)
guion()

