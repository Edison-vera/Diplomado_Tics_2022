
def CDT(usuario: str, capital: int, tiempo: int):
    usuario = "AB1012"
    capital = 100000
    tiempo = 3
    valorIntereses = (capital * 0.03 * tiempo)/12
    valorTotal = (valorIntereses + capital)
        
    return  print ("Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valorTotal}")


