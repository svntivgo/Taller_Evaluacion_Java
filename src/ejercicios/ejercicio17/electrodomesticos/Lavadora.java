package ejercicios.ejercicio17.electrodomesticos;

import ejercicios.ejercicio17.Electrodomestico;

public class Lavadora extends Electrodomestico {
    private Double carga = 5.0;

    public Lavadora () {
    }

    public Lavadora (Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Lavadora (String color, Character consumoEnergetico, Double precioBase, Double peso, Double carga) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.precioBase = precioBase;
        this.peso = peso;
        this.carga = carga;
    }

    public void imprimir () {
        System.out.println(
                this.precioBase + "\n" +
                this.carga
        );
    }



}
