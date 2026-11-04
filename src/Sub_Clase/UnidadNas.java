package Sub_Clase;

import Super_Clase.AlmacenamientoServidor;

public class UnidadNas extends AlmacenamientoServidor {

    private int cantidadBahias;
    private double costoPorBahia;

    public UnidadNas(double capacidadGb, double tasaTransferenciaMb,
                     String proveedor, int cantidadBahias,
                     double costoPorBahia) {

        super(capacidadGb, tasaTransferenciaMb, proveedor);

        this.cantidadBahias = cantidadBahias;
        this.costoPorBahia = costoPorBahia;
    }

    @Override
    public double calcularCostoMensual() {
        return cantidadBahias * costoPorBahia;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== UNIDAD NAS ===");

        super.mostrarInformacion();

        System.out.println("Cantidad de bahías: " + cantidadBahias);
        System.out.println("Costo mensual: $" + calcularCostoMensual());
    }
}