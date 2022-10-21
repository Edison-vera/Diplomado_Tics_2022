DELIMITER //
CREATE PROCEDURE total_horas(FECHA_1 date, FECHA_2 date)
BEGIN
#Crear vista
select e.identificacion, e.primer_nombre, e.primer_apellido, et.created, TIMEDIFF(et.fecha_salida, et.fecha_entrada) as Horas 
from empleados_tiempos as et
inner join empleados as e on e.id=et.id_empleado
where (created BETWEEN FECHA_1 AND FECHA_1)
order by created asc; 

END //

DELIMITER ;

#Llamar procedimiento
CALL total_horas("Colombia");