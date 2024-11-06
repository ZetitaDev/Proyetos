Algoritmo sin_titulo
	Dimension Nombre[10] 
	Dimension Telefono[10]
	Lista = 1
	
	Escribir "Programa para registrar y ordenar hasta 10 nombres con numeros"
	Para I = 1 Hasta 5 Hacer
		Escribir I ". Introduzca un nombre para registrar"
		Leer Nombre[I]
		Escribir "Escriba el numero para asignar con a ese nombre"
		Leer Telefono[I]
		Escribir "------------------------------------------------------"
	FinPara
	
	Para I = 1 Hasta 4
		Para j = I + 1 Hasta 5 Hacer
			Si Nombre[j] > Nombre[j + 1] Entonces
				Nombre_Temp = Nombre[I]
				Telefono_Temp = Telefono[I]
				Nombre[I] = Nombre[I + 1]
				Telefono[I] = Telefono[I + 1]
				Nombre[I + 1] = Nombre_Temp
				Telefono[I + 1] = Telefono_Temp
			FinSi
		FinPara
	FinPara
	
	Escribir "Los nombres ordenados (despues de la aplicacon del proceso) es:"
	Para I = 1 Hasta 5 Hacer
		Escribir I ". El nombre es: " Nombre[I], "; y su numero es: ", Telefono[I]
	FinPara

FinAlgoritmo
