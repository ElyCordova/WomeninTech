Algoritmo valores_pares_e_impares
	//Ingresar 10 valores numericos y mostrar cuantos son pares y cuantos impares//
	Definir par, impar, neutro, n Como Entero
	par <- 0
	impar <- 0
	
	Para i <- 1 Hasta 10 Con Paso 1
		Escribir "Ingresa el valor número " i	
		Leer n
		Si n mod 2 == 0  Entonces
			par <- par + 1
		SiNo
			si n mod 2 <> 0 Entonces
				impar <- impar + 1
			FinSi
		FinSi
	FinPara
	Escribir "Ingresaste " par " números pares"
	Escribir "Ingresaste " impar " números impares"
	
FinAlgoritmo
