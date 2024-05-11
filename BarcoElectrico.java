public class BarcoElectrico extends Barco implements Electrico {
    
    public BarcoElectrico(String marca, String modelo, int eslora) {
        super(marca, modelo, eslora);
    }

    public void cargarBateria() {
        System.out.println("Cargando la batería del barco eléctrico...");
    }

    public void encender() {
        System.out.println("Encendiendo barco eléctrico...");
    }
}