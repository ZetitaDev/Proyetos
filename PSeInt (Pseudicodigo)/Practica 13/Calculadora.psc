Funcion Suma()
	Escribir "Usted a elegido: Sumar"
	Escribir "Escriba su primer numero:"
	Leer numero1
	Escribir "Escriba su segundo numero:"
	Leer numero2
	Resultado = numero1 + numero2
	Escribir "La suma de los numeros es: " Resultado
FinFuncion

Funcion Resta()
	Escribir "Usted a elegido: Restar"
	Escribir "Escriba su primer numero:"
	Leer numero1
	Escribir "Escriba su segundo numero:"
	Leer numero2
	Resultado = numero1 - numero2
	Escribir "La resta de los numeros es: " Resultado
FinFuncion

Funcion Multiplicacion()
	Escribir "Usted a elegido: Multiplicar"
	Escribir "Escriba su numero base:"
	Leer numero1
	Escribir "Escriba su multiplicador:"
	Leer numero2
	Resultado = numero1 * numero2
	Escribir "La multiplicacion de los numeros es: " Resultado
FinFuncion

Funcion Division()
	Escribir "Usted a elegido: Dividir"
	Escribir "Escriba su numero base:"
	Leer numero1
	Escribir "Escriba su divisor:"
	Leer numero2
	Resultado = numero1 / numero2
	Escribir "La divicion de los numeros es: " Resultado
FinFuncion

Funcion Exponente()
	Escribir "Usted a elegido: Exponente"
	Escribir "Escriba su numero base:"
	Leer numero1
	Escribir "Escriba el exponente:"
	Leer numero2
	Resultado = numero1 ^ numero2
	Escribir "La exposicion de los numeros es: " Resultado
FinFuncion

Funcion Raiz_Cuadrada()
	Escribir "Usted a elegido: Raiz"
	Escribir "Escriba el numero a sacar la raiz:"
	Leer numero1
	Resultado = raiz(numero1)
	Escribir "La raiz de los numeros es: " Resultado
FinFuncion

Funcion Modulo()
	Escribir "Usted a elegido: Modulo"
	Escribir "Escriba su numero base:"
	Leer numero1
	Escribir "Escriba su divisor:"
	Leer numero2
	Resultado = numero1 MOD numero2
	Escribir "El modulo de los numeros es: " Resultado
FinFuncion


Algoritmo Calculadora
	Repetir
	Escribir "/----------------------------------------------------------/"
	Escribir "/                          {MENU}                          /"
	Escribir "/----------------------------------------------------------/"
	Escribir "/                        CALCULADORA                       /"
	Escribir "/                 SELECCIONA OPERACION A EJECUTAR          /"
	Escribir "/                        1. SUMAR                          /"
	Escribir "/                        2. RESTAR                         /"
	Escribir "/                        3. MULTIPLICAR                    /"
	Escribir "/                        4. DIVIDIR                        /"
	Escribir "/                        5. EXPONENTE                      /"
	Escribir "/                        6. RAIZ                           /"
	Escribir "/                        7. MODULO                         /"
	Escribir "/                        8. SALIR                          /"
	Escribir "/----------------------------------------------------------/"
	Leer Operacion
	
	Segun Operacion Hacer
		1:
			Suma()
		2:
			Resta()
		3:
			Multiplicacion()
		4:
			Division()
		5:
			Exponente()
		6:
			Raiz_Cuadrada()
		7:
			Modulo()
		8:
			Escribir "Terminando el programa..."
	Fin Segun
	Hasta Que Operacion = 8
FinAlgoritmo
