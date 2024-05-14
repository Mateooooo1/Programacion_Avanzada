public class Barco {
    private String marca;
    private String modelo;
    private int eslora;
    private Chips chips ;
    private Camara camara ;
    private Gps gps ;

    public Barco(String marca, String modelo, int eslora) {
        this.marca = marca;
        this.modelo = modelo;
        this.eslora = eslora;
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

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void cargarCombustible() {
        System.out.println("Cargando combustible del barco...");
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
