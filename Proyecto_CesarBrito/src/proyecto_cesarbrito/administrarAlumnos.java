package proyecto_cesarbrito;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarAlumnos {

    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private File archivo = null;

    public administrarAlumnos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaAlumnos;
    }

    public void setAlumno(Alumno p) {
        this.listaAlumnos.add(p);
    }

    public void cargarArchivo() {
        try {
            listaAlumnos = new ArrayList();
            Alumno temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Alumno) objeto.readObject()) != null) {
                        listaAlumnos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Alumno t : listaAlumnos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
