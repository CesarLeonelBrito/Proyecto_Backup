package proyecto_cesarbrito;

import java.io.Serializable;

public class Alumno implements Serializable {

    String username;
    String password;
    String nombre;
    String carrera;
    String rol;
    int cuenta;
    int clasesCursadas;

    private static final long SerialVersionUID = 555L;

    public Alumno(String username, String password, String nombre, String carrera, String rol, int cuenta, int clasesCursadas) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.carrera = carrera;
        this.rol = rol;
        this.cuenta = cuenta;
        this.clasesCursadas = clasesCursadas;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getClasesCursadas() {
        return clasesCursadas;
    }

    public void setClasesCursadas(int clasesCursadas) {
        this.clasesCursadas = clasesCursadas;
    }

    @Override
    public String toString() {
        return nombre + " - " + username;
    }

}
