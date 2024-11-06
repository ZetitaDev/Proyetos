Algoritmo N_Secreto
	
	Intentos = 1
	
	Numero_Secreto = Azar(99)+1
	
	Escribir "el numero secreto es: ", Numero_Secreto
	
	Escribir "!!!Intente adivinar el número del 1 al 100¡¡¡"
	Leer Numero_Ingresado
	Mientras Numero_Secreto <> Numero_Ingresado Hacer
		Intentos = Intentos + 1
		
		Si Numero_Secreto > Numero_Ingresado Entonces
			Escribir  "El numero ingresado es MENOR que el numero secreto"
		SiNo
			Escribir "El numero ingresado es MAYOR que el numero secreto"
		FinSi
		
		Escribir "------------------------------------------------------------"
		Escribir "Ingrese otro numero para intentar adiviar el numero secreto"
		Leer Numero_Ingresado
	FinMientras
	
	Escribir "USTED REALIZO ", Intentos, " INTENTOS"
	
	Si Intentos <= 10 Entonces
		Escribir "EL NIVEL DEL JUGADOR ES EXPERTO "
	SiNo
		Si Intentos <= 5 Entonces
			Escribir "EL NIVEL DEL JUGADOR ES AVANZADO"
		SiNo
			Si Intentos <= 3 Entonces
				Escribir "EL NIVEL DEL JUGADOR ES MEDIO"
			SiNo
				Escribir "EL NIVEL DEL JUGADOR NO ES EXPERIMENTADO"
			FinSi
		Fin Si
	Fin Si
FinAlgoritmo
