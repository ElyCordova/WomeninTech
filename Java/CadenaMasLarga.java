public class CadenaMasLarga {
    public static void main(String[] args) {
        String[] cadenas = {"Hola", "Mundo", "Esta es una cadena larga", "Corta"};

        String cadenaMasLarga = "";
        int longitudMasLarga = 0;

        for (String cadena : cadenas) {
            if (cadena.length() > longitudMasLarga) {
                cadenaMasLarga = cadena;
                longitudMasLarga = cadena.length();
            }
        }

        if (longitudMasLarga > 0) {
            System.out.println("La cadena más larga es: " + cadenaMasLarga);
            System.out.println("Tiene una longitud de: " + longitudMasLarga);
        } else {
            System.out.println("No se encontraron cadenas.");
        }
    }
}
