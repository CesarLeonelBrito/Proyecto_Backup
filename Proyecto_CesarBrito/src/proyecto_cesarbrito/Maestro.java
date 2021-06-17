package proyecto_cesarbrito;

import java.io.Serializable;

public class Maestro implements Serializable {

    String nombre;
    String username;
    String password;
    String profesion;
    String rol;
    int id;
    double sueldo;

    private static final long SerialVersionUID = 777L;

    public Maestro(String nombre, String username, String password, String profesion, String rol, int id, double sueldo) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.profesion = profesion;
        this.rol = rol;
        this.id = id;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre + " - " + username;
    }

}
