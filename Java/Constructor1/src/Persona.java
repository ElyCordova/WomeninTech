//Ejemplo de Constructor usando .this
public class Persona{
    private String nombre;
    private int edad;

    //Constructor con parámetros
//modficador-nombre de la clase Madre-(tipo de dato y parámetro, tipo de dato y parámetro)
    public Persona(String nombre, int edad){
        this.nombre = nombre; // this.nombre hace referencia al miembro nombre de la clase
        this.edad = edad; // This.edad hace referencia al miembro edad de la clase
    }

    //Métodos getter y setter para nombre
//modificador-tipo de dato- getmiembro de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Métodos getter y setter para edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public static void main(String[] args) {
        //Crear a una instancia de Persona usando al constructor
        Persona persona1 = new Persona("Juan", 31);

        //Acceder a los valores usando el método getter
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
    }
}