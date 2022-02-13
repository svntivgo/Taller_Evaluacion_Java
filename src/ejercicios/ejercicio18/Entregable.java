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
     */
    public void isEntregado();

    /**
     * Compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
     * @param a
     */
    public void compareTo (Object a);
}
