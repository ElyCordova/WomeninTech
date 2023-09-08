Algoritmo factorial_de_cualquier_numero
	Definir numero, factorial, x Como Entero
	Escribir "Ingresa un número: "
	Leer numero
	
	Si numero < 0 Entonces
		Escribir "El factorial de ese número no puede calcularse"
	SiNo
		x = 1
		factorial = 1
		Mientras x <= numero Hacer
			factorial = factorial * x
			x = x + 1
		FinMientras
		Escribir "El factorial del número ", numero, " es ", factorial
	FinSi
	
	
FinAlgoritmo
