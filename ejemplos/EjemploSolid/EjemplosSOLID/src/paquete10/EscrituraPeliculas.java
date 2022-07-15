
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraPeliculas {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registroPelis;
    private ArrayList<GeneradorPeliculas> listaPeliculas;

    public EscrituraPeliculas(String n) {
        
        nombreArchivo = n;
        establecerListaPeliculas();

        try {

            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            if (obtenerListaPelis().size() > 0) {
                for (int i = 0; i < obtenerListaPelis().size(); i++) {
                    establecerRegistroPeliculas(obtenerListaPelis().get(i));
                    establecerSalida();
                }
            }
            
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroPeliculas(GeneradorPeliculas b) {
        registroPelis = b;
    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroPelis);

        } catch (IOException ex) {

            System.err.println("Error al escribir en el archivo.");

        }
    }

    public void establecerListaPeliculas() {

        LecturaPeliculas l
            = new LecturaPeliculas(obtenerNombreArchivo());
        l.establecerPeliculas();
        listaPeliculas = l.obtenerPeliculas();

    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerListaPelis() {
        return listaPeliculas;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {

        try {
            
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            
            System.err.println("Error al cerrar el archivo.");

        } 
    }

}
