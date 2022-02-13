package ejercicios.ejercicio18;

public class Comparacion {
    public void mostrar () {
        Serie arraySeries[] = new Serie[5];
        Videojuego arrayVideoJuegos[] = new Videojuego[5];

        arraySeries[0] = new Serie("Friends",9,"Comedia","HBO");
        arraySeries[1] = new Serie("The Walking Dead",15,"Accion","Fox");
        arraySeries[2] = new Serie("Alf",5,"Comedia","HBO");
        arraySeries[3] = new Serie("Modern Family",10,"Comedia","Fox");
        arraySeries[4] = new Serie("Succession",3,"Drama","HBO");

        arrayVideoJuegos[0] = new Videojuego("God of War", 60,"Aventura","Ubisoft");
        arrayVideoJuegos[1] = new Videojuego("Call of Duty", 30,"Accion","Activision");
        arrayVideoJuegos[2] = new Videojuego("GTA V", 80,"Aventura","Rockstar");
        arrayVideoJuegos[3] = new Videojuego("Crash Bandicoot", 50,"Aventura","Naughty Dog");
        arrayVideoJuegos[4] = new Videojuego("Need for Speed", 30,"Conduccion","EA");

        System.out.println(arraySeries[0].isEntregado());
        arraySeries[0].entregar();
        System.out.println(arraySeries[0].isEntregado());
        arraySeries[0].devolver();
        System.out.println(arraySeries[0].isEntregado());
        arraySeries[0].entregar();
        System.out.println(arraySeries[0].isEntregado());
    }
}
