Algoritmo Calificaciones
	Dimension N�mero_Lista[10]
	Dimension Nombre[10]
	Dimension Apellido[10]
	Dimension Calificaci�n[10]

	Para I = 1 Hasta 10 Hacer
		Escribir I ". Introduzca el numero de lista del alumno: "
		Leer N�mero_Lista[I]
		Escribir "Introduzca el nombre del alumno: "
		Leer Nombre[I]
		Escribir "Introduzca el apellido del alumno: "
		Leer Apellido[I]
		
		Repetir
		Repetir
		Escribir "Introduzca calificaci�n del alumno (Entre 0 y 100): "
		Leer Calificaci�n_Final
		Si Calificaci�n_Final <= 100 Entonces
			Si Calificaci�n_Final >= 0 Entonces
				Calificaci�n[I] = Calificaci�n_Final
			SiNo
				Escribir "La calificacion no esta entre los parametros 0 y 100"
			FinSi
		SiNo
			Escribir "La calificacion no esta entre los parametros 0 y 100"
		Fin Si
		Hasta Que  Calificaci�n_Final <= 100
	Hasta Que Calificaci�n_Final >= 0
	Escribir "--------------------------------------------------------"
	Fin Para
	
	Para I = 1 Hasta 9
		Para J = 1 Hasta 9 Hacer
			Si N�mero_Lista[J] > N�mero_Lista[J + 1] Entonces
				Aux1 = N�mero_Lista[J]
				Aux2 = Nombre[J]
				Aux3 = Apellido[J]
				Aux4 = Calificaci�n[J]
				N�mero_Lista[J] = N�mero_Lista[J + 1]
				Nombre[J] = Nombre[J + 1]
				Apellido[J] = Apellido[J + 1]
				Calificaci�n[J] = Calificaci�n[J + 1]
				N�mero_Lista[J + 1] = Aux1
				Nombre[J + 1] = Aux2
				Apellido[J + 1] = Aux3
				Calificaci�n[J + 1] = Aux4
			FinSi
		FinPara
	FinPara
	
	Escribir "La lista de estudiandes ordenados segun su numero y con sus clasificaciones es:"
	Para I = 1 Hasta 10 Hacer
		Escribir N�mero_Lista[I], '. ' Nombre[I], ' ' Apellido[I], ' : ', Calificaci�n[I]
	FinPara
	
	Escribir "--------------------------------------------------------"

	Total = Calificaci�n[1] + Calificaci�n[2] + Calificaci�n[3] + Calificaci�n[4] + Calificaci�n[5] + Calificaci�n[6] + Calificaci�n[7] + Calificaci�n[8] + Calificaci�n[9] + Calificaci�n[10]
	Promedio = Total / 10
	Escribir 'El promedio de calificaciones es: ' Promedio
	Para I = 1 Hasta 9
		Para G = I Hasta 9 Hacer
			Si Calificaci�n[I] < Calificaci�n[I + 1] Entonces
				Auxiliar = Calificaci�n[I]
				Calificaci�n[I] = Calificaci�n[I + 1]
				Calificaci�n[I + 1] = Auxiliar
			FinSi
		FinPara
	FinPara
	
	Escribir "--------------------------------------------------------"
	Escribir "La nota mas alta es: " Calificaci�n[1]
	Escribir "La nota mas baja es: " Calificaci�n[10]
	Escribir "--------------------------------------------------------"

FinAlgoritmo
