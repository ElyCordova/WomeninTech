import java.util.Scanner;

// Algoritmo que cuenta cuantos números son Pares e Impares de una cadena de 10 números dados
//por consola
public class numerosPareseImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPares = 0;
        int contadorImpares = 0;
        int iterador = 1; //comienza en la posición 1
        int valor;


        System.out.println("Dijite 10 números: ");
        System.out.println("");//salto de línea

        while (iterador < 11) { //menor a 11 porque son 10 posiciones
            System.out.print("Digite el número " + iterador + " : ");
            valor = sc.nextInt(); //Los 10 numeros se guardan en la variable valor

            if (valor % 2 == 0) { //Si al dividir cada uno de los diez numeros entre dos
                // el residuo es 0 entonces es par
                contadorPares++;//la variable contadorPares se incrementa en uno y va sumando
                // cada número par de los 10 que ingresamos

            } else {
                contadorImpares++;
            }
            iterador++;
        }

            System.out.println("");
            System.out.println("La cantidad de números pares son: " + contadorPares);
            System.out.println("La cantidad de números impares son: " + contadorImpares);
    }
}