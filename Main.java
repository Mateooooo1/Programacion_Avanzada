public class Main {
    public static void main(String[] args) {
        
        Automovil automovil = new Automovil("Toyota", "Corolla", 4, 5);
        System.out.println("Marca del automóvil: " + automovil.getMarca());
        System.out.println("Modelo del automóvil: " + automovil.getModelo());
        automovil.cargarBateria(); 
        automovil.llenarTanque(); 
        automovil.arrancar(); 

	System.out.println();

	MotoElectrica motoElectrica = new MotoElectrica("Zero", "SR/F", 1000);
	System.out.println("Marca de la moto eléctrica: " + motoElectrica.getMarca());
	System.out.println("Modelo de la moto eléctrica: " + motoElectrica.getModelo());
	motoElectrica.cargarBateria(); 
	motoElectrica.encender();

        System.out.println();

        
        Moto moto = new Moto("Honda", "CBR500R", 500);
        System.out.println("Marca de la moto: " + moto.getMarca());
        System.out.println("Modelo de la moto: " + moto.getModelo());
        moto.cargarBateria(); 
        moto.llenarTanque(); 
        moto.arrancar(); 

        System.out.println();

        
        Avion avion = new Avion("Boeing", "747", 4);
        System.out.println("Marca del avión: " + avion.getMarca());
        System.out.println("Modelo del avión: " + avion.getModelo());
        avion.cargarCombustible(); 

        System.out.println();

        Barco barco = new Barco("Yamaha", "Exciter", 20);
        System.out.println("Marca del barco: " + barco.getMarca());
        System.out.println("Modelo del barco: " + barco.getModelo());
        barco.cargarCombustible(); 
    }
}
