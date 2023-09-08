Algoritmo valores_positivos_y_negativos
	//Ingresar 10 valores numericos y mostrar cuantos son positivos y cuantos negativos//
	
	Definir pos, neg, neutro, n Como Entero
	pos <- 0
	neg <- 0
	neutro <- 0
	
	Para i <- 1 Hasta 10 Con Paso 1
		Escribir "Ingresa el valor número " i	
		Leer n
		Si n >= 1 Entonces
			pos <- pos + 1
		SiNo
			si n <= -1 Entonces
				neg <- neg + 1
			SiNo
				si n = 0 Entonces
					neutro <- neutro + 1 
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "Ingresaste " pos " números positivos"
	Escribir "Ingresaste " neg " números negativos"
	Escribir "Ingresaste " neutro " ceros"
	
	
FinAlgoritmo
