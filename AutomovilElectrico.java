public class AutomovilElectrico extends Automovil implements Electrico {
    
    public AutomovilElectrico(String marca, String modelo, int numeroPuertas, int numeroAsientos) {
        super(marca, modelo, numeroPuertas, numeroAsientos);
    }

    public void encender() {
        System.out.println("Encendiendo automóvil eléctrico...");
    }
}