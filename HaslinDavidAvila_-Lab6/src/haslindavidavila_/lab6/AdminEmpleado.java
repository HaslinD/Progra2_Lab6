package haslindavidavila_.lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.tree.DefaultTreeModel;

public class AdminEmpleado {
    private ArrayList<Empleado> listaEmpleados = new ArrayList();
    private File archivo = null;

    public AdminEmpleado() {
    }

    public AdminEmpleado(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleado> getListaPersonas() {
        return listaEmpleados;
    }

    public void setListaPersonas(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaEmpleados + "";
    }
    
    public void setEmpleado(Empleado p){
        this.listaEmpleados.add(p);
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Empleado t : listaEmpleados) {
                bw.write(t.getSeccion_trabajo() + ";");
                bw.write(t.getHora_entrada() + ";");
                bw.write(t.getHora_salida() + ";");
                bw.write(t.getSueldo() + ";");
                bw.write(t.getEstado() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getLugar_nacimiento() + ";");
                bw.write(t.getArbol_genealogico() + ";");
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
    
    public void cargarArchivo(){
        Scanner sc = null;
        listaEmpleados = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                int id,ed;
                double sue;
                Color color;
                String st,he,hs,es,na,ln,no;
                DefaultTreeModel arbol;
                
                st = sc.next();
                he = sc.next();
                hs = sc.next();
                sue = sc.nextDouble();
                es = sc.next();
                ed = sc.nextInt();
                id = sc.nextInt();
                na = sc.next();
                ln = sc.next();
                no = sc.next();
                arbol = null;
                color = Color.WHITE;
                
                listaEmpleados.add(new Empleado(st, he, hs, sue, es, ed, id, na, ln, no, arbol, color));
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
