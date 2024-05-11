public abstract class Parte {
    private String nombre;

    // Constructor con sobrecarga
    public Parte(String nombre) {
        this.nombre = nombre;
    }

    // Método getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}