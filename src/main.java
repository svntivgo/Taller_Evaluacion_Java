import ejercicios.*;

public class main {
    public static void main(String[] args) {
        /**
         * Este ejercicio contempla el punto 1 del taller
         */
        MayorMenor ejercicio1 = new MayorMenor();
//        ejercicio1.comparar();

        /**
         * Este ejercicio contempla el punto 2 del taller
         */
        MayorMenor ejercicio2 = new MayorMenor();
//        ejercicio2.compararInput();

        /**
         * Este ejercicio contempla el punto 3 del taller
         */
        AreaCirculo ejercicio3 = new AreaCirculo();
//        ejercicio3.calcular();

        /**
         * Este ejercicio contemple el punto 4 del taller
         */
        PrecioIVA ejercicio4 = new PrecioIVA();
//        ejercicio4.calcular();

        /**
         * Este ejercicio contemple el punto 5 del taller
         */
        ParImpar ejercicio5 = new ParImpar();
//        ejercicio5.mostrarWhile();

        /**
         * Este ejercicio contemple el punto 6 del taller
         */
        ParImpar ejercicio6 = new ParImpar();
//        ejercicio6.mostrarFor();

        /**
         * Este ejercicio contemple el punto 7 del taller
         */
        MayorIgualCero ejercicio7 = new MayorIgualCero();
//        ejercicio7.comprobar();

        /**
         * Este ejercicio contemple el punto 8 del taller
         */
        DiaLaboral ejercicio8 = new DiaLaboral();
//        ejercicio8.comprobar();

        /**
         * Este ejercicio contemple el punto 9 del taller
         */
        Frase ejercicio9 = new Frase();
//        ejercicio9.modificar();

        /**
         * Este ejercicio contemple el punto 10 del taller
         */
        Frase ejercicio10 = new Frase();
//        ejercicio10.elimnarEspacios();

        /**
         * Este ejercicio contemple el punto 11 del taller
         */
        Frase ejercicio11 = new Frase();
//        ejercicio11.contabilizar();

        /**
         * Este ejercicio contemple el punto 12 del taller
         */
        Frase ejercicio12 = new Frase();
//        ejercicio12.comparar();

        /**
         * Este ejercicio contemple el punto 13 del taller
         */
        Fecha ejercicio13 = new Fecha();
//        ejercicio13.consultar();

        /**
         * Este ejercicio contemple el punto 14 del taller
         */
        Contador ejercicio14 = new Contador();
//        ejercicio14.contar();

        /**
         * Este ejercicio contemple el punto 15 del taller
         */
        MenuCinema ejercicio15 = new MenuCinema();
//        ejercicio15.mostrar();

        /**
         * Este ejercicio contemple el punto 16 del taller
         */
        Persona ejercicio16 = new Persona();
        ejercicio16.constructorCompleto("Santiago",  29, "1088297271", "H", 73, 183);
        System.out.println(ejercicio16.calcularIMC());

    }
}
