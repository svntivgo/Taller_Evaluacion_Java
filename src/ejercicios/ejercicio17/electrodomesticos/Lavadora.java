package ejercicios.ejercicio17.electrodomesticos;

import ejercicios.ejercicio17.Electrodomestico;

public class Lavadora extends Electrodomestico {
    Double carga;

    public Lavadora () {
        this.carga = 5.0;
    }

    public void imprimir () {
        System.out.println(
                this.getColor() + "\n" +
                this.carga
        );
    }



}
