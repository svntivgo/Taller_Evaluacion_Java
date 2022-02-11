package ejercicios;

import java.util.Scanner;

public class DiaLaboral {
    public void comprobar () {
        Scanner diaIngresado = new Scanner(System.in);
        System.out.println("Este programa indica si el día ingresado es laboral");
        System.out.println("Ingrese un día de la semana");
        String diaSemana = diaIngresado.nextLine();
        diaSemana.toLowerCase();
        System.out.println(diaSemana);
        String msgLaboral = diaSemana +" es un día laboral";
        String msgNoLaboral = diaSemana +" no es un día laboral";

        switch (diaSemana) {
            case "lunes":
                System.out.println(msgLaboral);
                break;
            case "martes":
                System.out.println(msgLaboral);
                break;
            case "miercoles":
                System.out.println(msgLaboral);
                break;
            case "miércoles":
                System.out.println(msgLaboral);
                break;
            case "jueves":
                System.out.println(msgLaboral);
                break;
            case "viernes":
                System.out.println(msgLaboral);
                break;
            case "sabado":
                System.out.println(msgLaboral);
                break;
            case "sábado":
                System.out.println(msgLaboral);
                break;
            case "domingo":
                System.out.println(msgNoLaboral);
                break;
            default:
                System.out.println(diaSemana +" no es un día de la semana");
                break;
        }
    }
}
