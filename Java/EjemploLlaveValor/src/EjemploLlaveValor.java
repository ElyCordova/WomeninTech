/*Este código crea un HashMap llamado mapa que almacena pares de llave-valor,
donde las llaves son nombres de frutas y los valores son cantidades.
Puedes agregar, acceder, eliminar y verificar la existencia de llaves en el mapa
y también iterar a través de las llaves y valores utilizando un bucle for.
*/


import java.util.HashMap;
import java.util.Map;

public class EjemploLlaveValor {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar pares de llave-valor
        Map<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al mapa (llave-valor)
        mapa.put("Manzana", 10);
        mapa.put("Plátano", 5);
        mapa.put("Naranja", 15);
        mapa.put("Uva", 8);

        // Acceder a los valores a través de las llaves
        int cantidadManzanas = mapa.get("Manzana");
        int cantidadNaranjas = mapa.get("Naranja");

        System.out.println("Cantidad de manzanas: " + cantidadManzanas);
        System.out.println("Cantidad de naranjas: " + cantidadNaranjas);

        // Iterar sobre las llaves y valores en el mapa
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String fruta = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("Llave: " + fruta + ", Valor: " + cantidad);
        }

        // Verificar si una llave existe en el mapa
        String llaveBuscada = "Manzana";
        if (mapa.containsKey(llaveBuscada)) {
            System.out.println(llaveBuscada + " existe en el mapa.");
        }

        // Eliminar un elemento del mapa
        mapa.remove("Plátano");
        System.out.println("Después de eliminar el plátano: " + mapa);
    }
}
