package ejercicios;

import java.util.Scanner;

public class MayorIgualCero {
    public void comprobar () {
        Scanner datoIngresado = new Scanner(System.in);
        System.out.println("Este programa te indica si el primer número ingresado es mayor o igual a cero");

        System.out.println("Ingrese un número mayor a 0");
        Integer numero = Integer.parseInt(datoIngresado.nextLine());

        do {
            System.out.println(numero +" no es mayor a cero, ingrese nuevamente un número");
            numero = Integer.parseInt(datoIngresado.nextLine());
        } while (numero < 0);

        System.out.println(numero +" es igual o mayor a cero");
    }
}
