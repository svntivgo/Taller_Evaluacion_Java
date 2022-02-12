package ejercicios;

import javax.swing.*;

public class BienestarPersonal {
    public void personaCompleto () {
        String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre usuario 1").toUpperCase();
        Integer edadIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad usuario 1"));
        String sexoIngresado = JOptionPane.showInputDialog("Ingrese el sexo usuario 1 (H si es hombre, M si es mujer)").toUpperCase();
        Integer pesoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso usuario 1"));
        Integer alturaIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura en centimetros usuario 1"));

        Persona usuario_uno = new Persona();
        usuario_uno.constructorCompleto(nombreIngresado,edadIngresado,sexoIngresado,pesoIngresado,alturaIngresado);
        Integer imc = usuario_uno.calcularIMC();
        Boolean mayorEdad = usuario_uno.esMayorDeEdad();
        String resultadoImc = "";
        String resultadoMayorEdad;

        switch (imc) {
            case -1:
                resultadoImc = "Está por debajo del peso ideal";
                break;
            case 0:
                resultadoImc = "Está en el peso ideal";
                break;
            case 1:
                resultadoImc = "Está por encima del peso ideal";
                break;
        }

        if (mayorEdad) {
            resultadoMayorEdad = "Es mayor de edad";
        } else {
            resultadoMayorEdad = "Es menor de edad";
        }

        String mensaje =
                usuario_uno.toString() + "\n" +
                resultadoImc + "\n" +
                resultadoMayorEdad;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void personaBasico () {
        String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre usuario 2").toUpperCase();
        Integer edadIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad usuario 2"));
        String sexoIngresado = JOptionPane.showInputDialog("Ingrese el sexo usuario 2 (H si es hombre, M si es mujer)").toUpperCase();

        Persona usuario_dos = new Persona();
        usuario_dos.constructorBasico(nombreIngresado,edadIngresado,sexoIngresado);
    }

    public void personaManual () {
        String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre usuario 3").toUpperCase();
        Integer edadIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad usuario 3"));
        String sexoIngresado = JOptionPane.showInputDialog("Ingrese el sexo usuario 3 (H si es hombre, M si es mujer)").toUpperCase();
        Integer pesoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso usuario 3"));
        Integer alturaIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura en centimetros usuario 3"));

        Persona usuario_tres = new Persona();
        usuario_tres.setNombre(nombreIngresado);
        usuario_tres.setEdad(edadIngresado);
        usuario_tres.setSexo(sexoIngresado);
        usuario_tres.setPeso(pesoIngresado);
        usuario_tres.setAltura(alturaIngresado);
    }
}
