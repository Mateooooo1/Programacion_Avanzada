public class MotoElectrica extends Moto implements Electrico {
    
    public MotoElectrica(String marca, String modelo, int cilindrada) {
        super(marca, modelo, cilindrada);
    }

    public void encender() {
        System.out.println("Encendiendo moto eléctrica...");
    }
}
