package paquete03;


public class TransporteAereo {
    
    private double tarifa;
    private String aerolinea;

    public String obtenerAerolinea() {
        return aerolinea;
    }

    public void establecerAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    public double obtenerTarifa() {
        return tarifa;
    }

    public void establecerTarifa() {
        this.tarifa = (100.00 + 0.20);
    }
    
    
    
}
