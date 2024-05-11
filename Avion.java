public class Avion {
    private String marca;
    private String modelo;
    private int numeroMotores;

    public Avion(String marca, String modelo, int numeroMotores) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroMotores = numeroMotores;
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

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public void cargarCombustible() {
        System.out.println("Cargando combustible del avión...");
    }
}