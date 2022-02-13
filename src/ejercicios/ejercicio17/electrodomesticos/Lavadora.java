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

    public Lavadora (String color, String consumoEnergetico, Double precioBase, Double peso, Double carga) {
        super(color, consumoEnergetico,precioBase,peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    /**
     * Si la lavadora pesa mas de 30.0 se adicionan 50.0 al precio final
     * @return nuevo precio final
     */
    @Override
    public Double precioFinal() {
        Double precioAumentado = 0.0;

        if (this.carga > 30.0) {
            precioAumentado = 50.0;
        }

        return super.precioFinal() + precioAumentado;
    }

}
