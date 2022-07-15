package paquete10;

public class Principal3 {

    public static void main(String[] args) {

        String nombreArchivoPelis = "data/peliculas.dat";

        LecturaPeliculas lecturaP = new LecturaPeliculas(nombreArchivoPelis);
            lecturaP.establecerPeliculas();
            System.out.println(lecturaP);

    }

}
