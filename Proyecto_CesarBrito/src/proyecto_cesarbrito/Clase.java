package proyecto_cesarbrito;

import java.io.Serializable;
import java.util.ArrayList;

public class Clase implements Serializable {

    private String nombre;
    private int id;
    private int hora;
    private int unidades;
    private int semestre;
    private int periodo;
    private int year;
    private Maestro maestro;
    private ArrayList<Alumno> alumnos = new ArrayList();
    private ArrayList<Tarea> tareas = new ArrayList();
    private ArrayList<Foro> foros = new ArrayList();

    private static final long SerialVersionUID = 666L;

    public Clase(String nombre, int id, int hora, int unidades, int semestre, int periodo, int year, Maestro maestro) {
        this.nombre = nombre;
        this.id = id;
        this.hora = hora;
        this.unidades = unidades;
        this.semestre = semestre;
        this.periodo = periodo;
        this.year = year;
        this.maestro = maestro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public ArrayList<Foro> getForos() {
        return foros;
    }

    public void setForos(ArrayList<Foro> foros) {
        this.foros = foros;
    }

    @Override
    public String toString() {
        return nombre + " - " + maestro + " - " + alumnos;
    }

}
