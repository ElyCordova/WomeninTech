// Cálculo del factorial de un número dado usando el método de RECURSIVIDAD y los ciclos IF...ELSE y WHILE
//Para poder leer datos ingresados desde la consola primero se importa la clase Scanner
import java.util.Scanner;

//Declaramos nuestra  clase principal
public class factorialCalculator {
    //Declaramos el método para leer el número ingresado por consola:
    public static void main(String[] args) {
        //Creamos una variable para guardar el dato dado por consola
        Scanner sc = new Scanner(System.in);
        //Pedimos dato por consola:
        System.out.print("Ingresa un número: ");
        //El número ingresado lo guardaremos en la variable numero por medio de la clase Scanner y su método next.Int
        int numero = sc.nextInt();

        //Bloque de Declaración de variables:
        int i = numero;
        //Declaramos la variable factorial y la iniciamos en 1 ya que al usar el metodo de recursividad necesitamos
        //tener el valor de la última incógnita que es el factorial de 0.Es decir 0!=1
        long factorial = 1;

        //Con un ciclo if discriminamos si el número dado por consola es positivo o negativo:
        if (i < 0) {
            System.out.println("El número es negativo y no se puede calcular");
        } else {
            while (i > 0) {
                factorial = factorial * i;
                i = i - 1;
            }
            //Cuando se termine el ciclo llamamos a la variable f para que nos de el resultado del factorial
            //impreso en consola
            System.out.println("El factorial del número " + numero + " es: " + factorial);
        }
    }
}