import pandas as pd
import os.path
from pandas.errors import ParserError
# ruta file csv
rutaFileCsv = 'https://github.com/luisguillermomolero/MisionTIC2022_2/blob/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv?raw=true'

def listaPeliculas(rutaFileCsv: str) -> str:
    try:
        extension = os.path.splitext(rutaFileCsv)[1]
        extension = extension.split("?")[0]
        if extension != ".csv":
            print("Extensión inválida.")
        else:
            datos = pd.read_csv(rutaFileCsv)
            tabla = pd.pivot_table(datos, index=["Country","Language"], values=["Gross Earnings"])
            return tabla[:10]
    except ImportError:
        print("Error al leer el archivo de datos.")
    except ParserError:
        print("Extensión inválida.")
    except Exception as e:
        print("Otro error")

print(listaPeliculas(rutaFileCsv))

