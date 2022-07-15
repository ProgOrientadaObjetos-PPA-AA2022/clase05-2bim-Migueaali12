package paquete10;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaPeliculas {

    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> peliculas;
    private String nombreArchivo;

    public LecturaPeliculas(String n) {

        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());

        if (f.exists()) {

            try {

                entrada = new ObjectInputStream(new FileInputStream(n));

            } catch (IOException ioException) {

                System.err.println("Error al abrir el archivo." + ioException);
            }
        }
    }
    
    
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerPeliculas() {

        peliculas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        
        if (f.exists()) {

            while (true) {
                try {

                    GeneradorPeliculas registro = (GeneradorPeliculas) entrada.readObject();
                    peliculas.add(registro);

                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    
    

    public ArrayList<GeneradorPeliculas> obtenerPeliculas() {
        return peliculas;
    }
       
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < obtenerPeliculas().size(); i++) {
            GeneradorPeliculas p = obtenerPeliculas().get(i);
            cadena = String.format("%s%s\n",
                    cadena,
                    p.toString());                  
        }

        return cadena;
    }

    public void cerrarArchivo() {

        try {

            if (entrada != null) {

                entrada.close();
            }

            System.exit(0);

        } catch (IOException ioException) {

            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
