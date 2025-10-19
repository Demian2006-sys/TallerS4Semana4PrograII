import javax.swing.*;

/**(La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día (tipo int) y un año (tipo int).
 Su clase debe tener un constructor que inicialice las tres variables de instancia,
 y debe asumir que los valores que se proporcionan son correctos.
 Proporcione un método establecer y un método obtener para cada variable de instancia.
 Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/).
 Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha. */

public class Main {
    public static void main(String[] args) {
        /**Creacion del objeto y el metodo de lectura (Scanner)*/
        Fecha fechap = new Fecha();

        /**Creacion de variables*/
        int dia = 0, mes = 0, ano = 0;
        String entrada;

        /**Lectura de datos*/

        // Lectura del día
        do {
            entrada = JOptionPane.showInputDialog("Ingrese el día (1 - 31): ");
            try {
                dia = Integer.parseInt(entrada);
                if (dia >= 1 && dia <= 31) {
                    fechap.setDia(dia);
                } else {
                    JOptionPane.showMessageDialog(null, "Día inválido. Ingrese un valor entre 1 y 31.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número entero para el día.");
            }
        } while (dia < 1 || dia > 31);

        // Lectura del mes
        do {
            entrada = JOptionPane.showInputDialog("Ingrese el mes (1 - 12): ");
            try {
                mes = Integer.parseInt(entrada);
                if (mes >= 1 && mes <= 12) {
                    fechap.setMes(mes);
                } else {
                    JOptionPane.showMessageDialog(null, "Mes inválido. Ingrese un valor entre 1 y 12.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número entero para el mes.");
            }
        } while (mes < 1 || mes > 12);

        // Lectura del año
        do {
            entrada = JOptionPane.showInputDialog("Ingrese el año (1000 - 9999): ");
            try {
                ano = Integer.parseInt(entrada);
                if (ano >= 1000 && ano <= 9999) {
                    fechap.setAno(ano);
                } else {
                    JOptionPane.showMessageDialog(null, "Año inválido. Ingrese un valor entre 1000 y 9999.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número entero para el año.");
            }
        } while (ano < 1000 || ano > 9999);

        /**Impresion de la fecha*/
        JOptionPane.showMessageDialog(null, "La fecha es: " + fechap.mostrarFecha(dia, mes, ano));
    }
}