Algoritmo Cien_Numeros_Aleatorios
	Dimension Lista[100]
	Definir NumeroAleatorio Como Entero
	
	Para N = 1 Hasta 100 Hacer
		Lista[n] = Azar(101)
	 Escribir N, ". ", Lista[n]
		 Para i = 1 Hasta 99
			 Para j = 1 Hasta 99 Hacer
				 Si Lista[j] > Lista[j + 1] Entonces
					 Auxiliar = Lista[j]
					 Lista[j] = Lista[j + 1]
					 Lista[j + 1] = Auxiliar
				 FinSi
			 FinPara
		 FinPara
	FinPara
 
 Escribir "La lista ordenada (despues de la aplicacon del proceso) es:"
 Para i = 1 Hasta 100 Hacer
	 Escribir i, ". ", Lista[i]
 FinPara

FinAlgoritmo
