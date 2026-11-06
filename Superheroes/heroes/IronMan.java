package heroes;

public class IronMan extends Superheroe {
    private String modeloArmadura;

    public IronMan(String nombreReal, String alias, int nivelPoderBase,
                   double energiaActual, int aniosExperiencia, String modeloArmadura) {
        super(nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia);
        this.modeloArmadura = modeloArmadura;
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println("¡Iron Man dispara un rayo repulsor desde su armadura Mark: " + modeloArmadura + "!");
    }

    // Cálculo base * (energiaActual / 100.0): depende mucho de la energía de la armadura
    @Override
    public double calcularPoderCombate() {
        return super.calcularPoderCombate() * (getEnergiaActual() / 100.0);
    }
}
