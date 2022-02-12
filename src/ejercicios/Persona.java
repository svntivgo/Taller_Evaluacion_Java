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

    private String comprobarSexo (String sexo) {
        String sexoMayuscula = sexo.toUpperCase();

        if (!sexoMayuscula.contains("M")) {
            sexoMayuscula = "H";
        };
        return sexoMayuscula;
    }

    public String toString () {
        String informacion =
                "Nombre: "+ this.nombre + "\n" +
                "Edad: "+ this.edad + "\n" +
                "DNI: "+ this.dni + "\n" +
                "Sexo: "+ this.sexo + "\n" +
                "Peso: "+ this.peso + "\n" +
                "Altura: "+ this.altura;
        return informacion;
    }

    private Integer generaDNI () {
        Integer max = 99999999;
        Integer min = 10000000;
        Double numeroAleatorio = Math.random()*max + min;
        Integer numeroAleatorioEntero = numeroAleatorio.intValue();

        return numeroAleatorioEntero;

    }


}
