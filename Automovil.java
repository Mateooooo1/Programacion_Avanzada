public class Automovil implements Electrico, Gasolina {
    private String marca;
    private String modelo;
    private int numeroPuertas;
    private int numeroAsientos;
    private Chips chips ;
    private Camara camara ;
    private Gps gps ;

    public Automovil(String marca, String modelo, int numeroPuertas, int numeroAsientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
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

    public Camara getcamara() {
        return new Camara();
    }

    public Chips getchips() {
        return new Chips();
    }

    public Gps getgps() {
        return new Gps();
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
