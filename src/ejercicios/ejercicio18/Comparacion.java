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

        arraySeries[0].entregar();
        arraySeries[2].entregar();
        arraySeries[4].entregar();

        arrayVideoJuegos[0].entregar();
        arrayVideoJuegos[2].entregar();

        Integer contadorSeriesEntregadas = 0;
        Integer contadorVideoJuegosEntregados = 0;

        for (int i = 0; i < arraySeries.length; i++) {
            Boolean entregado = arraySeries[i].isEntregado();
            if (entregado == true) {
                contadorSeriesEntregadas++;
            }
        }

        for (int i = 0; i < arrayVideoJuegos.length; i++) {
            Boolean entregado = arrayVideoJuegos[i].isEntregado();
            if (entregado == true) {
                contadorVideoJuegosEntregados++;
            }
        }

        System.out.println("Hay "+ contadorSeriesEntregadas +" series entregadas");
        System.out.println("Hay "+ contadorVideoJuegosEntregados +" videojuegos entregados");

        for (int i = 0; i < arraySeries.length; i++) {
            Boolean entregado = arraySeries[i].isEntregado();
            if (entregado == true) {
                arraySeries[i].devolver();
            }
        }

        for (int i = 0; i < arrayVideoJuegos.length; i++) {
            Boolean entregado = arrayVideoJuegos[i].isEntregado();
            if (entregado == true) {
                arrayVideoJuegos[i].devolver();
            }
        }

        Integer recordTemporadas = 0;
        Integer serieRecord = 0;

        for (int i = 0; i < arraySeries.length; i++) {

            if (arraySeries[i].getNumeroDeTemporadas() > recordTemporadas) {
                recordTemporadas = arraySeries[i].getNumeroDeTemporadas();
                serieRecord = i;
            }
        }

        Integer recordHoras = 0;
        Integer juegoRecord = 0;

        for (int i = 0; i < arrayVideoJuegos.length; i++) {

            if (arrayVideoJuegos[i].getHorasEstimadas() > recordHoras) {
                recordHoras = arrayVideoJuegos[i].getHorasEstimadas();
                juegoRecord = i;
            }
        }

        System.out.println(
                "La serie con mas temporadas es:"+"\n"+
                arraySeries[serieRecord].toString())
        ;

        System.out.println(
                "El juego con mas horas es:"+"\n"+
                arrayVideoJuegos[juegoRecord].toString())
        ;
    }
}
