package ejercicios;

import javax.swing.*;
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

    /**
     * Elimina los espacios de una frase ingresada por Input Dialog y la muestra por consola
     */
    public void elimnarEspacios () {
        String frase = JOptionPane.showInputDialog("Ingrese una frase");
        String fraseModificada = frase.replace(" ", "");
        System.out.println(fraseModificada);
    }
}
