/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_hectorhernandez_12211096;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Hector
 */
public class adminPartidas {

    private ArrayList<Partida> listaPartidas = new ArrayList();
    private File archivo = null;

    public adminPartidas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partida> getListaPartidas() {
        return listaPartidas;
    }

    public void setListaPartidas(ArrayList<Partida> listaPartidas) {
        this.listaPartidas = listaPartidas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setAlumno(Partida a) {
        listaPartidas.add(a);
    }

    @Override
    public String toString() {
        return "adminPartidas{" + "listaPartidas=" + listaPartidas + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            listaPartidas = new ArrayList();
            Partida temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Partida) objeto.readObject()) != null) {
                        listaPartidas.add(temp);
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
            for (Partida t : listaPartidas) {
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
