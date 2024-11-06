Algoritmo Salario_de_trabajador_privado
	// Programa para calcular el salario mensual de un trabajador privado
	// Creado por Efren Baldera
	// NO. 8, 4TO E
	
	Definir Salario_Mensual, Salario_Diario Como Real
	
	Escribir "Porfavor introduzca su salario mensual"
	Leer Salario_Mensual
	Salario_Diario = Salario_Mensual / 23.83
	
	Si Salario_Diario > 850 Entonces
		Escribir "EL SALARIO POR DIA DEL EMPLEADO ES BUENO"
		Escribir "Su salario diario es:", Salario_Diario
	SiNo
		Escribir "EL SALARIO POR DIA DEL EMPLEADO ES REGULAR"
		Escribir "Su salario diario es:", Salario_Diario
	FinSi
FinAlgoritmo
