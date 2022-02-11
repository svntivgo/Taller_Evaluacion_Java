package ejercicios;

import java.util.Scanner;

public class PrecioIVA {

    /**
     * Calcula el precio final con IVA
     */
    public void calcular() {
        final Double iva = 0.21;

        Scanner numero = new Scanner(System.in);
        System.out.println("Este programa suma el IVA del 21% al precio de un producto o servicio");

        System.out.println("Ingrese el precio");
        double precio = Double.parseDouble(numero.nextLine());

        double total = precio + (precio * iva);
        System.out.println("El precio + IVA es: $"+ String.format("%.2f", total));

    }

}
