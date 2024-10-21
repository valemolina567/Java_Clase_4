public class Main {
    public static void main(String[] args) {
        Animales perro = new Animales();        // Automovil() es el nombre del constructor.
        perro.setAnimal("Perro");
        perro.setRaza("Shih-Tzu");
        perro.setPeso(6.9f);
        perro.setEdad(5);
        perro.setColor("Blanco");
        System.out.println(perro.detalle());
        //get leer valor asignado
        // set asignar un valor
    }
}