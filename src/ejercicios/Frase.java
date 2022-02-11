package ejercicios;

import java.util.Scanner;

public class Frase {
    /**
     * Reemplaza las letras a por e, y concatena dos frases.
     */
    public void modificar () {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseModificada = frase.replace("a", "e");
        System.out.println("Ingrese una frase");
        Scanner fraseIngresada = new Scanner(System.in);
        String fraseFinal = fraseModificada +", "+ fraseIngresada.nextLine();
        System.out.println(fraseFinal);
    }
}
