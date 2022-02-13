package ejercicios.ejercicio17.electrodomesticos;

import ejercicios.ejercicio17.Electrodomestico;

public class Television extends Electrodomestico {
    private Double resolucion = 20.0;
    private Boolean sintonizadorTdt = false;

    public Television () {

    }

    public Television (Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Television (String color, Character consumoEnergetico, Double precioBase, Double peso, Double resolucion, Boolean sintonizadorTdt) {
        super(color, consumoEnergetico, precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }
}
