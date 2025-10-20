import java.awt.Component;
import javax.swing.JOptionPane;
public class Estudiante {
    /** Declaracion de atributos */
    private String nombreC;
    private String matricula;
    private String carrera;
    private double promacum;

    /** Constructores */
    public Estudiante() {
    }

    public Estudiante(String nombreC, String matricula, String carrera, double promacum) {
        this.nombreC = nombreC;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promacum = promacum;
    }
    /** METODOS JAVA */
    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromacum() {
        return promacum;
    }

    public void setPromacum(double promacum) {
        this.promacum = promacum;
    }
    /** METODOS PROGRAMADOR */
    public String analizarDatos() {
        String aviso;

        if (promacum >= 9) {
            aviso = "EXCELENTE";
        } else if (promacum >= 8) {
            aviso = "Sobresaliente";
        } else if (promacum >= 7) {
            aviso = "Bueno";
        } else if (promacum >= 6) {
            aviso = "Regular";
        } else {
            aviso = "REPROBADO";
        }

        return aviso;
    }

    public void MostrarDatos(){
        String mensaje;
        mensaje ="\nESTUDIANTE: " + this.nombreC + "\n"
        + "Matricula: " + this.matricula + "\n"
        + "Carrera: " + this.carrera + "\n"
        + "Promedio acumulado: " + this.promacum + "\n"
        + analizarDatos();
        JOptionPane.showMessageDialog((Component)null, mensaje);
    }
}
