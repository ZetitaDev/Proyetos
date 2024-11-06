Algoritmo Calificaciones
	Dimension Número_Lista[10]
	Dimension Nombre[10]
	Dimension Apellido[10]
	Dimension Calificación[10]

	Para I = 1 Hasta 10 Hacer
		Escribir I ". Introduzca el numero de lista del alumno: "
		Leer Número_Lista[I]
		Escribir "Introduzca el nombre del alumno: "
		Leer Nombre[I]
		Escribir "Introduzca el apellido del alumno: "
		Leer Apellido[I]
		
		Repetir
		Repetir
		Escribir "Introduzca calificación del alumno (Entre 0 y 100): "
		Leer Calificación_Final
		Si Calificación_Final <= 100 Entonces
			Si Calificación_Final >= 0 Entonces
				Calificación[I] = Calificación_Final
			SiNo
				Escribir "La calificacion no esta entre los parametros 0 y 100"
			FinSi
		SiNo
			Escribir "La calificacion no esta entre los parametros 0 y 100"
		Fin Si
		Hasta Que  Calificación_Final <= 100
	Hasta Que Calificación_Final >= 0
	Escribir "--------------------------------------------------------"
	Fin Para
	
	Para I = 1 Hasta 9
		Para J = 1 Hasta 9 Hacer
			Si Número_Lista[J] > Número_Lista[J + 1] Entonces
				Aux1 = Número_Lista[J]
				Aux2 = Nombre[J]
				Aux3 = Apellido[J]
				Aux4 = Calificación[J]
				Número_Lista[J] = Número_Lista[J + 1]
				Nombre[J] = Nombre[J + 1]
				Apellido[J] = Apellido[J + 1]
				Calificación[J] = Calificación[J + 1]
				Número_Lista[J + 1] = Aux1
				Nombre[J + 1] = Aux2
				Apellido[J + 1] = Aux3
				Calificación[J + 1] = Aux4
			FinSi
		FinPara
	FinPara
	
	Escribir "La lista de estudiandes ordenados segun su numero y con sus clasificaciones es:"
	Para I = 1 Hasta 10 Hacer
		Escribir Número_Lista[I], '. ' Nombre[I], ' ' Apellido[I], ' : ', Calificación[I]
	FinPara
	
	Escribir "--------------------------------------------------------"

	Total = Calificación[1] + Calificación[2] + Calificación[3] + Calificación[4] + Calificación[5] + Calificación[6] + Calificación[7] + Calificación[8] + Calificación[9] + Calificación[10]
	Promedio = Total / 10
	Escribir 'El promedio de calificaciones es: ' Promedio
	Para I = 1 Hasta 9
		Para G = I Hasta 9 Hacer
			Si Calificación[I] < Calificación[I + 1] Entonces
				Auxiliar = Calificación[I]
				Calificación[I] = Calificación[I + 1]
				Calificación[I + 1] = Auxiliar
			FinSi
		FinPara
	FinPara
	
	Escribir "--------------------------------------------------------"
	Escribir "La nota mas alta es: " Calificación[1]
	Escribir "La nota mas baja es: " Calificación[10]
	Escribir "--------------------------------------------------------"

FinAlgoritmo
