select e.identificacion, e.primer_nombre, e.primer_apellido, et.created, TIMEDIFF(et.fecha_salida, et.fecha_entrada) as Horas from empleados_tiempos as et
inner join empleados as e on e.id=et.id_empleado
group by e.id; 


select * from empleados_tiempos;

CREATE 
     OR REPLACE VIEW horas_trabajadas AS 
select 
    e.id,
	e.tipo_documento, 
    e.identificacion, 
    e.primer_nombre, 
    e.segundo_nombre, 
    e.primer_apellido, 
    segundo_apellido,
    et.created as fecha_registro,
    TIME_TO_SEC(TIMEDIFF(et.fecha_salida ,  et.fecha_entrada))/3600 as horas_trabajadas
from empleados_tiempos as et
inner join empleados as e on e.id=et.id_empleado;  

#Eliminar vista
DROP VIEW horas_trabajadas;

select * from horas_trabajadas;


