package haslindavidavila_.lab6;

public class ArticulosV {
    private double precio;

    public ArticulosV() {
    }
    
    public ArticulosV(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ArticulosV{" + "precio=" + precio + '}';
    }
    
}
