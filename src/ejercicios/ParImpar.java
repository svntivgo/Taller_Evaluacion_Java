package ejercicios;

import java.util.Scanner;

public class ParImpar {
    private Integer numeroInicial = 1;
    private Integer numeroFinal = 100;
    private Boolean mostrarPares;
    private Integer resultado;

    /**
     * Presenta las instrucciones y opciones al usuario
     * @return Booleano que representa la opcion a ejecutar, par o impar
     */
    public Boolean instrucciones () {
        System.out.println("Este programa muestra los números impares o pares del 1 al 100");
        System.out.println("Instrucciones de uso");
        System.out.println("Ingrese 1 si desea ver números pares");
        System.out.println("Ingrese 2 si desea ver números impares");
        Scanner numero = new Scanner(System.in);
        Integer datoIngresado = Integer.parseInt(numero.nextLine());
        Boolean solicitud = null;
        System.out.println(datoIngresado);

        if (datoIngresado <= 2 || datoIngresado >= 1) {
            switch (datoIngresado) {
                case 1:
                    System.out.println("Se mostrarán los números pares");
                    solicitud = true;
                    break;
                case 2:
                    System.out.println("Se mostrarán los números impares");
                    solicitud = false;
                    break;
                default:
                    System.out.println("No ingresó una opción válida");
                    break;
            }
        }
        return mostrarPares = solicitud;
    }

    /**
     * Muestra en consola numeros pares o impares desde el 1 al 100
     */
    public void mostrarWhile () {
        instrucciones();
        while (numeroInicial <= numeroFinal) {
            if (numeroInicial%2 == 0 && mostrarPares) {
                System.out.println(numeroInicial);
            } else if (numeroInicial%2 != 0 && !mostrarPares) {
                System.out.println(numeroInicial);
            }
            numeroInicial++;

        }
    }

    /**
     * Muestra en consola numeros pares desde el 1 al 100
     */
    public void mostrarFor () {
        instrucciones();
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0 && mostrarPares) {
                System.out.println(i);
            } else if (i%2 != 0 && !mostrarPares) {
                System.out.println(i);
            }

        }
    }
}
