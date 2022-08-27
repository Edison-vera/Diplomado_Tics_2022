from functools import reduce

li = [
    [1201, ("5464", 4, 25842.99), ("7854",18,23254.99), ("8521", 9, 48951.95)],
    [1202, ("8756", 3, 115362.58), ("1112",18,2354.99)],
    [1203, ("2547", 1, 125698.20), ("2635", 2, 135645.20), ("1254", 1, 13645.20),("9965", 5, 1645.20)],
    [1204, ("9635", 7, 11.99), ("7733",11,18.99), ("88112", 5, 390.95)]
]


def ordenes(rutinaContable):
    add = lambda t, o: t + o
    m = lambda i: i[1] * i[2]
    total = 0
    print('------------------------ Inicio Registro diario ---------------------------------')
    for order in rutinaContable:
        id = order[0]
        orders = order[1:]
        resu = map(m, orders)
        total_i = reduce(add, resu)
        if total_i <= 600000:
            total_i += 25000
        total += total_i
        print(f'La factura {id} tiene un total en pesos de {total_i:,.2f}')
    print('-------------------------- Fin Registro diario ----------------------------------')
print(ordenes(li))


