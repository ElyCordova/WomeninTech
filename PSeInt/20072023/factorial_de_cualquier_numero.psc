Algoritmo factorial_de_cualquier_numero
	Definir numero, factorial, x Como Entero
	Escribir "Ingresa un n�mero: "
	Leer numero
	
	Si numero < 0 Entonces
		Escribir "El factorial de ese n�mero no puede calcularse"
	SiNo
		x = 1
		factorial = 1
		Mientras x <= numero Hacer
			factorial = factorial * x
			x = x + 1
		FinMientras
		Escribir "El factorial del n�mero ", numero, " es ", factorial
	FinSi
	
	
FinAlgoritmo
