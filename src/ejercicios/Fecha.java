package ejercicios;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
    /**
     * muestra en consola la fecha con el formato (AAAA/MM/DD) (HH:MM:SS)
     */
    public void consultar () {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("(yyyy/mm/dd) (hh:mm:ss)");
        System.out.println(fecha.format(formatoFecha));
    }
}
