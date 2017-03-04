package haslindavidavila_.lab6;

public class Ordenes {
    private int cantidad;
    private Empleado atendedor;

    public Ordenes() {
    }
    
    public Ordenes(int cantidad, Empleado atendedor) {
        this.cantidad = cantidad;
        this.atendedor = atendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Empleado getAtendedor() {
        return atendedor;
    }

    public void setAtendedor(Empleado atendedor) {
        this.atendedor = atendedor;
    }

    @Override
    public String toString() {
        return  cantidad + ", " + atendedor;
    }

    
    
}
