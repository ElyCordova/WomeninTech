Algoritmo Calculadora
	num1<-0
	num2<-0
	op<-0
	resp<-0
	Escribir "Ingrese numero 1"
	Leer num1
	Escribir "Ingrese numero 2"
	Leer num2
	Escribir "¿Que operación quieres hacer?"
	Escribir "Escribe 1 para sumar"
	Escribir "Escribe 2 para multiplicar"
	Escribir "Escribe 3 para dividir"
	Escribir "Escribe 4 para restar"
	Leer op;
	Si op = 1 Entonces
		resp <- num1 + num2
	SiNo
		Si op= 2 Entonces
			resp<- num1 * num2
		SiNo
			Si op = 3 Entonces
				resp <- num1 / num2
			SiNo
				Si op = 4 Entonces
					resp <- num1 - num2
				SiNo
					Escribir "Error"
				FinSi
			FinSi
		FinSi
	FinSi
	Escribir "El resultado es: ", resp;
FinAlgoritmo
