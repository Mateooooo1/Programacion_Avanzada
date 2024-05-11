public class Barco {
    private String marca;
    private String modelo;
    private int eslora; // Longitud del barco en metros

    public Barco(String marca, String modelo, int eslora) {
        this.marca = marca;
        this.modelo = modelo;
        this.eslora = eslora;
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

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void cargarCombustible() {
        System.out.println("Cargando combustible del barco...");
    }
}
