import java.awt.Component;
import javax.swing.JOptionPane;
public class CuentaBancaria {
    /** Atributos */
    private String numcuenta;
    private String nombreTitular;
    private double saldoAc;
    private String tipoCuenta;

    /** Constructores*/
    public CuentaBancaria() {
    }

    public CuentaBancaria(String numcuenta, String nombreTitular, double saldoAc, String tipoCuenta) {
        this.numcuenta = numcuenta;
        this.nombreTitular = nombreTitular;
        this.saldoAc = saldoAc;
        this.tipoCuenta = tipoCuenta;
    }
/** Metodos JAVA */
    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldoAc() {
        return saldoAc;
    }

    public void setSaldoAc(double saldoAc) {
        this.saldoAc = saldoAc;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /** METODOS DEL PROGRAMADOR */

    public void deposito(double monto){
        System.out.println("Ingrese el monto a agregar: ");
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el aumento de " + this.getNombreTitular() +": "));
        String mensaje = "Saldo en la cuenta: " + this.saldoAc;

        this.saldoAc += monto;

        mensaje += "\n\nMonto actualizado: "+ this.getSaldoAc();
        JOptionPane.showMessageDialog((Component)null, mensaje);

    }
    public void retiro (double monto){
        System.out.println("Ingrese el monto a quitar: ");
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el retiro de " + this.getNombreTitular() +": "));
        if (monto<=saldoAc){
            String aviso = "Saldo en la cuenta: " + this.saldoAc;
            this.saldoAc -=monto;

            aviso += "\n\nMonto actualizado: "+ this.getSaldoAc();

            JOptionPane.showMessageDialog((Component)null, aviso);
        }
        else{
            System.out.println("Fondos insuficientes, por favor agregar saldo");
        }
    }
    public void imprimirCuenta(){
        String mensaje = "\nNombre del titular: " + this.nombreTitular + "\n"
                + "Numero de cuenta: " + this.numcuenta + " \n "
                + "Tipo de cuenta: " + this.tipoCuenta + " \n "
                + "Saldo actual: " + this.getSaldoAc();
        JOptionPane.showMessageDialog((Component)null, mensaje);
    }

}