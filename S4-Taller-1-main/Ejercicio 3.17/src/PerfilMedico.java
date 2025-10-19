import javax.swing.JOptionPane;

/**
 * Clase PerfilMedico - Sistema de Perfil Médico para registros computarizados*/
public class PerfilMedico {
    /** Declaración de atributos */
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura;
    private double peso;

    /** Declaración de constructores */
    public PerfilMedico() {
    }

    public PerfilMedico(String primerNombre, String apellido, String sexo,
                        int diaNacimiento, int mesNacimiento, int anioNacimiento, double altura, double peso){
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    /** Métodos get y set */
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /** Métodos del programador */
    public int calcularEdad(int anioActual) {
        return anioActual - anioNacimiento;
    }

    public int calcularFrecCardiacaMax(int anioActual) {
        int edad = calcularEdad(anioActual);
        return 220 - edad;
    }

    public double calcularFrecCardiacaEsperada(int frecCardiacaMax) {
        double min = frecCardiacaMax * 0.50;
        double max = frecCardiacaMax * 0.85;
        return (min + max) / 2;
    }

    /** Métodos para cálculo de BMI */
    public double calcularBMI() {
        double alturaEnMetros = altura / 100.0;
        return peso / (alturaEnMetros * alturaEnMetros);
    }

    public String getCategoriaBMI() {
        double bmi = calcularBMI();

        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }

    /** Métodos de impresión */
    public void imprimirDatosPersonales() {
        String mensaje = "\nDatos del Paciente:\n" +
                "Nombre: " + this.primerNombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Sexo: " + this.sexo + "\n" +
                "Fecha de Nacimiento: " + this.diaNacimiento + "/" +
                this.mesNacimiento + "/" +
                this.anioNacimiento + "\n" +
                "Altura: " + this.altura + " cm\n" +
                "Peso: " + this.peso + " kg";

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void imprimirResultados(int anioActual) {
        int edad = calcularEdad(anioActual);
        int fcm = calcularFrecCardiacaMax(anioActual);
        double fce = calcularFrecCardiacaEsperada(fcm);
        double bmi = calcularBMI();

        String mensaje = "Resultados:\n" +
                "Edad: " + edad + " años\n" +
                "Frecuencia Cardíaca Máxima: " + fcm + " ppm\n" +
                "Frecuencia Cardíaca Esperada: " + String.format("%.1f", fce) + " ppm\n" +
                "BMI: " + String.format("%.2f", bmi) + "\n" +
                "Categoría de BMI: " + getCategoriaBMI();

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void imprimirTablaBMI() {
        String mensaje = "VALORES DE BMI\n" +
                "Bajo peso: menos de 18.5\n" +
                "Normal: entre 18.5 y 24.9\n" +
                "Sobrepeso: entre 25 y 29.9\n" +
                "Obeso: 30 o más";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}