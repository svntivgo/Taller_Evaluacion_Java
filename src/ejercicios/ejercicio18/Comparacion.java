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
        arrayVideoJuegos[2] = new Videojuego("Call of Duty", 30,"Accion","Activision");
        arrayVideoJuegos[3] = new Videojuego("GTA V", 80,"Aventura","Rockstar");
        arrayVideoJuegos[4] = new Videojuego("Crash Bandicoot", 50,"Aventura","Naughty Dog");
        arrayVideoJuegos[5] = new Videojuego("Need for Speed", 30,"Conduccion","EA");


    }
}
