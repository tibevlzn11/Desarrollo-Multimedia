package heroes;

public class Thor extends Superheroe {
    private String armaAsgardiana;

    public Thor(String nombreReal, String alias, int nivelPoderBase,
                double energiaActual, int aniosExperiencia, String armaAsgardiana) {
        super(nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia);
        this.armaAsgardiana = armaAsgardiana;
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println("¡Thor convoca rayos con su " + armaAsgardiana + " y su fuerza asgardiana!");
    }

    // (nivelPoderBase * 1.25) + experiencia extra
    @Override
    public double calcularPoderCombate() {
        // Experiencia normal: igual que en la clase padre (2 puntos por año)
        double experienciaNormal = getAniosExperiencia() * 2.0;
        // Experiencia extra por ser asgardiano: la mitad más (1 punto adicional por año)
        double experienciaExtra = getAniosExperiencia() * 1.0;

        return (getNivelPoderBase() * 1.25) + experienciaNormal + experienciaExtra;
    }
}
