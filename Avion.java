public class Avion {
    private String marca;
    private String modelo;
    private int numeroMotores;
    private Chips chips ;
    private Camara camara ;
    private Gps gps ;

    public Avion(String marca, String modelo, int numeroMotores) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroMotores = numeroMotores;
        this.chips = new Chips();
        this.camara = new Camara();
        this.gps = new Gps();
    }

    public String getMarca() {
        return marca;
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public void cargarCombustible() {
        System.out.println("Cargando combustible del avión...");
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