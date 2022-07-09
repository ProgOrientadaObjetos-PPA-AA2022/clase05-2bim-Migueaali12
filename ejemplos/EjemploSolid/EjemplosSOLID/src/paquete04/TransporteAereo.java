package paquete04;


public class TransporteAereo extends Transporte {
    
    private String aerolinea;

    public String obtenerAerolinea() {
        return aerolinea;
    }

    public void establecerAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 100.00 + 0.20;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Transporte Aereo: %.2f",
                + obtenerTarifa());
        
        return cadena;
    }
    
    
    
}
