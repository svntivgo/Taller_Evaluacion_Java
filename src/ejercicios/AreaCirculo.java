package ejercicios;

import javax.swing.*;

public class AreaCirculo {
    /**
     * Calcula el área de un círculo con su radio
     */
    public void calcular () {
        String numero = JOptionPane.showInputDialog("Ingrese el radio en metros");
        System.out.println("Este programa indica el área de un círculo dado su radio en metros");

        double radio = Double.parseDouble(numero);

        double areaCirculo = Math.PI * Math.pow(radio, 2);

        JOptionPane.showMessageDialog(
                null,
                "El area del círculo es: "+ String.format("%.2f", areaCirculo) +" metros cuadrados"
        );
    }
}
