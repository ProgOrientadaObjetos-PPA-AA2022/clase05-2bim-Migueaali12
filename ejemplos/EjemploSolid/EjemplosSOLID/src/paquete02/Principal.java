/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Jose", 18);
        Persona p2 = new Persona("Sebastian", 17);
        Persona p3 = new Persona("Sofia", 16);
        
        ArrayList<Persona> listaEstudiantes = new ArrayList();
        listaEstudiantes.add(p1);
        listaEstudiantes.add(p2);
        listaEstudiantes.add(p3);
        
        OperacionesEstudiantes op = new OperacionesEstudiantes(listaEstudiantes);
       
        System.out.println(op);
        
    }
}
