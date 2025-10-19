/**
 * Clase Factura
 * Representa la factura de un artículo vendido en la ferretería.
 * Contiene información básica: número de pieza, descripción (tipo),
 * cantidad y precio por unidad. Las cantidades negativas y los precios
 * negativos se normalizan a 0 y 0.0 respectivamente.
 */
public class Factura {
    private String numeroPieza;

    private String descripcionPieza;

    private int cantidad;

    private double precioPorArticulo;

    /**
     * Constructor por defecto.
     * Inicializa las cadenas a cadena vacía y los numéricos a 0.
     */
    public Factura() {
        this.numeroPieza = "";
        this.descripcionPieza = "";
        this.cantidad = 0;
        this.precioPorArticulo = 0.0;
    }

    /**
     * Constructor con parámetros.
     * Inicializa los campos con los valores proporcionados.
     */
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        setNumeroPieza(numeroPieza);
        setDescripcionPieza(descripcionPieza);
        setCantidad(cantidad);
        setPrecioPorArticulo(precioPorArticulo);
    }
    /**Obtiene el identificador de la pieza.*/

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = (numeroPieza == null) ? "" : numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = (descripcionPieza == null) ? "" : descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad < 0) ? 0 : cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = (precioPorArticulo < 0.0) ? 0.0 : precioPorArticulo;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }

    public void obtener() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("ID DEL PRODUCTO       : " + numeroPieza);
        System.out.println("-----------------------------------------------------------");
        System.out.println("NOMBRE DEL PRODUCTO   : " + descripcionPieza);
        System.out.println("-----------------------------------------------------------");
        System.out.println("CANTIDAD DE PRODUCTOS : " + cantidad);
        System.out.println("-----------------------------------------------------------");
        System.out.println("PRECIO DE PRODUCTO    : " + precioPorArticulo);
    }

    public String toString() {
        return "Factura{" +
                "numeroPieza='" + numeroPieza + '\'' +
                ", descripcionPieza='" + descripcionPieza + '\'' +
                ", cantidad=" + cantidad +
                ", precioPorArticulo=" + String.format("%.2f", precioPorArticulo) +
                '}';
    }
}