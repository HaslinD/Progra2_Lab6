package haslindavidavila_.lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminCliente {
    private ArrayList<Clientes> listaCliente = new ArrayList();
    private File archivo = null;

    public AdminCliente() {
    }

    public AdminCliente(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clientes> getListaPersonas() {
        return listaCliente;
    }

    public void setListaPersonas(ArrayList<Clientes> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaCliente + "";
    }

    public void setClientes(Clientes p) {
        this.listaCliente.add(p);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clientes t : listaCliente) {
                bw.write(t.getTicket() + ";");
                bw.write(t.getDinero() + ";");
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
        listaCliente = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                int id, ed, ticket;
                Color color;
                double dinero;
                String na, ln, no;
                
                ticket = sc.nextInt();
                dinero = sc.nextDouble();
                ed = sc.nextInt();
                id = sc.nextInt();
                na = sc.next();
                ln = sc.next();
                no = sc.next();
                color = Color.WHITE;
                
                listaCliente.add(new Clientes(ticket, dinero, ed, id, na, ln, no, null, color));
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
