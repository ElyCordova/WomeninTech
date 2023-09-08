// Algoritmo para calcular el área de un triángulo teniendo por consola la longitud de su base
//y su altura. Area = (base * altura) / 2
//Para solicitar y leer datos por consola:

import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Ingresa la base del triángulo: ");
        base = sc.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area );
    }
}