package haslindavidavila_.lab6;

import java.util.Date;

public class Venta {
    private Clientes nom_cliente;
    private Empleado nom_empleado;
    private int cant_objetos;
    private double total;
    private Date fecha;

    public Venta() {
    }

    public Venta(Clientes nom_cliente, Empleado nom_empleado, int cant_objetos, double total, Date fecha) {
        this.nom_cliente = nom_cliente;
        this.nom_empleado = nom_empleado;
        this.cant_objetos = cant_objetos;
        this.total = total;
        this.fecha = fecha;
    }

    public Clientes getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(Clientes nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public Empleado getNom_empleado() {
        return nom_empleado;
    }

    public void setNom_empleado(Empleado nom_empleado) {
        this.nom_empleado = nom_empleado;
    }

    public int getCant_objetos() {
        return cant_objetos;
    }

    public void setCant_objetos(int cant_objetos) {
        this.cant_objetos = cant_objetos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nom_cliente=" + nom_cliente + ", nom_empleado=" + nom_empleado + ", cant_objetos=" + cant_objetos + ", total=" + total + ", fecha=" + fecha;
    }
    
    
}
