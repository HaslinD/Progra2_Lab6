package haslindavidavila_.lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminJefes {
    private ArrayList<Jefes> listaJefes = new ArrayList();
    private File archivo = null;

    public AdminJefes() {
    }

    public AdminJefes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jefes> getListaPersonas() {
        return listaJefes;
    }

    public void setListaPersonas(ArrayList<Jefes> listaJefes) {
        this.listaJefes = listaJefes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaJefes + "";
    }

    public void setJefes(Jefes p) {
        this.listaJefes.add(p);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Jefes t : listaJefes) {
                bw.write(t.getSeccion_trabajo() + ";");
                bw.write(t.getClientes_atendidos() + ";");
                bw.write(t.getGanancia() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getLugar_nacimiento() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getColor_piel() + ";");
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
        listaJefes = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                int id, ed, ca;
                Color color;
                double ganancia;
                String na, ln, no, st;
                
                st = sc.next();
                ca = sc.nextInt();
                ganancia = sc.nextDouble();
                ed = sc.nextInt();
                id = sc.nextInt();
                na = sc.next();
                ln = sc.next();
                no = sc.next();
                color = Color.WHITE;
                
                listaJefes.add(new Jefes(st, ca, ganancia, ed, id, na, ln, no, null, color));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}
