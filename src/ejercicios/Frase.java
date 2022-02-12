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

    /**
     * Contabiliza la longitud de una frase y la cantidad de cada vocal
     */
    public void contabilizar () {
        System.out.println("Ingrese una frase");
        Scanner fraseIngresada = new Scanner(System.in);
        String frase = fraseIngresada.nextLine();
        frase = frase.toLowerCase();
        System.out.println(frase.length());

        Integer a = 0;
        Integer e = 0;
        Integer i = 0;
        Integer o = 0;
        Integer u = 0;

        for (int x = 0; x < frase.length(); x++) {
            switch (frase.charAt(x)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("La frase contiene "+ a +" a");
        System.out.println("La frase contiene "+ e +" e");
        System.out.println("La frase contiene "+ i +" i");
        System.out.println("La frase contiene "+ o +" o");
        System.out.println("La frase contiene "+ u +" u");
    }
}
