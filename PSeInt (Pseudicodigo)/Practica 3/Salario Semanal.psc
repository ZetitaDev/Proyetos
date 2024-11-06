Algoritmo Salario_Semanal
	// Programa para Capturar datos
	// Creado por Efren Baldera
	// NO. 8, 4TO E
	Definir Pago_Total, Pago_Extra  Como Real
	Definir Horas_Extras, Horas_Minimas Como Entero
	
	Pago_Total = (40 * 89) + (Horas_Extras * (89 + 92))

	Escribir "Por favor introduzca la cantidad de horas trabajadas"
	Leer Horas_Minimas
	
	Horas_Extras = Horas_Minimas - 40
	Pago_Extra = Horas_Extras * 92
	
	Si Horas_Minimas <= 40 Entonces
		Escribir "Su salario total segun sus horas de trabajo es:", Horas_Minimas * 89
	SiNo
		Escribir "Horas extras trabajadas:", Horas_Extras
		Escribir "Paga de horas extras:", " RD$ " Pago_Extra
		Escribir "Su salario total segun sus horas de trabajo es:", " RD$ " (40 * 89) + (Horas_Extras * (89 + 92))
	FinSi
	
FinAlgoritmo
