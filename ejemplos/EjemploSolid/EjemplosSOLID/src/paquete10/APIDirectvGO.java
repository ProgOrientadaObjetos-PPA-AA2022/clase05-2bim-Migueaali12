/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.Serializable;

/**
 *
 * @author SALA I
 */
public class APIDirectvGO implements APIMovie, Serializable {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%s", ak, "98765");
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

    @Override
    public String toString() {
        String cadena = String.format("API DIRECTV GO\n"
                );

        return cadena;
    }
}
