Algoritmo Metodo_de_la_burbuja_ascendente
	// Programa para aplicar el Metodo de la Burbuja
	// Creado por Efren Baldera
	// NO. 8, 4TO E

	Definir Lista, i, j, Auxiliar Como Entero
	Dimension Lista[5]
	Lista[1] = 5
	Lista[2] = 1
	Lista[3] = 3
	Lista[4] = 2
	Lista[5] = 100
	
	Escribir "La lista en desorden(antes de la aplicacion del metodo)es:"
	Para i = 1 Hasta 5 Hacer
		Escribir Lista[i]
	FinPara
	
	Para i = 1 Hasta 4
		Para j = 1 Hasta 4 Hacer
			Si Lista[j] > Lista[j + 1] Entonces
				Auxiliar = Lista[j]
				Lista[j] = Lista[j + 1]
				Lista[j + 1] = Auxiliar
			FinSi
		FinPara
	FinPara
	
	Escribir "La lista ordenada (despues de la aplicacon del proceso) es:"
	Para i = 1 Hasta 5 Hacer
		Escribir Lista[i]
	FinPara

FinAlgoritmo
