package SeresVivos;

/*
 * SeresVivos :: Animal
 * Clase base (abstracta). Reune los atributos y metodos que comparten todos los animales.
 * No se pueden crear objetos de Animal directamente, solo de sus subclases.
 */
public abstract class Animal {

    // ---------------- LISTAS DE PROPIEDADES (tipos enumerados) ----------------
    // Solo se permiten estos valores en los atributos genero y tipoPelaje
    public enum Genero { MACHO, HEMBRA }
    public enum TipoPelaje { CORTO, LARGO, PLUMAS, LANA, SIN_PELO }

    // ---------------- ATRIBUTOS ----------------
    // Sintaxis: [visibilidad] nombre [multiplicidad] [:tipo] [= valor inicial] [lista-propiedades]
    // protected (#): visibles para las subclases AnimalDomestico y AnimalGranja
    protected int numPatas = 4;
    protected int numOjos = 2;
    protected String especie;
    protected double peso = 0.0;
    protected String[] color = new String[3];      // multiplicidad [1..3]
    protected TipoPelaje tipoPelaje;
    protected String region;
    protected String habitat;
    protected Genero genero;
    protected int expectativaVida;

    // Atributo con ambito de clase (static): lo comparten todos los objetos
    public static int totalAnimales = 0;

    // ---------------- CONSTRUCTOR ----------------
    public Animal(String especie, int numPatas, double peso, String[] color, TipoPelaje tipoPelaje,
                  String region, String habitat, Genero genero, int expectativaVida) {
        this.especie = especie;
        this.numPatas = numPatas;
        this.peso = peso;
        this.color = color;
        this.tipoPelaje = tipoPelaje;
        this.region = region;
        this.habitat = habitat;
        this.genero = genero;
        this.expectativaVida = expectativaVida;
        totalAnimales++;
    }

    // ---------------- METODOS ----------------
    // Sintaxis: [visibilidad] nombre [(lista de parametros)] [:tipo devuelto] [lista-propiedades]

    // Metodo abstracto: cada subclase decide que sonido hace su animal
    public abstract String hacerSonido();

    // Aumenta el peso segun los kilos que come (10% se convierte en peso)
    public void comer(double kilos) {
        peso += kilos * 0.1;
        System.out.println("El/la " + especie + " comio " + kilos + " kg. Peso actual: "
                + String.format("%.2f", peso) + " kg");
    }

    public void dormir(int horas) {
        System.out.println("El/la " + especie + " durmio " + horas + " horas en su " + habitat + ".");
    }

    // Imprime los atributos comunes; las subclases lo amplian con los suyos
    public void mostrarDatos() {
        System.out.println("Especie: " + especie + " | Genero: " + genero);
        System.out.println("Patas: " + numPatas + " | Ojos: " + numOjos + " | Peso: "
                + String.format("%.2f", peso) + " kg");
        System.out.println("Color: " + String.join(", ", color) + " | Pelaje: " + tipoPelaje);
        System.out.println("Region: " + region + " | Habitat: " + habitat);
        System.out.println("Expectativa de vida: " + expectativaVida + " años");
    }

    // Metodo de clase (static): se llama con Animal.getTotalAnimales()
    public static int getTotalAnimales() {
        return totalAnimales;
    }

    // ---------------- GETTERS Y SETTERS ----------------
    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
