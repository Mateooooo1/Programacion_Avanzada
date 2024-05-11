public class Automovil implements Electrico, Gasolina {
    private String marca;
    private String modelo;
    private int numeroPuertas;
    private int numeroAsientos;

    public Automovil(String marca, String modelo, int numeroPuertas, int numeroAsientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void cargarBateria() {
        System.out.println("Cargando la batería del automóvil...");
    }

    public void llenarTanque() {
        // Implementación del método llenarTanque
    }

    public void arrancar() {
        // Implementación del método arrancar
    }

    public void encender() {
        // Implementación del método encender
    }
}
