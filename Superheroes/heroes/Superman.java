package heroes;

public class Superman extends Superheroe {
    private boolean origenKryptoniano;

    public Superman(String nombreReal, String alias, int nivelPoderBase,
                    double energiaActual, int aniosExperiencia, boolean origenKryptoniano) {
        super(nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia);
        this.origenKryptoniano = origenKryptoniano;
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println("¡Superman vuela por los cielos y usa su visión láser y super fuerza! (Origen kryptoniano: "
                + (origenKryptoniano ? "Sí" : "No") + ")");
    }

    // Cálculo base * 1.5
    @Override
    public double calcularPoderCombate() {
        return super.calcularPoderCombate() * 1.5;
    }
}
