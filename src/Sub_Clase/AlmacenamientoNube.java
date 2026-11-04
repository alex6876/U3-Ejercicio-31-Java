package Sub_Clase;

import Super_Clase.AlmacenamientoServidor;

public class AlmacenamientoNube extends AlmacenamientoServidor {

    private double costoPorGbMensual;

    public AlmacenamientoNube(double capacidadGb,
                              double tasaTransferenciaMb,
                              String proveedor,
                              double costoPorGbMensual) {

        super(capacidadGb, tasaTransferenciaMb, proveedor);

        this.costoPorGbMensual = costoPorGbMensual;
    }

    @Override
    public double calcularCostoMensual() {
        return capacidadGb * costoPorGbMensual;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== ALMACENAMIENTO EN LA NUBE ===");

        super.mostrarInformacion();

        System.out.println("Costo por GB mensual: $"
                + costoPorGbMensual);

        System.out.println("Costo mensual total: $"
                + calcularCostoMensual());
    }
}
