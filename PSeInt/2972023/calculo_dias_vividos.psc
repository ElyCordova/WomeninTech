Algoritmo calculo_dias_vividos
	Dimension hoy[3]		// FechaActual[ dia, mes a�o]
	dias = 0
	dias_nac_mes = 0
	
	Escribir "Ingresa el n�mero de d�a de hoy?"
	Leer hoy[1] 
	Escribir "�Ingresa el n�mero de este mes?"
	Leer hoy[2] 
	Escribir "�En qu� a�o estamos?"
	Leer hoy[3]
	Escribir "Ingresa tu a�o de nacimiento"
	Leer anio_nac
	Escribir "�En qu� d�a naciste?"
	Leer dia_nac
	Escribir "�En qu� numero de mes naciste?"
	Leer mes_nac
	
	// Calcula dias en a�os completos
	Para i <- 1 Hasta hoy[3] - anio_nac - 1
		Si (hoy[3] - i) MOD 4 == 0 Entonces		// Ver si es una a�o bisiesto
			dias = dias + 366
		SiNo
			dias = dias + 365
		FinSi
	FinPara
	
	// Calculo de dias para el a�o actual
	Para i <- 1 Hasta hoy[2] - 1
		Si (i MOD 2 == 0) Entonces
			Si i = 2
				Si (hoy[3] MOD 4 == 0) Entonces
					dias = dias + 29
				SiNo
					dias = dias + 28
				FinSi
			SiNo
				dias = dias + 30
			FinSi
		SiNo
			dias = dias + 31
		FinSi
	FinPara
	
	// Calculo de dias para el a�o de nacimiento
	Para i <- mes_nac Hasta 11
		Si (i MOD 2 == 0) Entonces
			Si i = 2
				Si (hoy[3] MOD 4 == 0) Entonces
					dias = dias + 29
				SiNo
					dias = dias + 28
				FinSi
			SiNo
				dias = dias + 30
			FinSi
		SiNo
			dias = dias + 31
		FinSi
	FinPara
	
	// Calculo dias restantes al mes en que naci�
	Si (mes_nac MOD 2) == 0 Entonces
		Si mes_nac = 2
			Si (hoy[3] MOD 4 == 0) Entonces
				dias_nac_mes = 29 - dia_nac
			SiNo
				dias_nac_mes = 28 - dia_nac
			FinSi
		SiNo
			dias_nac_mes = 30 - dia_nac
		FinSi
	SiNo
		dias_nac_mes = 31 - dia_nac
	FinSi
	
	// Add the remaining days in the current month and birth month
	dias = dias + hoy[1] + dias_nac_mes
	
	Escribir "Has vivido ", dias , " d�as."
FinAlgoritmo
