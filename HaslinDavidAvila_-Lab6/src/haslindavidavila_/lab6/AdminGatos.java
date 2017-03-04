package haslindavidavila_.lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminGatos {
    private ArrayList<Gatos> listaGatos = new ArrayList();
    private File archivo = null;

    public AdminGatos() {
    }

    public AdminGatos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Gatos> getListaPersonas() {
        return listaGatos;
    }

    public void setListaPersonas(ArrayList<Gatos> listaGatos) {
        this.listaGatos = listaGatos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaGatos + "";
    }

    public void setGatos(Gatos p) {
        this.listaGatos.add(p);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Gatos t : listaGatos) {
                bw.write(t.getPeso() + ";");
                bw.write(t.getAltura() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(";");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaGatos = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                double peso;
                double altura;
                double precio;
                
                peso = sc.nextDouble();
                altura = sc.nextDouble();
                precio = sc.nextDouble();
                
                listaGatos.add(new Gatos(peso, altura, precio));
            }
        } catch (Exception e) {
        } finally {
            try {
                sc.close();
            } catch (Exception e) {
            }
        }
    }
}
