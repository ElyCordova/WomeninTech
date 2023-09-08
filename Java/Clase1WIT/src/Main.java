// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        //Otra manera de hacer un FOR
       int  i = 0;
        for(; i <= 3; i++){
            System.out.println("i = " + i);
        }

        //Poniendo el incremento j++ en la salida print
        int j = 0;
        for(; j <= 3; ){
            System.out.println(j++);
       }


        //Usando BREAK y CONTINUE
        i=0;
        //El for puede ir sin condiciones entre paréntesis si las ponemos más adelante en el argumento del arreglo
        for(; ;){
            if (i == 4 ){
                break;
            }
            if(++i == 1){
                continue;
            }
            System.out.println(i);

        //For Each:
        int[] arr= {1,2,3,4,5};
                for(int a: arr){
                    System.out.println(a*2);
                }

        //
        }


    }
}