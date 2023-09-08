//ALgortimo que indica cuantos números son positivos y cuántos son negativos dada una
//cadena de 10 números dados por el usuario.

import java.util.Scanner;

public class numerosPositivosnegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos variables:
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int iterador = 1; //Comienza en la posición 1
        int valor;

        //Pedimos los números al usuario:
        System.out.println("Dijite 10 números entre positivos y negativos: ");
        System.out.println("");

        //Ciclo while para recorrer e iterar el arreglo:
        while (iterador < 11){ //menor a 11 por ser 10 posiciones
            System.out.print("Dijite el número "+ iterador+ " : ");//Aqui ingresamos cada uno
            //de los 10 números
            valor = sc.nextInt();//cada uno de los 10 números se van guardando en la variable valor
            //ciclo if para cumplir la condición de positivo o negativo
            if(valor > 0){
                contadorPositivos++; //suma 1 de cada uno de los números que sean positivos de los
                //10 ingresados
            }else{
                contadorNegativos++; //suma números negativos
            }
            iterador++; //recorre el arreglo de 10 números
        }
        System.out.println("");
        System.out.println("La cantidad de números positivos son: "+ contadorPositivos);
        System.out.println("La cantidad de números negativos son: "+ contadorNegativos);
    }
}