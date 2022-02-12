package ejercicios;

public class Persona {
    private final String hombre = "H";
    private final String mujer = "M";
    private String nombre, dni, sexo;
    private Integer edad, peso, altura, pesoBajo, pesoIdeal, pesoAlto;

    public Persona () {
        this.nombre = "";
        this.edad = 0;
        this.dni = null;
        this.sexo = "";
        this.peso = 0;
        this.altura = 0;
    }

    public void constructorBasico (String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void constructorCompleto (String nombre, Integer edad, String dni, String sexo, Integer peso, Integer altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer calcularIMC () {
        Double alturaEnMetros = (this.altura/100.0);
        Double imc = (this.peso / Math.pow(alturaEnMetros, 2));
        Integer resultado = null;

        if (imc < 20) {
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }

        return resultado;
    }

    public Boolean esMayorDeEdad () {
        Boolean resultado = false;
        if (this.edad >= 18) {
            resultado = true;
        }
        return resultado;
    }


}
