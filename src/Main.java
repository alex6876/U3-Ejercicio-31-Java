import Sub_Clase.AlmacenamientoNube;
import Sub_Clase.ArregloSAN;
import Sub_Clase.UnidadNas;

public class Main {

    public static void main(String[] args) {

        UnidadNas nas = new UnidadNas(
                4000, 150, "Synology", 4, 5000
        );

        ArregloSAN san = new ArregloSAN(
                10000, 1200, "Dell", 12, 85000
        );

        AlmacenamientoNube nube = new AlmacenamientoNube(
                2000, 500, "AWS", 15
        );

        System.out.println("===== SISTEMAS DE ALMACENAMIENTO =====\n");

        nas.mostrarInformacion();

        System.out.println();

        san.mostrarInformacion();

        System.out.println();

        nube.mostrarInformacion();
    }
}