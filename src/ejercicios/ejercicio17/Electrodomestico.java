package ejercicios.ejercicio17;

public abstract class Electrodomestico {
    public String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
    public String[] consumos = {"a", "b", "c", "d", "e", "f"};
    public String color = colores[0];
    public String consumoEnergetico = consumos[consumos.length-1];
    public Double precioBase = 100.0;
    public Double peso = 5.0;


    public Electrodomestico () {
    }

    public Electrodomestico (Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico (String color, String consumoEnergetico, Double precioBase, Double peso) {
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getPeso() {
        return peso;
    }

    /**
     * Comprueba el consumo si el consumo energético ingresado existe, sino devuelve un valor por defecto.
     * @param letraIngresada Letra que ingresa el usuario
     * @return letra ingresada por el usuario o una por defecto
     */
    private String comprobarConsumoEnergetico(String letraIngresada) {
        String consumoPorDefecto = letraIngresada.toLowerCase();

        if (!consumos.toString().contains(letraIngresada.toLowerCase())) {
                consumoPorDefecto = consumos[consumos.length -1];
            }
        return consumoPorDefecto;
    }

    /**
     * Comprueba si el color ingresado por el usuario existe, sino devuelve un color por defecto
     * @param colorIngresado color ingresado por el usuario
     * @return color ingresado por el usuario o un color por defecto
     */
    private String comprobarColor(String colorIngresado) {
        String colorPorDefecto = colorIngresado.toLowerCase();
        if (!colores.toString().contains(colorIngresado)) {
            colorPorDefecto = colores[0];
        }
        return colorPorDefecto;
    }

    /**
     * Calcula el precio final, dependiendo del consumo energético y el peso
     * @return precio final con aumentos
     */
    public Double precioFinal() {
        Double precioConAumentos = this.precioBase;
        String consumoEnergeticoString = this.consumoEnergetico;

        switch (consumoEnergeticoString) {
            case "a":
                precioConAumentos += 100.0;
                break;
            case "b":
                precioConAumentos += 80.0;
                break;
            case "c":
                precioConAumentos += 60.0;
                break;
            case "d":
                precioConAumentos += 50.0;
                break;
            case "e":
                precioConAumentos += 30.0;
                break;
            case "f":
                precioConAumentos += 10.0;
                break;
        }

        if (this.peso < 20.0) {
            precioConAumentos += 10.0;
        } else if (this.peso >= 20.0 && this.peso < 50.0) {
            precioConAumentos += 50.0;
        } else if (this.peso >= 50.0 && this.peso < 80.0) {
            precioConAumentos += 80.0;
        } else if (this.peso >= 80.0) {
            precioConAumentos += 100.0;
        }
        return precioConAumentos;
    }

}
