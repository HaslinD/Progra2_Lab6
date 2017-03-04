package haslindavidavila_.lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

public class Familiar {
    private int edad;
    private int id;
    private String nacionalidad;
    private String lugar_nacimiento;
    private String nombre;
    private Color color_piel;
    private Familiar fam_padre;
    private ArrayList<Familiar> lista_hijos = new ArrayList();

    public Familiar() {
    }

    public Familiar(int edad, int id, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel, Familiar fam_padre) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color_piel = color_piel;
        this.fam_padre = fam_padre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public Familiar getFam_padre() {
        return fam_padre;
    }

    public void setFam_padre(Familiar fam_padre) {
        this.fam_padre = fam_padre;
    }

    public ArrayList<Familiar> getLista_hijos() {
        return lista_hijos;
    }

    public void setLista_hijos(ArrayList<Familiar> lista_hijos) {
        this.lista_hijos = lista_hijos;
    }
    
    public void sethijos(Familiar h){
        lista_hijos.add(h);
    }

    @Override
    public String toString() {
        return nombre + ", " + id + ", " + nacionalidad + ", " + lugar_nacimiento + ", " + edad + ", " + color_piel;
    }
    
    
    
    
}
