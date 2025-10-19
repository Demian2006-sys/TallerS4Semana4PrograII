import java.awt.Component;
import javax.swing.JOptionPane;
/** Creacion de clases y atributos*/
public class Empleado {
    private String apellidoP;
    private String primerN;
    private double salario;
    
    /**Declaracion de Constructores*/

    public Empleado() {
    }

    public Empleado(String apellidoP, String primerN, double salario) {
        this.apellidoP = apellidoP;
        this.primerN = primerN;
        this.salario = salario;
    }
        /**METODOS JAVA */

    public String getApellidoP() {
        return this.apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getPrimerN() {
        return this.primerN;
    }

    public void setPrimerN(String primerN) {
        this.primerN = primerN;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /** Metodos del programador*/

    public void imprimirDatos() {
        String var10000 = this.primerN;
        String mensaje = "\nNombre y apellido del empleado: " + var10000 + " " + this.apellidoP + "\n\nSalario del empleado: " + this.getSalario();
        JOptionPane.showMessageDialog((Component)null, mensaje);
    }

    public void aumento() {
        String mensaje = "Salario original: " + this.salario;
        this.salario += this.salario * 0.1;
        mensaje = mensaje + "\n\nSalario con aumento: " + this.getSalario();
        JOptionPane.showMessageDialog((Component)null, mensaje);
    }
}


