package haslindavidavila_.lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminBaleadas {
    private ArrayList<Baleadas> listaBaleadas = new ArrayList();
    private File archivo = null;

    public AdminBaleadas() {
    }

    public AdminBaleadas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Baleadas> getListaPersonas() {
        return listaBaleadas;
    }

    public void setListaPersonas(ArrayList<Baleadas> listaBaleadas) {
        this.listaBaleadas = listaBaleadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaBaleadas + "";
    }

    public void setBaleadas(Baleadas p) {
        this.listaBaleadas.add(p);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Baleadas t : listaBaleadas) {
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
        listaBaleadas = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                double precio;
                
                precio = sc.nextDouble();
                
                listaBaleadas.add(new Baleadas(precio));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}
