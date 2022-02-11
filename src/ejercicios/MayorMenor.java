package ejercicios;

import java.util.Scanner;

public class MayorMenor {
    /**
     * Compara el primer número ingresado con el segundo
     */
    public void comparar(){
        Scanner numero = new Scanner(System.in);
        System.out.println("Este programa te indica si el primer número ingresado es mayor al segundo");

        System.out.println("Ingrese el primer número número");
        Integer numero_a = Integer.parseInt(numero.nextLine());

        System.out.println("Ingrese el segundo número número");
        Integer numero_b = Integer.parseInt(numero.nextLine());

        if (numero_a > numero_b) {
            System.out.println(numero_a +" es mayor que "+ numero_b);
        } else if (numero_a < numero_b) {
            System.out.println(numero_a +" es menor que "+ numero_b);
        } else {
            System.out.println(numero_a +" es igual a "+ numero_b);
        }
    }
}
