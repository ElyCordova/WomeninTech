Algoritmo ordenar_5_numeros_de_mayor_a_menor_método_burbuja
	Definir x, a, b, temp, vector Como Entero
	Dimension vector[5]
	Escribir "Números generados al azar: "
	para x = 1 hasta 5 Con Paso 1 Hacer
		vector[x] = azar(50)
		Escribir vector[x]
	FinPara
	
	para x= 1 Hasta 9 Con Paso 1 Hacer
		para a=1 Hasta 4 Con Paso 1 Hacer
			si vector[a] < vector[a + 1] Entonces
				temp = vector[a]
				vector[a] = vector [a + 1]
				vector[a + 1] = temp
			FinSi
		FinPara
	FinPara
	
	Escribir "Números ordenados de mayor a menor: "
	para x = 1 Hasta 5 Con Paso 1 Hacer
		Escribir 	 vector[x]
	FinPara
FinAlgoritmo
