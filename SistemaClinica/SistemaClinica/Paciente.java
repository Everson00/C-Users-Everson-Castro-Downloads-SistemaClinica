
public class Paciente {
    
    private String nombre;
    private String motivoConsulta;


    public Paciente(String nombre, String motivoConsulta) {
        this.nombre = nombre;
        this.motivoConsulta = motivoConsulta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getMotivoConsulta() {
        return motivoConsulta;
    }


    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    } 

}
