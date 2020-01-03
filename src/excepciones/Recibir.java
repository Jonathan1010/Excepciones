package excepciones;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public final class Recibir extends Excepciones {

    //falta poner excepcion
    private String correo = "@/.";
    private String arroba = "@/.";

    public Recibir() {
        this.correo();
    }

    public void setCorreo4(String Correo4) {
        this.correo = Correo4;
    }

    public String getArroba() {
        return arroba;
    }

    public void setArroba(String arroba) {
        this.arroba = arroba;
    }

    public String correo() {
        String Arroba = "@";
        String punto = ".";
        
        correo = JOptionPane.showInputDialog("Ingrese su correo electronico");
        try {
            if (Character.isDigit(123456789)) {
                JOptionPane.showMessageDialog(null, "No puede ingresar numeros");
            }

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error ");}
        try {
            if (Character.isDigit(Arroba) && Character.isDigit(Punto)) {
                JOptionPane.showMessageDialog(null, "No ingrese numeros");
            }

            } catch (InputMismatchException ex) {
                JOptionPane.showMessageDialog(null, "Minimo ingresar punto y arroba");
            }

        
        return correo;

    }

}
