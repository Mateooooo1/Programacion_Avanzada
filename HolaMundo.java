public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo 12345");

        int edad = 25;
        System.out.println("Hola mundo, mi edad es: " + edad);

        System.out.println("La suma de mi edad consigo misma es: " + (edad + edad));

        Persona luis = new Persona();
        luis.caminar();
    }
}
