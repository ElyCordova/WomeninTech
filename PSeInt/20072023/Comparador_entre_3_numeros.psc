Algoritmo Comparador_entre_3_numeros
	Definir num1, num2, num3 Como Entero
	num1=0
	num2=0
	num3=0
	Escribir "Escribe un número"
	Leer num1
	Escribir "Escribe otro número"
	Leer num2
	Escribir "Escribe otro número"
	Leer num3
	Si num1 > num2 y num2 > num3 Entonces
			Escribir "El numero " num1 " es mayor que los numeros " num2 " y " num3
		FinSi
			Si num2 > num1 y num2 > num3 Entonces
					Escribir "El numero " num2 " es mayor que los numeros " num1 " y " num3
				FinSi
					Si num3 > num1 y num3 > num2 Entonces
						Escribir "El numero " num3 " es mayor que los numeros " num1 " y " num2
					FinSi
						Si num1 = num2 y num2 = num3 Entonces
						Escribir "Los 3 numeros son iguales"
					FinSi
FinAlgoritmo
