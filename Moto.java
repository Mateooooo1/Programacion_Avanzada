public class Moto implements Electrico, Gasolina {
    private String marca;
    private String modelo;
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
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
        System.out.println("Cargando la batería de la moto...");
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
