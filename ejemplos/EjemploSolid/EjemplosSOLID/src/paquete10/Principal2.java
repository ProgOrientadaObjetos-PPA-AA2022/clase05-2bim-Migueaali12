package paquete10;

public class Principal2 {

    public static void main(String[] args) {

        //Creaccion de archivo
        
        String nombreArchivoPelis = "data/peliculas.dat";
        EscrituraPeliculas archivoPeliculas
                = new EscrituraPeliculas(nombreArchivoPelis);

        //------------------
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");

        APIAmazonMovie api2 = new APIAmazonMovie();

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");

        APIstarPlus api3 = new APIstarPlus();
        api3.establecerApiKey("2547896");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");

        APIDirectvGO api4 = new APIDirectvGO();
        api4.establecerApiKey("8795456");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");

        //Envio de archivo
        
        archivoPeliculas.establecerRegistroPeliculas(gp);
        archivoPeliculas.establecerSalida();
        archivoPeliculas.establecerRegistroPeliculas(gp2);
        archivoPeliculas.establecerSalida();
        archivoPeliculas.establecerRegistroPeliculas(gp3);
        archivoPeliculas.establecerSalida();
        archivoPeliculas.establecerRegistroPeliculas(gp4);
        archivoPeliculas.establecerSalida();
        archivoPeliculas.cerrarArchivo();
        
        System.out.println("Elementos enviados al archivo...");

    }

}
