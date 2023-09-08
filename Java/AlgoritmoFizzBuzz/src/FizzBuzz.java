import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Leer el límite superior desde el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el límite superior:");
        int n = sc.nextInt();
        sc.close();

        // Recorrer los números del 1 al n
        for (int i = 1; i <= n; i++) {
            // Comprobar si el número es múltiplo de 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            }
            // Comprobar si el número es múltiplo de 3
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            // Comprobar si el número es múltiplo de 5
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            // Si no, imprimir el número
            else {
                System.out.println(i);
            }
        }
    }
}