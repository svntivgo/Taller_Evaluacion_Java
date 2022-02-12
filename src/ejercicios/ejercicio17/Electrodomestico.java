package ejercicios.ejercicio17;

public abstract class Electrodomestico {
    private String color, consumoEnergetico;
    private Double precioBase, peso;

    public void electrodomestico (String color, String consumoEnergetico, Double precioBase, Double peso) {
        this.color = "blanco";
        this.consumoEnergetico = "F";
        this.precioBase = 100.0;
        this.peso = 5.0;
    }
}
