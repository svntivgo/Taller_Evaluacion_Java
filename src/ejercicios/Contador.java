package ejercicios;

import javax.swing.*;
import java.util.Arrays;

public class Contador {
    /**
     * Muestra los numeros que existen entre numero ingresado y mil, contando de 2 en 2
     */
    public void contar() {
        String numeroIngresado = JOptionPane.showInputDialog("Ingrese un número menor a mil");
        Integer numero = Integer.parseInt(numeroIngresado);
        Integer[] arreglo = new Integer[500];
        String resultado = "";

        for (int i = 0; numero <= 1000; i++) {
            arreglo[i] = numero;
            resultado += arreglo[i].toString() + " ";
            numero += 2;
        }
        JOptionPane.showMessageDialog(null, resultado);

    }

}
