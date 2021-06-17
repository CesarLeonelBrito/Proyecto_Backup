package proyecto_cesarbrito;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administrarClases {
    
    private ArrayList<Clase> listaClases = new ArrayList();
    private File archivo = null;

    public administrarClases(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    

    @Override
    public String toString() {
        return "" + listaClases;
    }

    public void setClase(Clase p) {
        this.listaClases.add(p);
    }

    public void cargarArchivo()  {
        try {
            listaClases = new ArrayList();
            Clase temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clase) objeto.readObject()) != null) {
                        listaClases.add(temp);
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
            for (Clase t : listaClases) {
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
