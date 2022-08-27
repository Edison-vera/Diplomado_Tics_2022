
def CDT(usuario: str, capital: int, tiempo: int):
    if tiempo > 2:
        valorIntereses = (capital * 0.03 * tiempo)/12
        valorTotal = (valorIntereses + capital)
        
    else:
        valorIntereses = capital * 0.02
        valorTotal = capital - valorIntereses
        
    return (f"Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valorTotal}")

usuario = input("Ingrese el usuario: ")
capital = int(input("Ingrese el capital: "))
tiempo = int(input("Ingrese el tiempo: "))
cadena= CDT(usuario, capital, tiempo)
print(cadena)



