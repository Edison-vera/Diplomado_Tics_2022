SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c
INNER JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto 
WHERE Proveedor = 'Homecenter' AND p.Ciudad = 'Salento';
select * from country;

select c.Code as CodeCountry, c.Name as Country, ci.Name as City, cl.Language from country c
inner join city ci on  ci.CountryCode = c.Code
inner join countrylanguage cl on cl.CountryCode = c.Code
where c.Code = "COL";

select count(ci.Name) Num_Cuidades, cl.Language from country c
inner join city ci on  ci.CountryCode = c.Code
inner join countrylanguage cl on cl.CountryCode = c.Code
where c.Code = "COL"
group by cl.Language;