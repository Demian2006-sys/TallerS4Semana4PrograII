/**(La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar para representar una factura para un artículo
 * vendido en la tienda. Una Factura debe incluir cuatro piezas de información como variables de instancia: un número de pieza (tipo String),
 * la descripción de la pieza (tipo String), la cantidad de artículos de ese tipo que se van a comprar (tipo int) y el precio
 * por artículo (double). Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione
 * un método establecer y un método obtener para cada variable
 * de instancia. Además, proporcione un método llamado obtenerMontoFactura,
 * que calcule el monto de la factura (es decir, que multiplique la cantidad de artículos por el precio de cada uno)
 * y después devuelva ese monto como un valor double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es
 * positivo, debe establecerse en 0.0. Escriba una aplicación de
 * prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.*/
import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Ingrese los datos de la factura");

        String numeroPieza = JOptionPane.showInputDialog("ID del producto:");
        String descripcionPieza = JOptionPane.showInputDialog("Nombre/Descripción del producto:");

        int cantidad = 0;
        try {
            cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("Cantidad de productos vendidos (entero >= 0):"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se establecerá cantidad = 0");
        }

        double precioPorArticulo = 0.0;
        try {
            precioPorArticulo = Double.parseDouble(
                    JOptionPane.showInputDialog("Precio unitario del producto (>= 0):"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se establecerá precio = 0.0");
        }

        Factura factura = new Factura(numeroPieza, descripcionPieza, cantidad, precioPorArticulo);
        double monto = factura.obtenerMontoFactura();

        String resumen = "Resumen de la factura:\n"
                + "------------------------------------\n"
                + "ID del producto: " + factura.getNumeroPieza() + "\n"
                + "Descripción: " + factura.getDescripcionPieza() + "\n"
                + "Cantidad: " + factura.getCantidad() + "\n"
                + "Precio unitario: " + factura.getPrecioPorArticulo() + "\n"
                + "------------------------------------\n"
                + String.format("Monto total de la factura: %.2f", monto);

        JOptionPane.showMessageDialog(null, resumen);
        factura.obtener();
    }
}