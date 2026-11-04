package Super_Clase;

public class AlmacenamientoServidor {

    protected double capacidadGb;
    protected double tasaTransferenciaMb;
    protected String proveedor;

    public AlmacenamientoServidor(double capacidadGb,
                                  double tasaTransferenciaMb,
                                  String proveedor) {

        this.capacidadGb = capacidadGb;
        this.tasaTransferenciaMb = tasaTransferenciaMb;
        this.proveedor = proveedor;
    }

    public double calcularRendimiento() {
        return tasaTransferenciaMb;
    }

    public double calcularCostoMensual() {
        return 0;
    }

    public void mostrarInformacion() {

        System.out.println("Proveedor: " + proveedor);
        System.out.println("Capacidad: " + capacidadGb + " GB");
        System.out.println("Tasa de transferencia: "
                + tasaTransferenciaMb + " MB/s");
    }
}
