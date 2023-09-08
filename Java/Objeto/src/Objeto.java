
//Ejemplo de como se manejan los objeto en JAVA
//Definición de la clase Libro
class Libro{
    String titulo;
    String autor;
    int anioPublicacion;
}
//Clase principal que contiene el metodo main
public class Objeto{
    //argumento del metodo
    //modificador-atributo-tipo de retorno-nombre del método (parámetros)
    public static void main(String[] args) {
        //Creación del objeto de la clase libro
        //clase madre-nombre del objeto = new-clase madre();
        Libro miLibro = new Libro();
        //Asignación de valores a los atributos del objeto creado
        //Nombre del objeto. atributo = asignación
        miLibro.titulo = "Pride and Predujice";
        miLibro.autor = "Jane Austin";
        miLibro.anioPublicacion = 1813;

        //Imprimir la información del libro
        System.out.println("Título: " + miLibro.titulo);
        System.out.println("Autor: " + miLibro.autor);
        System.out.println("Año de publicación: " + miLibro.anioPublicacion);
    }

}