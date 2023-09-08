//Algortimo para calcular el tiempo que un objeto tarda en recorrer una dstancia
//y velocidad dadas por consola. V= d/t => t= d/V

import java.util.Scanner;
public class tiempoRecorrido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables:
        double distancia, velocidad, tiempo ;

        //Pedimos datos por consola:
        System.out.print("Ingresa la distancia a recorrer en metros: ");
        distancia = sc.nextDouble();

        System.out.print("Ingresa la velocidad en metros por segundo a la que se mueve el objeto: ");
        velocidad = sc.nextDouble();

        //Bloque de cálculo:
        tiempo = (distancia / velocidad);
        System.out.print("El tiempo que el objeto tardará en recorrer " + distancia + " metros " +
                "a una velocidad de " + velocidad+ " metros por segundo, es: " + tiempo + " segundos" );
    }
}