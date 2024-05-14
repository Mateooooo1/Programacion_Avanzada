public class Gps extends Dispositivos {
    private String marca;
    private String modelo;

	public Gps(){}   
    public Gps(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    public void capacidad() {
        System.out.println("La Capacidad Del Gps Es Satelital");
    }
    public void marca() {
        System.out.println("Los Gps Es Garmin");
    }
    public void Costo() {
        System.out.println("Vale 175 mil pesos");
    }

}