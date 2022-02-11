package ejercicios;

import javax.swing.*;

public class MayorIgualCero {
    public void comprobar () {
        String datoIngresado = JOptionPane.showInputDialog("Ingrese un número mayor a cero");
        System.out.println("Este programa te indica si el primer número ingresado es mayor o igual a cero");

        Integer numero = Integer.parseInt(datoIngresado);

        do {
            datoIngresado = JOptionPane.showInputDialog(numero +" no es mayor a cero, ingrese un número");
            numero = Integer.parseInt(datoIngresado);
        } while (numero < 0);

        System.out.println(numero +" es igual o mayor a cero");
    }
}
