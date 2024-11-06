Algoritmo Positivo_o_Negativo
	// Programa para definir si un numero es positivo o negativo hasta que se introduzca 0
	// Creado por Efren Baldera
	// NO. 8, 4TO E

	Definir Cifra Como Entero
	Escribir "Favor introduzca su numero para decirle si es positivo o negativo (Introduzca 0 para terminar el programa)"
	Leer Cifra

	Mientras Cifra <> 0 Hacer
		Si Cifra >= 1 Entonces
			Escribir "Su numero es positivo"
		SiNo
			Escribir "Su numero es negativo"
		FinSi
		Escribir "------------------------------------------------------------"
		Escribir "Introduzca otro numero para decirle si es positivo o negativo"
		Leer Cifra
	FinMientras

	
FinAlgoritmo
