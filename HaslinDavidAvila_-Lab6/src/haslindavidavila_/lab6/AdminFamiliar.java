package haslindavidavila_.lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.tree.DefaultTreeModel;

public class AdminFamiliar {
    private ArrayList<Familiar> listaFamiliar = new ArrayList();
    private File archivo = null;

    public AdminFamiliar() {
    }

    public AdminFamiliar(String path) {
        archivo = new File(path);
    }

    public ArrayList<Familiar> getListaPersonas() {
        return listaFamiliar;
    }

    public void setListaPersonas(ArrayList<Familiar> listaFamiliar) {
        this.listaFamiliar = listaFamiliar;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaFamiliar + "";
    }
    
    public void setFamiliar(Familiar p){
        this.listaFamiliar.add(p);
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Familiar t : listaFamiliar) {
                bw.write(t.getEdad() + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getLugar_nacimiento() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getColor_piel() + ";");
                bw.write(t.getFam_padre() + ";");
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
    
    public void cargarArchivo(){
        Scanner sc = null;
        listaFamiliar = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                int id,ed;
                Color color;
                String na,ln,no;
                
                ed = sc.nextInt();
                id = sc.nextInt();
                na = sc.next();
                ln = sc.next();
                no = sc.next();
                color = Color.WHITE;
                
                listaFamiliar.add(new Familiar(ed, id, na, ln, no, color, null));
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
