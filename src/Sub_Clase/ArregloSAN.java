package Sub_Clase;

import Super_Clase.AlmacenamientoServidor;

public class ArregloSAN extends AlmacenamientoServidor {

    private int cantidadDiscos;
    private double costoMantenimiento;

    public ArregloSAN(double capacidadGb, double tasaTransferenciaMb,
                      String proveedor, int cantidadDiscos,
                      double costoMantenimiento) {

        super(capacidadGb, tasaTransferenciaMb, proveedor);

        this.cantidadDiscos = cantidadDiscos;
        this.costoMantenimiento = costoMantenimiento;
    }

    @Override
    public double calcularCostoMensual() {
        return costoMantenimiento;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== ARREGLO SAN ===");

        super.mostrarInformacion();

        System.out.println("Cantidad de discos: " + cantidadDiscos);
        System.out.println("Costo de mantenimiento: $"
                + calcularCostoMensual());
    }
}
