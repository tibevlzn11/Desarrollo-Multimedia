package SeresVivos;

import java.util.ArrayList;

/*
 * SeresVivos :: AnimalDomestico
 * Hereda (extends) todos los atributos y metodos de Animal y agrega los suyos.
 */
public class AnimalDomestico extends Animal {

    // ---------------- ATRIBUTOS ----------------
    private String nombre;
    private String raza;
    private String dueno;
    private boolean entrenado = false;
    private ArrayList<String> vacunas = new ArrayList<>();   // multiplicidad [0..*]

    // ---------------- CONSTRUCTOR ----------------
    // super(...) manda los datos comunes al constructor de la clase base Animal
    public AnimalDomestico(String nombre, String raza, String dueno, String especie, double peso,
                           String[] color, TipoPelaje tipoPelaje, Genero genero, int expectativaVida) {
        super(especie, 4, peso, color, tipoPelaje, "Urbana", "Casa", genero, expectativaVida);
        this.nombre = nombre;
        this.raza = raza;
        this.dueno = dueno;
    }

    // ---------------- METODOS ----------------

    // Implementacion del metodo abstracto de Animal
    @Override
    public String hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            return nombre + " dice: ¡Guau guau!";
        } else if (especie.equalsIgnoreCase("gato")) {
            return nombre + " dice: ¡Miau!";
        }
        return nombre + " hace un sonido.";
    }

    public void jugar(String juguete) {
        System.out.println(nombre + " esta jugando con su " + juguete + ".");
    }

    public void vacunar(String vacuna) {
        vacunas.add(vacuna);
        System.out.println(nombre + " recibio la vacuna: " + vacuna + ".");
    }

    public void entrenar(String truco) {
        entrenado = true;
        System.out.println(nombre + " aprendio el truco: " + truco + ".");
    }

    // Sobrescribe mostrarDatos(): usa el de Animal y agrega los atributos propios
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Raza: " + raza + " | Dueño: " + dueno);
        super.mostrarDatos();
        System.out.println("Entrenado: " + (entrenado ? "Si" : "No")
                + " | Vacunas: " + (vacunas.isEmpty() ? "Ninguna" : String.join(", ", vacunas)));
        System.out.println("---------------------------------------");
    }

    // ---------------- GETTERS Y SETTERS ----------------
    public String getNombre() {
        return nombre;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
}
