import javax.swing.JOptionPane;

/** 3.13 (La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de
 * instancia: un primer nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double).
 * Su clase debe tener un constructor que inicialice las tres variables de instancia. Proporcione un método establecer
 * y un método obtener para cada variable de instancia. Si el salario mensual no es positivo, no establezca su valor.
 * Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.
 * Cree dos objetos Empleado y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento
 * del 10% y muestre el salario anual de cada Empleado otra vez.*/

public class Main {
        /** Declaracion de Objetos */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();

        int opc;
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar empleado y sueldo");
            System.out.println("2. Agregar aumento");
            System.out.println("3. Mostrar datos empleados");
            System.out.println("4. Salir");
            System.out.print(">> ");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:"));
            switch (opc) {
                case 1:
                    System.out.println("Seleccione el empleado para agregar: ");
                    System.out.println("1. Empleado 1");
                    System.out.println("2. Empleado 2");
                    System.out.print(">> ");
                    int opc2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el empleado para agregar:\n1. Empleado 1\n2. Empleado 2"));
                    if (opc2 == 1) {
                        String nm1 = JOptionPane.showInputDialog("Ingrese el primer nombre del empleado " + opc2 + ":");
                        String ap1 = JOptionPane.showInputDialog("Ingrese el primer apellido de " + nm1 + ":");
                        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo de " + nm1 + " " + ap1 + ":"));
                        emp1.setPrimerN(nm1);
                        emp1.setApellidoP(ap1);
                        emp1.setSalario(salario1);
                        emp1.imprimirDatos();
                    } else if (opc2 == 2) {
                        String nm2 = JOptionPane.showInputDialog("Ingrese el primer nombre del empleado " + opc2 + ":");
                        String ap2 = JOptionPane.showInputDialog("Ingrese el primer apellido de " + nm2 + ":");
                        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo de " + nm2 + " " + ap2 + ":"));
                        emp2.setPrimerN(nm2);
                        emp2.setApellidoP(ap2);
                        emp2.setSalario(salario2);
                        emp2.imprimirDatos();
                    } else {
                        System.out.println("Valor incorrecto");
                    }
                    break;
                case 2:
                    System.out.println("Seleccione el empleado para agregar aumento del 10%: ");
                    System.out.println("1. Empleado 1");
                    System.out.println("2. Empleado 2");
                    int opc3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el empleado para agregar aumento del 10%:\n1. Empleado 1\n2. Empleado 2"));
                    if (opc3 == 1) {
                        emp1.aumento();
                    } else if (opc3 == 2) {
                        emp2.aumento();
                    }
                    break;
                case 3:
                    emp1.imprimirDatos();
                    emp2.imprimirDatos();
            }
        } while(opc != 4);

    }
}
