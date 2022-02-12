package ejercicios;

import java.util.Scanner;

public class MenuCinema {
    String menu =
            "****** GESTION CINEMATOGRÁFICA ********"+ "\n"+
            "1-NUEVO ACTOR"+ "\n"+
            "2-BUSCAR ACTOR"+ "\n"+
            "3-ELIMINAR ACTOR"+ "\n"+
            "4-MODIFICAR ACTOR"+ "\n"+
            "5-VER TODOS LOS ACTORES"+ "\n"+
            "6- VER PELICULAS DE LOS ACTORES"+ "\n"+
            "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES"+ "\n"+
            "8-SALIR";

    /**
     * Muestra el menú y procesa opciones ingresadas por consola
     */
    public void mostrar () {
        Boolean salir = false;
        System.out.println(menu);

        do {
            Scanner inputConsola = new Scanner(System.in);
            String seleccionUsuario = inputConsola.nextLine();
            switch (seleccionUsuario) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    System.out.println("Salió del menú");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    System.out.println(menu);
                    break;
            }
        } while (!salir);

    }
}
