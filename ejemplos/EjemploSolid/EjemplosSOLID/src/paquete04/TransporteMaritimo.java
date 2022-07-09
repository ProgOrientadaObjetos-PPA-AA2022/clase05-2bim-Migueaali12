
package paquete04;


public class TransporteMaritimo extends Transporte {
    
    private String tipo;

    public String obteneripo() {
        return tipo;
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 1000 + 0.1;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Transporte Maritimo: %.2f",
                + obtenerTarifa());
        
        return cadena;
    }
    
}
