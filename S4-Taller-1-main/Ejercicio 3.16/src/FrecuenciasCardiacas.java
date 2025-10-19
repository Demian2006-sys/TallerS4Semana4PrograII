/**Declaracion de Clase y atributos*/
public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mesCumpleanos;
    private int diaCumpleanos;
    private int anioCumpleanos;

    /**Declaracion de constructores*/
    public FrecuenciasCardiacas() {
    }

    public FrecuenciasCardiacas(String nombre, String apellido, int mesCumpleanos, int diaCumpleanos, int anioCumpleanos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesCumpleanos = mesCumpleanos;
        this.diaCumpleanos = diaCumpleanos;
        this.anioCumpleanos = anioCumpleanos;
    }
    /**Metodos propios de Java*/

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMesCumpleanos() {
        return this.mesCumpleanos;
    }

    public void setMesCumpleanos(int mesCumpleanos) {
        this.mesCumpleanos = mesCumpleanos;
    }

    public int getDiaCumpleanos() {
        return this.diaCumpleanos;
    }

    public void setDiaCumpleanos(int diaCumpleanos) {
        this.diaCumpleanos = diaCumpleanos;
    }

    public int getAnioCumpleanos() {
        return this.anioCumpleanos;
    }

    public void setAnioCumpleanos(int anioCumpleanos) {
        this.anioCumpleanos = anioCumpleanos;
    }
    /**Metodos propios del programador*/
    public int calcularEdad(int anioActual) {
        return anioActual - this.anioCumpleanos;
    }

    public int calcularFrecuenciaMaxima(int anioActual) {
        return 220 - this.calcularEdad(anioActual);
    }

    public double calcularRangoEsperado(int frecuenciaMaxima) {
        double limiteInferior = (double)frecuenciaMaxima * (double)0.5F;
        double limiteSuperior = (double)frecuenciaMaxima * 0.85;
        return (limiteInferior + limiteSuperior) / (double)2.0F;
    }

    public String obtenerDatosUsuario() {
        return "\nDatos del Paciente:\n\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nFecha de Nacimiento: " + this.diaCumpleanos + "/" + this.mesCumpleanos + "/" + this.anioCumpleanos;
    }
}
