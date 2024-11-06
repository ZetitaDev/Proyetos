Algoritmo Invertir_Texto
	Definir Mensaje, Inversion Como Caracter
	Escribir "Por favor ingrese el texto a invertir"
	Leer Mensaje
	
	Para I = Longitud(Mensaje) Hasta 1 Hacer
		Inversion = Inversion + Subcadena(Mensaje,I,I)
	FinPara
	
	Escribir "Su texto invertido seria: ", Inversion
FinAlgoritmo
