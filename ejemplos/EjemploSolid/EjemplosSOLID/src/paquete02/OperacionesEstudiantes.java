/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;

    public OperacionesEstudiantes(ArrayList<Persona> estudiantes) {
        this.estudiantes = estudiantes;
        establecerPromedioEdades();
        establecerPromedioEdadesCualitativo();
        this.promedioEdades = obtenerPromedioEdades();
        this.promedioEdadesCualitativo = obtenerPromedioCualitativo();
    }
    
    
    
    public void establecerPromedioEdadesCualitativo(){
        
        if (obtenerPromedioEdades() >= 0 && obtenerPromedioEdades() < 21) {
            promedioEdadesCualitativo = "Promedio Jovenes";
            
        } else if (obtenerPromedioEdades() > 21) {
            promedioEdadesCualitativo = "Promedio adulto";
        }
    }
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma += e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public String obtenerPromedioCualitativo() {
        
        return promedioEdadesCualitativo;
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("");
        
        for (int i = 0; i < estudiantes.size() ; i++) {
            
            cadena = String.format("%s"
                    + "Nombre: %s\n",
                    cadena, estudiantes.get(i).obtenerNombre());
            
        }
        
        cadena = String.format("%s\n"
                + "Promedio: %.2f\n"
                + "Tipo de promedio: %s\n",
                cadena, obtenerPromedioEdades(), obtenerPromedioCualitativo());

        return cadena;
       
    }
    
    
}
