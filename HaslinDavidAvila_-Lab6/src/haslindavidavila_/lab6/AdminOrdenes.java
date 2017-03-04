package haslindavidavila_.lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminOrdenes {
    private ArrayList<Ordenes> listaOrdenes = new ArrayList();
    private File archivo = null;

    public AdminOrdenes() {
    }

    public AdminOrdenes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ordenes> getListaPersonas() {
        return listaOrdenes;
    }

    public void setListaPersonas(ArrayList<Ordenes> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaOrdenes + "";
    }

    public void setOrdenes(Ordenes p) {
        this.listaOrdenes.add(p);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ordenes t : listaOrdenes) {
                bw.write(t.getCantidad() + ";");
                bw.write(t.getAtendedor() + ";");
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
        listaOrdenes = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                int cantidad;
                
                cantidad = sc.nextInt();
                
                listaOrdenes.add(new Ordenes(cantidad, null));
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
