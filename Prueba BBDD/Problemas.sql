--Pregunta 1: Conocer el número de evaluaciones por curso.

SELECT  N_Evaluaciones FROM Curso

--En este caso aparece la cantidad de evaluaciones registradas por los estudiantes del curso

--Pregunta 2: Conocer los cursos sin evaluaciones.
SELECT  nombre, N_Evaluaciones FROM Curso

--En este caso apararece el nombre del curso y las evaluaciones dadas por cada curso.

--Pregunta 3: Determinar las evaluaciones con deficiencia. Una evaluación es deficiente:
--a. Si no tiene preguntas.
--b. Si hay preguntas con 2 ó menos alternativas
--c. Si todas las alternativas son correctas o si todas las alternativas son incorrectas.

SELECT  nombre, N_EV_DEFICIENCIA FROM Curso

--Se desplega el nombre y la cantidad de evaluacuiones con deficiencias, en este caso se trata de 2 preguntas que invalidan la 
--Evaluacion la pregunta 8 del curso uno tiene solo 2 alternativas al igual que la pregunta 15 del curso 2.

--Pregunta 4: Determinar cuántos alumnos hay en cada curso.

SELECT  nombre, N_estudiante FROM Curso

--Aparece el nombre y la cantidad de estudiantes inscritos.

SELECT COUNT(nombre) FROM estudiantes 
where Curso_ID_curso = 1

--Aparece la cantidad de estudiantes inscritos en el curso 1

SELECT COUNT(nombre) FROM estudiantes 
where Curso_ID_curso = 2

--Aparece la cantidad de estudiantes inscritos en el curso 2

--Pregunta 5: Obtener el puntaje no normalizado de cada evaluación. El puntaje no
--normalizado ha sido definido (requerimiento) como: P = buenas – malas/4. Si un alumno
--no contesta en una pregunta exactamente lo mismo que se ha definido como correcto,
--la pregunta cuenta como mala a menos que el alumno haya omitido.

Select PUNTAJE_NO_NORMA from resultados ORDER BY PUNTAJE_NO_NORMA DESC

--Aparece el conjunto dempuntaje no normalizado

--Pregunta 6: Obtener el puntaje normalizado, o sea, de 1,0 a 7,0.

Select ESTUDIANTES_ID_ESTUDIANTES AS ESTDUDIANTES, PUNTAJE_NORMALIZADO from resultados ORDER BY PUNTAJE_NORMALIZADO DESC

--Apareceran los puntaje que corresponden a nota. Estos fueron previamente calculados

--Pregunta 7: Nombre de estudiantes de un curso determinado que aprueban una
--evaluación determinada (donde la nota de aprobación mínima es un 4,0).

select 
nombre as "Nombre estudiante",
Puntaje_Normalizado as "Nota", 
from estudiantes 
inner join Ressultados  on (id_estudiantes = id_resultados);


--Pregunta 8: Nota promedio de los estudiantes de un curso determinado, para una
--evaluación de terminada.


SELECT Avg(Puntaje_Normalizado) AS Promedio FROM Resultados

--Aparece el promedio de todos los alumnos en la primera evaluacion

SELECT Avg(Puntaje_Normalizado) AS Promedio FROM Resultados
where preguntas_id_preguntas <11

--Aparece el promedio de los alumnos de curso 1 (hasta el alumno 10)

SELECT Avg(Puntaje_Normalizado) AS Promedio FROM Resultados
where preguntas_id_preguntas >10

--Aparece el promedio de los alumnos de curso 2 (despues de 10)
