// Teniendo 4 palabras imprmir la que tenga la mayor cantidad de caracteres
public class lengthnames {
    //Se crea un arreglo de cadenas de palabras
        public static void main(String[] args) {
            String[] words = {"Zeus", "Nora", "Minimalista", "hola"};
            //Iniciar la variable max con el valor a cero ya que la posición cero será la palabra
            // que tenga el máximo de caractéres después de recorrer el arreglo
            int max = 0;
            /* Creo una variable llamada longest sin asignación porque ahí voy a guardar el resultado de mi recorrido*/
            String longest = "";
            //Con el ciclo for voy a recorrer el arreglo de cadenas
            for (String word : words) {
                //En cada iteración compara la longitud de la cadena actual con el valor actual
                if (word.length() > max) {
                    //Si la longitud es mayor que max, actualiza el valor de max
                    max = word.length();
                    //Guarda la cadena actual en una variable longest
                    longest = word;
                }
            }
            //Imprime la palabra guardada en la variable longest
            System.out.println("La palabra con más caracteres es: " + longest);
        }
    }