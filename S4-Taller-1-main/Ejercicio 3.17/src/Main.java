import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**(Computarización de los registros médicos) Un tema relacionado con la salud que ha estado últimamente en las noticias es la computarización de los registros médicos.
 Esta posibilidad se está tratando con mucho cuidado, debido a las delicadas cuestiones de privacidad y seguridad,
 entre otras cosas. La computarización de los registros médicos puede facilitar a los pacientes el proceso de compartir sus perfiles
 e historiales médicos con los diversos profesionales de la salud que consulten. Esto podría mejorar la calidad del servicio médico,
 ayudar a evitar conflictos de fármacos y prescripciones erróneas, reducir los costos y, en emergencias, podría ayudar a salvar vidas
 En este ejercicio usted diseñará una clase “inicial” llamada PerfilMedico para una 100 Capítulo 3 Introducción a las clases,
 , los objetos, los métodos y las cadenas persona. Los atributos de la clase deben incluir el primer nombre de la persona, su apellido, sexo,
 echa de nacimiento (que debe consistir de atributos separados para el día, mes y año de nacimiento), altura (en centímetros) y peso (en kilogramos).
 Su clase debe tener un constructor que reciba estos datos.
 Para cada atributo, debe proveer los métodos establecer y obtener. La clase también debe incluir métodos que calculen y devuelvan la edad del usuario en años,
 la frecuencia cardiaca máxima y el rango de frecuencia cardiaca esperada (vea el ejercicio 3.16), además del índice de masa corporal (BM).
 Escriba una aplicación de Java que pida la información de la persona, cree una instancia de un objeto de la clase PerfilMedico
 para esa personae imprima la información de ese objeto
 y que después calcule e imprima la edad de esa persona en años, junto con el BMI, la frecuencia cardiaca máxima
 y el rango de frecuencia cardiaca esperada. También debe mostrar la tabla de valores del BMI VALORES DE BMI Bajo peso: menos de 18.5 Normal: entre 18.5 y 24.9 Sobrepeso: entre
 25 y 29.9 Obeso: 30 o más */

public class Main {
    public static void main(String[] args) throws IOException {
        /** Declaración de objetos */
        PerfilMedico perfil = new PerfilMedico();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        int anioActual = 2025;

        do {
            // Mostrar menú en consola
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar datos del paciente");
            System.out.println("2. Mostrar datos personales");
            System.out.println("3. Mostrar resultados médicos");
            System.out.println("4. Mostrar tabla de BMI");
            System.out.println("5. Salir");
            System.out.print(">> ");

            opcion = Integer.parseInt(reader.readLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer nombre: ");
                    perfil.setPrimerNombre(reader.readLine());

                    System.out.print("Ingrese el apellido: ");
                    perfil.setApellido(reader.readLine());

                    System.out.print("Ingrese el sexo (M/F): ");
                    perfil.setSexo(reader.readLine());

                    System.out.print("Ingrese el día de nacimiento: ");
                    perfil.setDiaNacimiento(Integer.parseInt(reader.readLine()));

                    System.out.print("Ingrese el mes de nacimiento: ");
                    perfil.setMesNacimiento(Integer.parseInt(reader.readLine()));

                    System.out.print("Ingrese el año de nacimiento: ");
                    perfil.setAnioNacimiento(Integer.parseInt(reader.readLine()));

                    System.out.print("Ingrese la altura (en centímetros): ");
                    perfil.setAltura(Double.parseDouble(reader.readLine()));

                    System.out.print("Ingrese el peso (en kilogramos): ");
                    perfil.setPeso(Double.parseDouble(reader.readLine()));
                    break;

                case 2:
                    perfil.imprimirDatosPersonales();
                    break;

                case 3:
                    perfil.imprimirResultados(anioActual);
                    break;

                case 4:
                    perfil.imprimirTablaBMI();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Sistema de Perfil Médico");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 5);
    }
}