package ejercicios.ejercicio18;

public class Videojuego implements Entregable {
    private String titulo = "";
    private Integer horasEstimadas = 10;
    private Boolean entregado = false;
    private String genero = "";
    private String compañia = "";

    public Videojuego () {

    }

    public Videojuego (String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego (String titulo, Integer horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }


    /**
     * Cambia el atributo entregado a true
     */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    /**
     * Cambia el atributo entregado a false
     */
    @Override
    public void devolver() {
        this.entregado = false;
    }

    /**
     * Devuelve el estado del atributo entregado
     * @return
     */
    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    /**
     * Compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
     *
     * @param a
     */
    @Override
    public String compareTo(Object a) {
        String mensaje = "";
        return mensaje;
    }
}
