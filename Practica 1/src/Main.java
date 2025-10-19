/** Ejercicio 1: La clase CuentaBancaria
Cree una clase llamada CuentaBancaria que un banco podría utilizar para gestionar las cuentas de sus clientes. Una CuentaBancaria debe incluir cuatro variables de instancia: número de cuenta (tipo String), nombre del titular (tipo String), saldo actual (tipo double) y tipo de cuenta (tipo String - puede ser "Ahorro" o "Corriente").
Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de instancia. 
Además, proporcione dos métodos: */

import javax.swing.JOptionPane;
import java.awt.Component;
public class Main {
    /**
     * Declaracion de Objetos
     */
    public static void main(String[] args) {
        CuentaBancaria titular1 = new CuentaBancaria("A100B42", "Demian Durand", 450.15, "Ahorro");
        CuentaBancaria titular2 = new CuentaBancaria();

        int opc;
        int conf=0;
        do{
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar titular, cuenta y saldo");
            System.out.println("2. Agregar saldo");
            System.out.println("3. Retirar saldo");
            System.out.println("4. Mostrar informacion del titular");
            System.out.println("5. Salir");
            System.out.print(">> ");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:"));
            switch (opc){
                case 1:
                    if(conf==0){
                        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre completo del titular: ");
                        String tipoC = JOptionPane.showInputDialog("Ingrese tipo de cuenta de " + nombre1 + "(Ahorro o Corriente): ");
                        String numeroC1 = JOptionPane.showInputDialog("Ingrese el numero de cuenta de " + nombre1 + ": ");
                        double saldoT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo de " + nombre1 + ": "));
                        titular2.setNombreTitular(nombre1);
                        titular2.setNumcuenta(numeroC1);
                        titular2.setTipoCuenta(tipoC);
                        titular2.setSaldoAc(saldoT);
                        conf++;
                    }
                    else{
                        System.out.println("Numero de titulares maximo alcanzado");
                        break;
                    }
                    break;
                case 2:
                    if (conf==0){
                        System.out.println("No hay un titular ingresado, nomas el de prueba");
                        break;
                    }
                    else{
                        int opc2;
                        System.out.println("Ingrese el titular al cual agregar mas saldo: ");
                        System.out.println("1. " + titular1.getNombreTitular());
                        System.out.println("2. " + titular2.getNombreTitular());
                        System.out.print(">> ");
                        opc2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el titular al cual agragar mas saldo: "));
                        if (opc2==1){
                            titular1.deposito(titular1.getSaldoAc());
                        } else if (opc==2) {
                            titular2.deposito(titular2.getSaldoAc());
                        }
                    }
                    break;
                case 3:
                    int opcf;
                    if (conf==0){
                        System.out.println("No hay un titular ingresado, nomas el de prueba");
                        break;
                    }
                    else{
                        System.out.println("Ingrese el titular al cual retirar saldo: ");
                        System.out.println("1. " + titular1.getNombreTitular());
                        System.out.println("2. " + titular2.getNombreTitular());
                        System.out.print(">> ");
                        opcf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el titular al cual retirar saldo: "));
                        if (opcf==1){
                            titular1.retiro(titular1.getSaldoAc());
                        } else if (opcf==2) {
                            titular2.retiro(titular2.getSaldoAc());
                        }
                    }
                    break;
                case 4:
                    int opcff;
                    if (conf==0){
                        System.out.println("No hay un titular ingresado, nomas el de prueba");
                        break;
                    }
                    else{
                        System.out.println("Ingrese el titular al cual mostrar informacion: ");
                        System.out.println("1. " + titular1.getNombreTitular());
                        System.out.println("2. " + titular2.getNombreTitular());
                        System.out.print(">> ");
                        opcff = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el titular al cual mostrar informacion: "));
                        if (opcff==1){
                            titular1.imprimirCuenta();
                        } else if (opcff==2) {
                            titular2.imprimirCuenta();
                        }
                    }
                    break;
                case 5:
                    System.out.println("BYE BYEEEE");
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }
        }while(opc != 5);

    }
}
