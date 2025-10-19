
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 Calculadora de la frecuencia cardiaca esperada) Mientras se ejercita, puede usar un monitor de frecuencia cardiaca para ver que su corazón permanezca
 dentro de un rango seguro sugerido por sus entrenadores y doctores.
 De acuerdo con la Asociación Estadounidense del Corazón (AHA)
 la fórmula para calcular su frecuencia cardiaca máxima en pulsos por minuto es 220 menos su edad en años.
 Su frecuencia cardiaca esperada tiene un rango que está entre el 50 y el 85% de su frecuencia cardiaca máxima.
 Cree una clase llamada FrecuenciasCardiacas. Los atributos de la clase deben incluir:
 el primer nombre de la persona, su apellido y fecha de nacimiento (la cual debe consistir de atributos independientes para el mes, día y año de nacimiento).
 Su clase debe tener un constructor que reciba estos datos como parámetros. Para cada atributo debe proveer métodos establecer y obtener.
 La clase también debe incluir un método que calcule y devuelva la edad de la persona (en años), un método que calcule
 y devuelva la frecuencia cardiaca máxima de esa persona, y otro método que calcule y devuelva la frecuencia cardiaca esperada de la persona.
 Escriba una aplicación de Java que pida la información de la persona, cree una instancia de un objeto de la clase FrecuenciasCardiacas e imprima la información
 a partir de ese objeto (incluyendo el primer nombre de la persona, su apellido y fecha de nacimiento),
 y que después calcule e imprima la edad de la persona en (años), frecuencia cardiaca máxima y rango de frecuencia cardiaca esperada.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        /**Declaracion de Objetos*/
        FrecuenciasCardiacas paciente = new FrecuenciasCardiacas();

        /**Lectura de datos */
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("========================================================");
        System.out.println("     CALCULADORA DE FRECUENCIA CARDIACA ESPERADA");
        System.out.println("========================================================");
        System.out.println("Por favor, ingrese los siguientes datos del paciente:");
        System.out.print("Nombre: ");
        paciente.setNombre(lector.readLine());
        System.out.print("Apellido: ");
        paciente.setApellido(lector.readLine());
        System.out.print("Mes de nacimiento (1-12): ");
        paciente.setMesCumpleanos(Integer.parseInt(lector.readLine()));
        System.out.print("Día de nacimiento (1-31): ");
        paciente.setDiaCumpleanos(Integer.parseInt(lector.readLine()));
        System.out.print("Año de nacimiento (YYYY): ");
        paciente.setAnioCumpleanos(Integer.parseInt(lector.readLine()));
        System.out.println("--------------------------------------------------------");
        System.out.println("Procesando información del paciente...");
        System.out.println("--------------------------------------------------------");
        int anioActual = 2025;
        int edad = paciente.calcularEdad(anioActual);
        int frecuenciaMaxima = paciente.calcularFrecuenciaMaxima(anioActual);
        double frecuenciaPromedio = paciente.calcularRangoEsperado(frecuenciaMaxima);
        /**Impresion de los datos*/
        String datosPaciente = paciente.obtenerDatosUsuario();
        String resultados = "\nResultados del Análisis:\n\nEdad actual: " + edad + " años\nFrecuencia Cardíaca Máxima: " + frecuenciaMaxima + " ppm\nFrecuencia Cardíaca Esperada: " + frecuenciaPromedio + " ppm";
        JOptionPane.showMessageDialog((Component)null, datosPaciente);
        JOptionPane.showMessageDialog((Component)null, resultados);
    }
}
