package ejercicios.ejercicio17;

import ejercicios.ejercicio17.electrodomesticos.Lavadora;
import ejercicios.ejercicio17.electrodomesticos.Television;

public class PrecioFinal {
    public void mostrar () {
        Electrodomestico arrayElectrodomesticos[] = new Electrodomestico[10];
        arrayElectrodomesticos[0] = new Television("Negro", "D",100.00,10.0,30.0,false);
        arrayElectrodomesticos[1] = new Television("Azul", "A",200.00,30.0,40.0,true);
        arrayElectrodomesticos[2] = new Television("Rojo", "C",300.00,40.0,50.0,false);
        arrayElectrodomesticos[3] = new Television("Gris", "F",400.00,20.0,60.0,true);
        arrayElectrodomesticos[4] = new Television("Blanco", "A",100.00,15.0,20.0,false);
        arrayElectrodomesticos[5] = new Lavadora("Negro","a",220.00,30.0,40.0);
        arrayElectrodomesticos[6] = new Lavadora("Blanco","b",150.00,50.0,10.0);
        arrayElectrodomesticos[7] = new Lavadora("Gris","a",250.00,40.0,12.0);
        arrayElectrodomesticos[8] = new Lavadora("Negro","c",120.00,70.0,24.0);
        arrayElectrodomesticos[9] = new Lavadora("Rojo","e",280.00,80.0,35.0);

        Double totalElectrodomesticos = 0.0;
        Double totalLavadoras = 0.0;
        Double totalTelevisiones = 0.0;

        for (int i = 0; i < arrayElectrodomesticos.length; i++) {
            if (arrayElectrodomesticos[i] instanceof Television) {
                Double precioFinal = arrayElectrodomesticos[i].precioFinal();
                totalTelevisiones += precioFinal;
                totalElectrodomesticos += precioFinal;
            } else if (arrayElectrodomesticos[i] instanceof Lavadora) {
                Double precioFinal = arrayElectrodomesticos[i].precioFinal();
                totalLavadoras += precioFinal;
                totalElectrodomesticos += precioFinal;
            }
        }
        System.out.println(
                "Total electrodomesticos: "+ totalElectrodomesticos + "\n" +
                        "Total lavadoras: "+ totalLavadoras + "\n" +
                        "Total de televisiones: "+ totalTelevisiones
        );
    }
}
