//Dada  una fecha de nacimiento, hacer el cálculo de cuantos días has vivido hasta hoy.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcularDiasVividos {
    public static void main(String[] args) {

        //Solicitar Fecha de nacimiento de la persona
        System.out.println("Ingrese su fecha de nacimiento (yyyy/mm/dd): ");

        Scanner ingreso = new Scanner (System.in);
        //La fecha ingresada por consola es del tipo String:
        String fecha = ingreso.nextLine();

        //Convertir fecha formato String a formato LocalDate:

        DateTimeFormatter formatoFecha =new DateTimeFormatterBuilder().append (DateTimeFormatter.ofPattern("yyyy/MM/dd")). toFormatter();
        LocalDate fechaNacimiento = LocalDate.parse(fecha, formatoFecha);
        //System.out.println("Fecha de nacimiento: " + fechaNacimiento );//

        //Fecha actual
        LocalDate fechaActual = LocalDate.now();
        //System.out.println("Fecha actUal: "+ fechaActual);

        // Calcular la diferencia en días
        long diasVividos = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);

        System.out.println("Días vividos: " + diasVividos);

    }
}
