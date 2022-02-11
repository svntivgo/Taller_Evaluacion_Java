package ejercicios;

public class MayorMenor {
    private int num_a = 5;
    private int num_b = 5;

    public void comparador(){
        if (num_a > num_b) {
            System.out.println("Es mayor");
        } else if (num_a < num_b) {
            System.out.println("es menor");
        } else {
            System.out.println("son iguales");
        }
    }
}
