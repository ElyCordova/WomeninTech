Algoritmo volumen_de_una_esfera
	//Algoritmo para calcular el volúmen de una esfera partiendo de la fórmula V= (4/3)*pi*(radio^3) de la esfera
	
	Definir volumen, radio, pii Como Real;
	
	//se define pi con doble i porque sino mete error
	pii <- 3.1416
	Escribir "Introduce el radio de la esfera: "
	Leer radio
	volumen = (4/3) * pii * (radio^3)
	Escribir "El volúmen de la esfera es: "  volumen
	
FinAlgoritmo
