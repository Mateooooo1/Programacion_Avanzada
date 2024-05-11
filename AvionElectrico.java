public class AvionElectrico extends Avion implements Electrico {
    
    public AvionElectrico(String marca, String modelo, int numeroMotores) {
        super(marca, modelo, numeroMotores);
    }

    public void cargarBateria() {
        System.out.println("Cargando la batería del avión eléctrico...");
    }

    public void encender() {
        System.out.println("Encendiendo avión eléctrico...");
    }
}
