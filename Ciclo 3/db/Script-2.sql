SELECT * FROM Compra c;
SELECT * FROM MaterialConstruccion mc ;
SELECT * FROM Proyecto p;
SELECT * FROM Lider l;
SELECT * FROM Tipo t ;
--Punto 1
SELECT ID_MaterialConstruccion AS ID, Nombre_Material AS NOMBRE, Precio_Unidad AS  PRECIO FROM MaterialConstruccion WHERE Importado= "Si" ORDER BY Nombre_Material;
--Punto 2
SELECT  p.ID_Proyecto AS ID, p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato, (l.Nombre ||" "|| l.Primer_Apellido ||" "|| l.Segundo_Apellido) AS LIDER  FROM Proyecto p 
INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider 
INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo
WHERE (Banco_Vinculado="Conavi")
ORDER BY Fecha_Inicio DESC,  Ciudad, Constructora ASC;
--Punto 3
SELECT Ciudad, Clasificacion, COUNT(*) AS TOTAL, MIN(Fecha_Inicio) AS VIEJO, MAX(Fecha_Inicio) AS RECIENTE FROM Proyecto p 
WHERE Clasificacion !="Casa Campestre" 
AND Clasificacion !="Condominio" 
GROUP BY Ciudad,Clasificacion 
ORDER BY Ciudad ASC;
--Punto 4
SELECT c.ID_Proyecto, SUM(c.Cantidad*mc.Precio_Unidad)  AS VALOR FROM Compra c
INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion
WHERE Pagado ='No'
GROUP BY ID_Proyecto 
HAVING VALOR > 50000
ORDER BY VALOR DESC;
--Punto5
SELECT (l.Nombre ||' '|| l.Primer_Apellido ||' '|| l.Segundo_Apellido) AS LIDER, SUM(c.Cantidad*mc.Precio_Unidad) AS VALOR FROM Lider l
INNER JOIN Proyecto p  ON p.ID_Lider=l.ID_Lider
INNER JOIN Compra c ON c.ID_Proyecto=p.ID_Proyecto
INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion=c.ID_MaterialConstruccion
GROUP BY LIDER
ORDER BY VALOR DESC 
LIMIT 10;
--Reto 5
--Primer Query
SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider
ORDER BY Ciudad_Residencia ASC;
--Segundo Query
SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto
WHERE Clasificacion = 'Casa Campestre'  AND Ciudad = 'Santa Marta' OR Ciudad = 'Cartagena' OR Ciudad = 'Barranquilla';
--Tercer Query
SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c
INNER JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto WHERE Proveedor = 'Homecenter' AND p.Ciudad = 'Salento'; 
