package heroes;

// Clase abstracta (padre): no se pueden crear objetos directamente de ella
public abstract class Superheroe {
    // Atributos privados (encapsulamiento)
    private String nombreReal;
    private String alias;
    private int nivelPoderBase;
    private double energiaActual;
    private int aniosExperiencia;

    // Constructor
    public Superheroe(String nombreReal, String alias, int nivelPoderBase,
                      double energiaActual, int aniosExperiencia) {
        this.nombreReal = nombreReal;
        this.alias = alias;
        this.nivelPoderBase = nivelPoderBase;
        this.energiaActual = energiaActual;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Muestra los datos del héroe
    public void mostrarFicha() {
        System.out.println("========================================");
        System.out.println("Alias:              " + alias);
        System.out.println("Nombre real:        " + nombreReal);
        System.out.println("Nivel poder base:   " + nivelPoderBase);
        System.out.println("Energía actual:     " + energiaActual + "%");
        System.out.println("Años experiencia:   " + aniosExperiencia);
        System.out.printf ("Poder de combate:   %.2f%n", calcularPoderCombate());
    }

    // Método abstracto: cada hijo DEBE implementarlo a su manera
    public abstract void usarPoderEspecial();

    // Cálculo base del poder de combate (los hijos lo sobrescriben)
    public double calcularPoderCombate() {
        return (nivelPoderBase * (energiaActual / 100.0)) + (aniosExperiencia * 2.0);
    }

    // Getters y setters
    public String getAlias() {
        return alias;
    }

    public void setAlias(String a) {
        this.alias = a;
    }

    // Getters adicionales para que las clases hijas puedan leer los atributos privados
    public String getNombreReal() {
        return nombreReal;
    }

    public int getNivelPoderBase() {
        return nivelPoderBase;
    }

    public double getEnergiaActual() {
        return energiaActual;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
}
