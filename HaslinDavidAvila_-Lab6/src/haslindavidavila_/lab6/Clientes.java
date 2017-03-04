package haslindavidavila_.lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

public class Clientes extends Persona{
    private int ticket;
    private double dinero;
    private ArrayList<Ordenes> lista_ordenes = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(int ticket, double dinero, int edad, int id, String nacionalidad, String lugar_nacimiento, String nombre, DefaultTreeModel arbol_genealogico, Color Color_piel) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, arbol_genealogico, Color_piel);
        this.ticket = ticket;
        this.dinero = dinero;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Ordenes> getLista_ordenes() {
        return lista_ordenes;
    }

    public void setLista_ordenes(ArrayList<Ordenes> lista_ordenes) {
        this.lista_ordenes = lista_ordenes;
    }
    
    public void ordenes(Ordenes o){
        lista_ordenes.add(o);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + ticket + ", " + dinero;
    }
    
    
    
    
}
