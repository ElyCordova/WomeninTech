//Identificar si un número es primo o no
//Número primo: Divisible entre si mismo y uno

//Importamos librería para leer datos dados desde la consola:
    import java.util.Scanner;

    public class numeroPrimo {

    public static void main(String[] args) {
        //Creamos una variable para guardar el dato por consola:
        Scanner sc = new Scanner(System.in);
        //pedimos por consola un número
        System.out.println("Dame un número: ");
        //para que el número leido desde la consola se convierta en dato tipo entero
        int numero = sc.nextInt();

        //Creamos variable suma para guardar resultados del ciclo if que usaremos más adelante:
        int suma = 0;
    /*Necesitamos un algoritmo que nos indique que un número es solo divisible 2 veces:
    De la cadena de números  que estan debajo de el solo puede dividirse entre si mismo y el
      uno) para que sea primo, si es divisible MAS de 2 veces en esa cadena entonces no es primo */
    /*Generamos un ciclo for para que realice un recorrido de la cadena de números que se genere
        por el número dado por usuario. Ejemplo:
      8 /  1 2 3 4 5 6 7 8*/
        for(int i=1; i<=numero; i++){
            /*Queremos que al recorrer esa cadena se dividan esos números por el número dado y guardar
            en una variable el número cuyo RESIDUO SEA CERO ya que eso indicará cuando sea divisible*/
            int residuo = numero%i;/*(8/1= 8 residuo 0 ; 8/2= 4 residuo 0; 8/3= 2 residuo 2*/
            System.out.println(residuo);

            /*Al saber cuantas veces el residuo de la cadena nos dió CERO sabremos si el número dado
            es primo (si dió solo 2 veces cero, es primo. Si dió más veces cero NO es primo*/
            //Para contar las veces que el resultado de residuo dió cero:
                if (residuo == 0){
                /*Recorre el arreglo de resultados de los residuos y determina cuantos CEROS hay
                en ese arreglo: */
                    suma = suma+1;
                }
        }
        //Condicionando el resultado de suma sabremos si el número es primo//
        if (suma <= 2){
            System.out.println("Tu número es primo");
        }else{
            System.out.println("Tu número NO es primo");
        }
    }
}

/*Si queremos saber el residuo de una divsión usamos:
    double ejemplo = 10%3;
    System.out.println(ejemplo);
 */





