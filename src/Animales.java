public class Animales {
    private String animal;
    private String raza;
    private float peso;
    private int edad;
    private String color;
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String detalle() {
        String dt = "Animal: " + getAnimal() + "\n" +
                "Raza: " + getRaza() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Color: " + getColor();
        return dt;
    }
}
