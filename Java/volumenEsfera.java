// Algoritmo para calcular el volúmen de una esfera teniendo por consola el dato
//de su radio. Volumen= (4* pi * (radio^3)) / 3

import java.util.Scanner;

public class volumenEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Declaración de variables:
    double radio, volumen;

    System.out.print("Ingresa el radio de la esfera: ");
    radio = sc.nextDouble();

    //Bloque del cálculo:
    volumen = (4.0 /3.0) * Math.PI * Math.pow(radio, 3);//La función Math. pow()
        // retorna la base elevada al exponente , es decir, baseexponente.

    System.out.print("El volúmen de la esfera es: " + volumen);

    }
}