Algoritmo Formula_cuadratica 
	// Programa para calcular la formula cuadratica
	// Creado por Efren Baldera
	// NO. 8, 4TO E
	Definir A, B, C, X1, X2 Como Real
	
	Escribir "Introduzca el valor de A"
	Leer A
	
	Escribir "Introduzca el valor de B"
	Leer B
	
	Escribir "Introduzca el valor de C"
	Leer C
	
	X1 = -B + (raiz(B^2 - (4 * A * C))) / (2 * A)
	
	X2 = -B - (raiz(B^2 - (4 * A * C))) / (2 * A)
	
	Escribir "El valor de X1 es:", X1
	
	Escribir "El valor de X2 es:", X2
	
FinAlgoritmo
