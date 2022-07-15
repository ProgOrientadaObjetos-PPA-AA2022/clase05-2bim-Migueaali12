/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class Tarjeta {

    private String nombre;
    private double cupoMaximo;

    public Tarjeta(String n, double cm) {
        nombre = n;
        cupoMaximo = cm;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCupoMaximo(double n) {
        cupoMaximo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

}
