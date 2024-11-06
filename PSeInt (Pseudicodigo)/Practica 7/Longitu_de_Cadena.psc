Algoritmo Longitud_de_Cadena
	Definir Mensaje Como Caracter
	Mensaje = "Dios es amor, y nos ama!!!"
	
	Escribir Longitud(Mensaje)
	
	Para I = 1 Hasta Longitud(Mensaje) Hacer
		Si Subcadena(Mensaje,I,I) == "a" Entonces
			Contador = Contador + 1
		FinSi
	FinPara
	
	Escribir "La cantidad de letras A es:" Contador
	
FinAlgoritmo
