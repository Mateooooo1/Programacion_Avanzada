public class Moto implements Electrico, Gasolina {
    private String marca;
    private String modelo;
    private int cilindrada;
    private Chips chips ;
    private Camara camara ;
    private Gps gps ;

    public Moto(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.chips = new Chips();
        this.camara = new Camara();
        this.gps = new Gps();
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

    public Camara getcamara() {
        return new Camara();
    }

    public Chips getchips() {
        return new Chips();
    }

    public Gps getgps() {
        return new Gps();
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

    public void chipCapacidad() {
        getchips().capacidad();
    }
    public void camaraCapacidad() {
        getcamara().capacidad();
    }
    public void gpsCapacidad() {
        getgps().capacidad();
    }
}
