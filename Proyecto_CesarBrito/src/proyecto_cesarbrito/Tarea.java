package proyecto_cesarbrito;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Tarea implements Serializable {

    private Date fechaFinal;
    private String titulo;
    private String descripcion;
    private ArrayList<TareaAlumno> tareasAlumnos = new ArrayList();

    private static final long SerialVersionUID = 111L;

    public Tarea(Date fechaFinal, String titulo, String descripcion) {
        this.fechaFinal = fechaFinal;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<TareaAlumno> getTareasAlumnos() {
        return tareasAlumnos;
    }

    public void setTareasAlumnos(ArrayList<TareaAlumno> tareasAlumnos) {
        this.tareasAlumnos = tareasAlumnos;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        return titulo + " - " + sdf.format(fechaFinal);
    }

}
