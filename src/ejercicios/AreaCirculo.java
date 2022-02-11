package ejercicios;

import java.util.Scanner;

public class AreaCirculo {
    /**
     * Calcula el área de un círculo con su radio
     */
    public void calcular () {
        Scanner numero = new Scanner(System.in);
        System.out.println("Este programa indica el área de un círculo dado su radio en metros");

        System.out.println("Ingrese el radio en metros");
        double radio = Double.parseDouble(numero.nextLine());

        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El radio del círculo es: "+ areaCirculo +" metros cuadrados");
    }
}
