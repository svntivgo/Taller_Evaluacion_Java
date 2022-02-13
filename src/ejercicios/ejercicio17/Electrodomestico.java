package ejercicios.ejercicio17;

public abstract class Electrodomestico {
    public String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
    public Character[] consumos = {'a', 'b', 'c', 'd', 'e', 'f'};
    public String color = colores[0];
    public Character consumoEnergetico = consumos[consumos.length-1];
    public Double precioBase = 100.0;
    public Double peso = 5.0;


    public Electrodomestico () {
    }

    public Electrodomestico (Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico (String color, Character consumoEnergetico, Double precioBase, Double peso) {
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getPeso() {
        return peso;
    }

    private Character comprobarConsumoEnergetico(Character letraIngresada) {
        Character consumoPorDefecto = letraIngresada;
        if (!consumos.toString().contains(letraIngresada.toString())) {
                consumoPorDefecto = consumos[consumos.length -1];
            }
        return consumoPorDefecto;
    }

    private String comprobarColor(String colorIngresado) {
        String colorPorDefecto = colorIngresado;
        if (!colores.toString().contains(colorIngresado)) {
            colorPorDefecto = colores[0];
        }
        return colorPorDefecto;
    }

    public Double precioFinal() {
        Double precioConAumentos = this.precioBase;
        switch (this.consumoEnergetico) {
            case 'a':
                precioConAumentos += 100.0;
                break;
            case 'b':
                precioConAumentos += 80.0;
                break;
            case 'c':
                precioConAumentos += 60.0;
                break;
            case 'd':
                precioConAumentos += 50.0;
                break;
            case 'e':
                precioConAumentos += 30.0;
                break;
            case 'f':
                precioConAumentos += 10.0;
                break;
        }

        if (this.peso < 20) {
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
