/*Algoritmo para determinar si un año es Bisiseto o no, utilzando ciclos IF.
Debe de cumplir con las siguientes restricciones para ser Bisiesto:
-Año divisible entre 4 y no divisible entre 100.
-Año divisible entre 4, divisible entre 100 y divisible entre 400
Para NO ser Bisiesto:
-Año divisible entre 4 y divisible entre 100 pero no entre 400.
-Año NO divisible entre 4. */

//importar libreria Scanner
import java.util.Scanner;
public class anioBisiesto {
    public static void main(String[] args) {
        //Para pedir un dato por consola y leerlo
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un año: ");
        int year = sc.nextInt();

        //Comenzamos con los ciclos if para discriminar si el año dado es divisible entre 4
        // (al dividirlo entre 4 su residuo debe dar cero)
        if( year % 4 == 0){
            //Si es divisible entre 4 tambien debemos ver que NO sea divisible entre 100.
            if (year % 100 != 0){
                System.out.println("El año " + year + " es bisiesto" );
            }else{
                //Si es divisible entre 4 pero no entre 100 debemos saber si es divisible entre 400.
                if (year % 400 == 0){
                    System.out.println("El año " + year + " es bisiesto");
                }else{
                    //Si no es divisible entre 400.
                    System.out.println("El año " + year+ " no es bisiesto");
                }
            }//El año no es divisible entre 4
        }else{
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}
//años bisiestos: 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032...