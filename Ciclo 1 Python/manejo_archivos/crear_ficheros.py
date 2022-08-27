import json

def guardar_info(info , ruta_fichero):
    with open(ruta_fichero, 'w') as archivo:
        json.dump(info, archivo)

vehiculos = {
    'vehiculo_1': 'ART123',
    'vehiculo_2': 'ART124'
}

guardar_info(vehiculos, 'vehiculos.json')

persona = {
    'nombre': input('Nombre'),
    'apellido': input('Apellido'),
    'edad': input('Edad')
}
guardar_info(persona, 'persona.json')