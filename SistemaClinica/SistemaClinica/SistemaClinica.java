import java.util.Scanner;

/**
 * SistemaClinica
 */
public class SistemaClinica {

    public static void main(String[] args) {
        Clinita maria = new Clinita();
        Scanner datos = new Scanner(System.in);
        boolean salir = false;

        while (!salir){
            System.out.println("\n---Sistema de turnos Clinica");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Mostrar estado de filas en espera");
            System.out.println("4. Salir");
            int opcion =  datos.nextInt();
            datos.nextLine();//limpiar buffer
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nombre del paciente ");
                    String nombre = datos.nextLine();
                    System.out.println("ingrese motivo de consulta ");
                    String motivo = datos.nextLine();
                    System.out.println("ingrese especialidad (Medicina General, Odontologia, Pediatria): ");
                    String especialidad =datos.nextLine();
                    maria.RegistrarPacientes(especialidad, new Paciente(nombre, motivo));
                    break;
                case 2:
                    System.out.println("Ingrese especialidad a atender (Medicina General, Odontologia, Pediatria): ");
                    especialidad = datos.nextLine();
                    maria.atenderPacientes(especialidad);
                    break;
                case 3: 
                    maria.MostrarEstadoFilas();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
    
        }

        datos.close();

        }

        
}