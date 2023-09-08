Algoritmo crear_un_login
	nombredeUsuario = ""
	login = ""
	Escribir "Ingrese un nombre de usuario"
	Leer nombredeUsuario
	si nombredeUsuario == "" Entonces
		Escribir "Ingresa un nombre de usuario válido"
	SiNo
		si nombredeUsuario <> "" Entonces
		Escribir "Ingrese una contraseña de usuario. La contraseña debe tener 8 caractéres"
	FinSi
			Leer login
				si Longitud(login) <> 8 o Longitud(login) = 0 Entonces
					Escribir "Ingresa un login válido"
				SiNo
					 si Longitud(login) == 8 && Longitud(login) <> 0  Entonces
						Escribir "Contraseña aceptada"
					FinSi
			finSi	
		FinSi
FinAlgoritmo
