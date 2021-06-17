package proyecto_cesarbrito;

import java.io.Serializable;
import java.util.ArrayList;

public class Foro implements Serializable {

    private String titulo;
    private String descripcion;
    private ArrayList<String> aportes = new ArrayList();

    private static final long SerialVersionUID = 123L;

    public Foro(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
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

    public ArrayList<String> getAportes() {
        return aportes;
    }

    public void setAportes(ArrayList<String> aportes) {
        this.aportes = aportes;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
