import pandas as pd

guion = lambda: print("-------------------------------------------------------------------------")

archivo = "https://raw.githubusercontent.com/luisguillermomolero/MisionTIC2022_2/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv"
movies = pd.read_csv(archivo)
#Consulta informacion basica del dataframe
print(movies.info())
guion()
titulo = movies["Title"]
print(titulo.tail())
guion()
print(titulo.sample(10))

#Crear subDataframe
#print(list(movies))
subDataframe = movies.loc[0:100, ['Title','Genres','Duration','Facebook Likes - Director','Facebook likes - Movie' ]]
print(subDataframe)
guion()
pelis_menor_100 = subDataframe[subDataframe['Duration'] < 100]
print(pelis_menor_100)
guion()
subDataframe['Total likes'] = subDataframe['Facebook Likes - Director'] + subDataframe['Facebook likes - Movie']
print(subDataframe.describe())
guion()
pelis_populares = subDataframe[subDataframe['Total likes'] > 3000]
print(pelis_populares)
