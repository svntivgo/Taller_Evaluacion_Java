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

    public Television (String color, String consumoEnergetico, Double precioBase, Double peso, Double resolucion, Boolean sintonizadorTdt) {
        super(color, consumoEnergetico, precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    /**
     * Adiciona al precio final si el tv tiene más de 40 pulgadas
     * @return precio final y si cumple el requisito se suma 50 más
     */
    @Override
    public Double precioFinal() {
        Double precioAumentado = 0.0;

        if (this.resolucion > 40.0) {
            precioAumentado = 50.0;
        }

        return super.precioFinal() + precioAumentado;
    }
}
