package ejercicios;

import javax.swing.*;

public class PrecioIVA {

    /**
     * Calcula el precio final con IVA
     */
    public void calcular() {
        final Double iva = 0.21;

        String numero = JOptionPane.showInputDialog("Ingrese el precio");
        System.out.println("Este programa suma el IVA del 21% al precio de un producto o servicio");

        double precio = Double.parseDouble(numero);

        double total = precio + (precio * iva);
        JOptionPane.showMessageDialog(
                null,
                "El precio + IVA es: $"+ String.format("%.2f", total)
        );

    }

}
