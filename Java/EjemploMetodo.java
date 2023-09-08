// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EjemploMetodo{
    //Definición del método suma
    //modificador/atributo de clase-tipo de retorno-nombre del método(tipo de dato- parámetro,...);
    public static int sumar(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    //Definición del método main para declarar las variables que queremos sumar
    public static void main(String[] args){
        int a = 5;
        int b = 6;

        //Llamada al método y alamacenamiento del resultado
        int suma = sumar(a, b);

        System.out.println("La suma de " + a + " y " + b +" es igual a: " + suma);
    }
}