import javax.swing.JOptionPane;
import java.awt.Component;

public class Main {
    /** Ejercicio 2: La clase Estudiante
     Cree una clase llamada Estudiante que incluya cuatro variables de instancia: nombre completo (tipo String),
     número de matrícula (tipo String), carrera (tipo String) y promedio acumulado (tipo double).
     Su clase debe tener un constructor que inicialice las cuatro variables de instancia.

     Proporcione un método establecer y un método obtener para cada variable de instancia. Si el promedio no está entre 0.0
     y 10.0, debe establecerse en 0.0.
     Además, proporcione un método llamado obtenerEstadoAcademico() que devuelva un String indicando:

     "Excelente" si el promedio es >= 9.0
     "Sobresaliente" si el promedio es >= 8.0 y < 9.0
     "Bueno" si el promedio es >= 7.0 y < 8.0
     "Regular" si el promedio es >= 6.0 y < 7.0
     "Reprobado" si el promedio es < 6.0

     Escriba una aplicación de prueba llamada PruebaEstudiante que cree tres objetos Estudiante con diferentes promedios y
     muestre su estado académico.*/


    public static void main(String[] args) {
        /** Declaracion de Objetos */
        Estudiante estu1 = new Estudiante();
        Estudiante estu2 = new Estudiante();
        Estudiante estu3 = new Estudiante();
        /** Variables*/
        String nombretemp;
        String carreratemp;
        String matritemp;
        double promtemp;
        int opc;
        int cont=0;
        int cont2=0;

        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ingresar promedio");
            System.out.println("3. Mostrar estado de estudiantes");
            System.out.println("4. Salir");
            System.out.print(">>");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: "));
            switch (opc){
                case 1:
                    if (cont<=2){
                    nombretemp = JOptionPane.showInputDialog("Ingrese el nombre completo del estudiante: ");
                    matritemp = JOptionPane.showInputDialog("Ingrese la matricula  del estudiante " + nombretemp + ": ");
                    carreratemp = JOptionPane.showInputDialog("Ingrese la carrera  del estudiante " + nombretemp + ": ");
                    if (cont==0){
                        estu1.setNombreC(nombretemp);
                        estu1.setMatricula(matritemp);
                        estu1.setCarrera(carreratemp);
                    }
                    else if (cont==1){
                            estu2.setNombreC(nombretemp);
                            estu2.setMatricula(matritemp);
                            estu2.setCarrera(carreratemp);
                        }
                    else if (cont==2){
                            estu3.setNombreC(nombretemp);
                            estu3.setMatricula(matritemp);
                            estu3.setCarrera(carreratemp);
                        }
                    cont++;
                    }else {
                        System.out.println("Haz alcanzado el numero maximo de estudiantes");
                    }
                    break;
                case 2:
                    if (cont==0){
                        JOptionPane.showInputDialog("Ingresa al menos un estudiante antes");
                        break;
                    }
                    else {
                        int opc2;
                        if (cont>2){
                            System.out.println("Haz alcanzado el numero maximo de estudiantes");
                            break;
                        } else {
                            System.out.println("Seleccione el estudiante: ");
                            for (int i=0; i<=cont; i++){
                                System.out.println("1. " + estu1.getNombreC());
                                if (i==1){
                                    System.out.println("2. " + estu2.getNombreC());
                                }else if (i==2) {
                                    System.out.println("3. " + estu3.getNombreC());
                                }
                            }
                            opc2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: "));
                            promtemp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del estudiante: "));
                            if (opc2==1){
                                estu1.setPromacum(promtemp);
                            }
                            else if (opc2==2){
                                estu2.setPromacum(promtemp);
                            }
                            else if (opc2==3) {
                                estu3.setPromacum(promtemp);
                            }
                            cont2++;
                        }
                    }

                     break;
                case 3:
                    if (cont==0){
                        JOptionPane.showInputDialog("Ingresa al menos un estudiante antes");
                        break;
                    }
                    else if (cont2==0){
                        JOptionPane.showInputDialog("Ingresa al menos un promedio antes");
                    }
                    else {
                        int opc3;
                        System.out.println("Seleccione el estudiante: ");
                        for (int i=0; i<=cont; i++){
                            System.out.println("1. " + estu1.getNombreC());
                            if (i==1){
                                System.out.println("2. " + estu2.getNombreC());
                            }else if (i==2) {
                                System.out.println("3. " + estu3.getNombreC());
                            }
                        }
                        opc3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: "));
                        if (opc3==1){
                        estu1.MostrarDatos();
                        }else if (opc3==2){
                            estu2.MostrarDatos();
                        }else if (opc3==3){
                            estu3.MostrarDatos();
                        }
                    }
                    break;
                case 4:
                    System.out.println("BYE BYEEEE");
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }
        }while(opc !=4);
    }
    }