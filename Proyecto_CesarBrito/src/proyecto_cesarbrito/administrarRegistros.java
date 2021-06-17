package proyecto_cesarbrito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarRegistros {

    private ArrayList<Registro> listaRegistros = new ArrayList();
    private File archivo = null;

    public administrarRegistros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Registro> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(ArrayList<Registro> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaRegistros;
    }

    public void setRegistro(Registro p) {
        this.listaRegistros.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Registro t : listaRegistros) {
                bw.write(t.getUsername() + ";");
                bw.write(t.getPassword() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaRegistros = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaRegistros.add(new Registro(sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
