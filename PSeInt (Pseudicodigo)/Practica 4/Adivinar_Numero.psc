Proceso Adivinar_Numero
	// Programa para adivinar un numero del 1 al 10
	// Creado por Efren Baldera
	// NO. 8, 4TO E
	Intentos = 9
	Numero_Secreto = Azar(10)+1
	Escribir "Adivine el número del 1 al 10"
	Leer Numero_Ingresado
	
	Mientras Numero_Secreto <> Numero_Ingresado Y Intentos > 0 Hacer
		Si Numero_Secreto > Numero_Ingresado Entonces
			Escribir  "Muy bajo"
		SiNo
			Escribir "Muy alto"
		FinSi
		Escribir "Le quedan ", Intentos, " intentos:";
		Leer Numero_Ingresado;
		Intentos = Intentos - 1
	FinMientras
	
	Si Intentos = 0 Entonces
		Escribir "El numero era: ", Numero_Secreto
	SiNo
		Escribir "¡Bravo!, usted adivino en ", 9 - Intentos, " intentos"
	FinSi
FinProceso
