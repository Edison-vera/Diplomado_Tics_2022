info: dict = {
    'id_cliente': 1,
    'nombre': 'Edison Vera',
    'edad': 3,
    'primer_ingreso': True
}

#Definir funcion y llamar diccionario
def cliente(informacion: dict) -> dict:
    resultado: dict = {
    'nombre': informacion['nombre'],
    'edad': informacion['edad'],
    }
    #Llamar en el diccionario la variable edad 
    edad = informacion.get('edad')
    #Reglas para el ingreso a las atracciones 
    if edad > 18:
        resultado['atraccion'] = 'X-Treme'
        resultado['apto'] = True
        resultado['primer_ingreso']= informacion['primer_ingreso']
        if informacion['primer_ingreso']:
            resultado['total_boleta'] = 20000 * 0.95
        else:
            resultado['total_boleta'] = 20000
    elif edad >= 15 and edad <= 18:
        resultado['atraccion'] = 'Carros chocones'
        resultado['apto'] = True
        resultado['primer_ingreso']= informacion['primer_ingreso']
        if informacion['primer_ingreso']:
            resultado['total_boleta'] = 5000 * 0.93
        else:
            resultado['total_boleta'] = 5000
    elif edad >= 7 and edad < 15:
        resultado['atraccion'] = 'Sillas voladoras'
        resultado['apto'] = True
        resultado['primer_ingreso']= informacion['primer_ingreso']
        if informacion['primer_ingreso']:
            resultado['total_boleta'] = 10000 * 0.95
        else:
            resultado['total_boleta'] = 10000
    else:
        resultado['atraccion'] = 'N/A'        
        resultado['apto'] = False
        resultado['primer_ingreso']= informacion['primer_ingreso']
        resultado['total_boleta'] = 'N/A'
    del informacion['id_cliente'] 
    
    return resultado
print(cliente(info))
