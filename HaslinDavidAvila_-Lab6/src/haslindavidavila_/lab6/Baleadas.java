package haslindavidavila_.lab6;

import java.util.ArrayList;

public class Baleadas extends ArticulosV {
    private ArrayList ingredientes = new ArrayList();

    public Baleadas() {
        super();
    }

    public Baleadas(double precio) {
        super(precio);
    }

    @Override
    public String toString() {
        return super.toString()+ "ingredientes=" + ingredientes;
    }
    
    
}
