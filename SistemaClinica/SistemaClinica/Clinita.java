import java.util.LinkedList;
import java.util.Queue;

public class Clinita {

    private Queue<Paciente> filaMedicinaGeneral;
    private Queue<Paciente> filaOdontologia;
    private Queue<Paciente> filaPediatria;

    public Clinita() {
        this.filaMedicinaGeneral = new LinkedList<>();
        this.filaOdontologia = new LinkedList<>();
        this.filaPediatria = new LinkedList<>();
    }  

    public void RegistrarPacientes(String especialidad, Paciente paciente){
switch (especialidad.toLowerCase()) {
    case "medicina general":
        filaMedicinaGeneral.offer(paciente);
        System.out.println("Paciente fue registrado exitosamente, en general");
        break;
    case "odontologia":
        filaOdontologia.offer(paciente);
        System.out.println("paciente registrado exitosamente, en odontología");
        break;
    case "pediatria":
        filaPediatria.offer(paciente);
        System.out.println("paciente registrado exitosamente, en pediatria");
    default:
        break;
        }
    }

    public void atenderPacientes(String especialidad){
        Paciente pacienteAtendido = null;
        switch (especialidad.toLowerCase()) {
            case "medicina general":
                pacienteAtendido = filaMedicinaGeneral.poll();
                break;
            case "odontologia":
                pacienteAtendido = filaOdontologia.poll();
                break;
            case "pediatria":
                pacienteAtendido = filaPediatria.poll();
                break;
            default:
                System.out.println("Especialidad no reconocida");
                return;
        }
        if (pacienteAtendido!= null){
            System.out.println("Atendiendo a "+ pacienteAtendido.getNombre()+
            "por "+pacienteAtendido.getMotivoConsulta());
        }

    }

    public void MostrarEstadoFilas(){
        System.out.println("\nEstado de las filas en espera: ");
        System.out.println("Medicina General "+ filaMedicinaGeneral.size()+ " pacientes en espera");
        for(Paciente p : filaMedicinaGeneral){
            System.out.println("- "+ p.getNombre()+ " | Motivo consulta "+ p.getMotivoConsulta());
        }
        System.out.println("Medicina General "+ filaOdontologia.size()+ " pacientes en espera");
        for(Paciente p : filaOdontologia){
            System.out.println("- "+ p.getNombre()+ " | Motivo consulta "+ p.getMotivoConsulta());
        }
        System.out.println("Medicina General "+ filaPediatria.size()+ " pacientes en espera");
        for(Paciente p : filaPediatria){
            System.out.println("- "+ p.getNombre()+ " | Motivo consulta "+ p.getMotivoConsulta());
        }
    }
    

    
    
}
