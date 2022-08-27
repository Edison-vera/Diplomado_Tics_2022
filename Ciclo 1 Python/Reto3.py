def AutoPartes(ventas: list):
    vent = {}
    for v in ventas:
        id = v[0]
        if not vent.get(id):
            vent[id] = []
        vent[id].append(v)
    return vent


def consultaRegistro(ventas_dict, idProducto):
    id = ventas_dict.get(idProducto)
    if id:
        for x in id:
            print(f"Producto consultado : {x[0]}  Descripción  {x[1]}  #Parte  {x[2]}  Cantidad vendida  {x[3]}  Stock  {x[4]}  Comprador {x[5]}  Documento  {x[6]}  Fecha Venta  {x[7]}")

    else:
        print("No hay registro de venta de ese producto")


ventas_list = [
        (2001, 'rosca', 'PT29872', 2, 45, 'Luis Molero', 3456, '12/06/2020'),
        (2010, 'bujía', 'MS9512', 4, 15, 'Carlos Rondon', 1256, '12/06/2020'),
        (2010, 'bujía', 'ER6523', 9, 36, 'Pedro Montes', 1243, '12/06/2020'),
        (3578, 'tijera', 'QW8523', 1, 128, 'Pedro Faria', 1456, '12/06/2020'),
        (9251, 'piñón', 'EN5698', 2, 8, 'Juan Peña', 565, '12/06/2020')
    ]



ventas_dict = AutoPartes(ventas_list)
consultaRegistro(ventas_dict, 3578)


