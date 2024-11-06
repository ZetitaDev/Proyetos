SubProceso Calculo(Salario, Devengacion) 
	Escribir "Su salario 13 es: ", Salario * Devengacion / 12
FinSubProceso

Algoritmo Salario_Navidad
	Escribir "Introduzca su salario para calcular su salario 13: "
	Leer Salario_Mensual
	Escribir "Introduzca la cantidad de salarios devengados: (Maximo 12)"
	Leer Devengacion_Total

	Calculo(Salario_Mensual, Devengacion_Total)
FinAlgoritmo
