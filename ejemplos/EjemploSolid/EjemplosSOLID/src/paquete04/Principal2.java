package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Principal2 obj = new Principal2();

        int opcion;
        
        ArrayList<Transporte> lista = new ArrayList();
        
        TiposTransporte tipos = new TiposTransporte();
        
        int terminador = 0;

        do {

            opcion = obj.menu();
            
            switch (opcion) {
                
                case 1: 
                    
                    System.out.println("Ingrese la coperativa de bus:");
                    sc.nextLine();
                    String coperativa = sc.nextLine();
                    
                    TransporteBus bus = new TransporteBus();
                    bus.establecerCooperativaBus(coperativa);
                    bus.establecerTarifa();
                    lista.add(bus);
                                      
                break;
                
                case 2: 
                    
                    System.out.println("Ingrese la coperativa de taxi:");
                    sc.nextLine();
                    String coperativat = sc.nextLine();
                    
                    TransporteTaxi taxi = new TransporteTaxi();
                    taxi.establecerCooperativaTaxi(coperativat);
                    taxi.establecerTarifa();
                    lista.add(taxi);
                                      
                break;
                
                case 3: 
                    
                    System.out.println("Ingrese la aerolinea:");
                    sc.nextLine();
                    String aerolinea = sc.nextLine();
                    
                    TransporteAereo aereo = new TransporteAereo();
                    aereo.establecerAerolinea(aerolinea);
                    aereo.establecerTarifa();
                    lista.add(aereo);
                                      
                break;
                
                case 4: 
                    
                    System.out.println("Ingrese el tipo de barco:");
                    sc.nextLine();
                    String tipo = sc.nextLine();
                    
                    TransporteMaritimo barco = new TransporteMaritimo();
                    barco.establecerTipo(tipo);
                    barco.establecerTarifa();
                    lista.add(barco);
                                      
                break;
                
                case 5: 
                    
                    tipos.establecerTransportes(lista);
                    tipos.establecerPromedioTarifas();
                    System.out.println(tipos);
                    
                    terminador = 1;
                                      
                break;
                
                default:
                    
                break;
                
            }

        } while (terminador != 1);
    }

    public static int menu() {

        int opc;

        System.out.println("Ingresar Bus:         [1]");
        System.out.println("Ingresar Taxi:        [2]");
        System.out.println("Ingresar Aereo:       [3]");
        System.out.println("Ingresar Maritimo:    [4]");
        System.out.println("Terminar y mostrar:   [5]");

        opc = sc.nextInt();

        return opc;
    }

}
