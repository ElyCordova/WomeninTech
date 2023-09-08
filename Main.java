//Definición de una clase llamada "Persona"
class Persona{
    String  nombre;
    int edad;
}
public class Ejemplo{
    //'main' es un método de la clase Ejemplo
    public static void main(String[] args){
        //Crear una instancia de la clase Persona
        Persona persona1 = new Persona();

        //Asignar los valores al campo de la instancia
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);

    }
}