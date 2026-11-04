Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Sistemas de Almacenamiento para Servidores (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🗄️ Simulación de Sistemas de Almacenamiento en Servidores (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela una infraestructura de almacenamiento tecnológico empresarial, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de soportes de datos (unidades NAS, arreglos SAN y almacenamiento en la nube) con reglas de cálculo de costos y rendimiento especializadas. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores e invocación de métodos mediante `super`, la organización en paquetes (`Super_Clase` y `Sub_Clase`), la sobrescritura polimórfica de métodos (`@Override`) y la gestión de operaciones financieras y técnicas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`AlmacenamientoServidor` (Paquete `Super_Clase`)**: Clase base que centraliza los atributos y comportamientos comunes de cualquier solución de almacenamiento de datos.
* **Atributos protegidos (`protected`)**: `capacidadGb`, `tasaTransferenciaMb` y `proveedor`, permitiendo que las clases hijas accedan directamente a las especificaciones base del hardware o servicio.
* **Constructor**: Inicializa los datos comunes de la infraestructura de almacenamiento.
* **Métodos operativos**:
* `calcularRendimiento()`: Retorna la tasa de transferencia en MB/s.
* `calcularCostoMensual()`: Método base que retorna `0`, diseñado para ser sobrescrito por las subclases.
* `mostrarInformacion()`: Imprime por consola el proveedor, la capacidad total y la tasa de transferencia.




* **`UnidadNas` (Paquete `Sub_Clase`)**: Extiende de `AlmacenamientoServidor` para modelar dispositivos de almacenamiento en red locales basados en bahías de discos.
* **Atributos privados (`private`)**: `cantidadBahias` y `costoPorBahia`.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura las propiedades físicas de las bahías.
* **Sobrescritura (`@Override`)**:
* `calcularCostoMensual()`: Multiplica la cantidad de bahías por el costo unitario para calcular el gasto mensual.
* `mostrarInformacion()`: Reutiliza `super.mostrarInformacion()` y detalla las bahías y el costo mensual calculado.




* **`ArregloSAN` (Paquete `Sub_Clase`)**: Extiende de `AlmacenamientoServidor` para modelar redes de almacenamiento de alta velocidad con costos fijos de mantenimiento.
* **Atributos privados (`private`)**: `cantidadDiscos` y `costoMantenimiento`.
* **Constructor**: Utiliza `super(...)` y asigna la cantidad de discos y el valor de mantenimiento.
* **Sobrescritura (`@Override`)**:
* `calcularCostoMensual()`: Retorna directamente el costo fijo de mantenimiento del arreglo.
* `mostrarInformacion()`: Muestra los datos base mediante `super`, la cantidad de discos y el costo mensual asociado.




* **`AlmacenamientoNube` (Paquete `Sub_Clase`)**: Extiende de `AlmacenamientoServidor` para modelar infraestructura virtualizada con cobro variable por volumen contratado.
* **Atributo privado (`private`)**: `costoPorGbMensual`.
* **Constructor**: Utiliza `super(...)` y configura la tarifa mensual por cada gigabyte.
* **Sobrescritura (`@Override`)**:
* `calcularCostoMensual()`: Multiplica la capacidad total en GB por el costo unitario mensual por giga.
* `mostrarInformacion()`: Muestra la información general mediante `super`, detalla el costo por GB y el importe total resultante.




* **`Main`**: Punto de entrada del programa. Instancia una unidad NAS, un arreglo SAN y un servicio de almacenamiento en la nube con especificaciones técnicas reales, e invoca sus métodos de visualización para imprimir por consola los reportes detallados y costos operativos de cada solución.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Polimórfico de Costos:** Cada solución de almacenamiento implementa su propia fórmula financiera para calcular el gasto mensual (basado en bahías para NAS, costo fijo para SAN y consumo por volumen para la nube).
2. **Modularización por Paquetes:** La separación física del código en los paquetes `Super_Clase` y `Sub_Clase` favorece el orden arquitectónico y la encapsulación de los componentes del sistema.
3. **Reutilización Estructural con `super`:** Las subclases delegan la impresión de las especificaciones técnicas genéricas a la superclase, evitando duplicación de código en la presentación de datos.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== SISTEMAS DE ALMACENAMIENTO =====

=== UNIDAD NAS ===
Proveedor: Synology
Capacidad: 4000.0 GB
Tasa de transferencia: 150.0 MB/s
Cantidad de bahías: 4
Costo mensual: $20000.0

=== ARREGLO SAN ===
Proveedor: Dell
Capacidad: 10000.0 GB
Tasa de transferencia: 1200.0 MB/s
Cantidad de discos: 12
Costo de mantenimiento: $85000.0

=== ALMACENAMIENTO EN LA NUBE ===
Proveedor: AWS
Capacidad: 2000.0 GB
Tasa de transferencia: 500.0 MB/s
Costo por GB mensual: $15.0
Costo mensual total: $30000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía de Hardware y Servicios:** Modelado de arquitecturas tecnológicas mediante una estructura limpia de herencia orientada a objetos.
* **Sobrescritura de Métodos (`@Override`):** Implementación dinámica de operaciones de cálculo económico según la naturaleza específica de cada proveedor de almacenamiento.
* **Diseño Modular y Paquetes:** Clara separación entre clases base y derivadas utilizando namespaces de Java para estructurar proyectos escalables.
