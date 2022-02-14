package ejercicios.ejercicio18;

public class Serie implements Entregable, Comparable {
    private String titulo = "";
    private Integer numeroDeTemporadas = 3;
    private Boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie () {

    }

    public Serie (String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie (String titulo, Integer numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return  "La serie tiene como titulo " + titulo +
                ", tiene " + numeroDeTemporadas + " temporadas" +
                ", pertenece al genero " + genero +
                ", y su creador es " + creador ;
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
     *
     * @return estado de la entrega
     */
    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
