package ejercicios.ejercicio18;

public interface Entregable {
    /**
     * Cambia el atributo entregado a true
     */
    public void entregar();

    /**
     * Cambia el atributo entregado a false
     */
    public void devolver();

    /**
     * Devuelve el estado del atributo entregado
     * @return estado de la entrega
     */
    public Boolean isEntregado();
}
