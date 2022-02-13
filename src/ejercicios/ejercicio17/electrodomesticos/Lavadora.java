package ejercicios.ejercicio17.electrodomesticos;

import ejercicios.ejercicio17.Electrodomestico;

public class Lavadora extends Electrodomestico {
    Double carga = 5.0;

    public Lavadora () {
    }

    public Lavadora (Double precio, Double peso) {
        this.precioBase = precio;
        this.peso = peso;
    }

    public void imprimir () {
        System.out.println(
                this.precioBase + "\n" +
                this.carga
        );
    }



}
