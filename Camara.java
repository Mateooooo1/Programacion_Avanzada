public class Camara extends Dispositivos {
    private String marca;
    private String modelo;
    private int numeroCamara;

	public Camara (){}
    public Camara(String marca, String modelo, int numeroCamara) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroCamara = numeroCamara;
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

    public int getNumeroCamara() {
        return numeroCamara;
    }

    public void setNumeroCamara(int numeroCamara) {
        this.numeroCamara = numeroCamara;
    }
    public void capacidad() {
        System.out.println("La Capacidad De La Memoria De La Camara Va Un 80%");
    }
    public void marca() {
        System.out.println("La Marca De La Camara Es Canon");
    }
    public void Costo() {
        System.out.println("No es un costo, Es un regalo");
    }

}