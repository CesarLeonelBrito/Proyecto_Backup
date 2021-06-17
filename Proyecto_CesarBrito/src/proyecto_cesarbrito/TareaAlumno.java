package proyecto_cesarbrito;

import java.io.File;
import java.io.Serializable;

public class TareaAlumno implements Serializable {

    private Alumno estudiante;
    private int nota;
    private File archivo;
    
    private static final long SerialVersionUID = 999L;

    public TareaAlumno(Alumno estudiante, int nota, File archivo) {
        this.estudiante = estudiante;
        this.nota = nota;
        this.archivo = archivo;
    }

    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return estudiante + " - " + nota;
    }

}
