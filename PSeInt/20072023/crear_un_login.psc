Algoritmo crear_un_login
	nombredeUsuario = ""
	login = ""
	Escribir "Ingrese un nombre de usuario"
	Leer nombredeUsuario
	si nombredeUsuario == "" Entonces
		Escribir "Ingresa un nombre de usuario v�lido"
	SiNo
		si nombredeUsuario <> "" Entonces
		Escribir "Ingrese una contrase�a de usuario. La contrase�a debe tener 8 caract�res"
	FinSi
			Leer login
				si Longitud(login) <> 8 o Longitud(login) = 0 Entonces
					Escribir "Ingresa un login v�lido"
				SiNo
					 si Longitud(login) == 8 && Longitud(login) <> 0  Entonces
						Escribir "Contrase�a aceptada"
					FinSi
			finSi	
		FinSi
FinAlgoritmo
