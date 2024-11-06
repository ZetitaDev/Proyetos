Algoritmo sin_titulo
	Dimension Animales[10]
	Definir Nombre Como Caracter
	
	I = 1
	
	Mientras I + 1 <= 10 Hacer
		Escribir "Introduzca su animal numero ", I, ":"
		Leer Nombre
		I = I + 1
	FinMientras
	
	Para I = 1 Hasta 9
		Para J = 1 Hasta 9 Hacer
			Si Animales[I] > Animales[I + 1] Entonces
				Auxiliar = Animales[I]
				Animales[I] = Animales[I + 1]
				Animales[I + 1] = Auxiliar
			FinSi
		FinPara
	FinPara

	Para I = 1 Hasta 1
		Escribir "Su lista de animal ya ordenada es:", Animales[I]
	FinPara
	
FinAlgoritmo
