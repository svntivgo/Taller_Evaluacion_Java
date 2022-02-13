package ejercicios.ejercicio16;

public class Persona {
    protected String sexo = "H";
    private String nombre = "";
    private Integer edad = 0;
    private String dni;
    private Integer peso = 0;
    private Integer altura = 0;


    public Persona () {
        this.dni = generaDNI();
    }

    public Persona (String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
    }

    public Persona (String nombre, Integer edad, String sexo, Integer peso, Integer altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    /**
     * Calcula el IMC de una persona, la altura recibida debe estar en cm
     * Convierte la altura recibida a metros
     * @return -1: bajo de peso, 0: peso ideal, 1: sobrepeso
     */
    public Integer calcularIMC () {

        Double alturaEnMetros = (this.altura/100.0);
        Double imc = (this.peso / Math.pow(alturaEnMetros, 2));
        Integer resultado = 2;

        if (imc < 20) {
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else if (imc > 25){
            resultado = 1;
        }

        return resultado;
    }

    /**
     * Evalua si la persona supera la mayoría de edad (18 años)
     * @return true: es mayor de edad, false: menor de edad
     */
    public Boolean esMayorDeEdad () {
        Boolean resultado = null;
        if (this.edad >= 18) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    /**
     * Comprueba si se ingresó sexo en el constructor de persona
     * @param userInput string que ingresó el usuario por teclado
     * @return H: hombre, M: mujer
     */
    private String comprobarSexo (String userInput) {
        String sexoMayuscula = userInput.toUpperCase();

        if (!sexoMayuscula.contains("M")) {
            sexoMayuscula = "H";
        };
        return sexoMayuscula;
    }

    /**
     * Convierte a un string personalizado las llaves y valores del objeto
     * @return string personalizado las llaves y valores del objeto
     */
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

    /**
     * Genera un numero aleatorio Double convertido a entero de 8 cifras
     * @return numero DNI generado aleatoriamente
     */
    private String generaDNI () {
        Integer max = 99999999;
        Integer min = 10000000;
        Double numeroAleatorio = Math.random()*max + min;
        Integer numeroAleatorioEntero = numeroAleatorio.intValue();
        String numeroToString = numeroAleatorioEntero.toString();

        return numeroToString;

    }


}
