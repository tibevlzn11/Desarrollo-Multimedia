package heroes;

public class Batman extends Superheroe {
    private String tipoHerramientas;

    public Batman(String nombreReal, String alias, int nivelPoderBase,
                  double energiaActual, int aniosExperiencia, String tipoHerramientas) {
        super(nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia);
        this.tipoHerramientas = tipoHerramientas;
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println("¡Batman despliega su batarang y utiliza su inteligencia táctica con: "
                + tipoHerramientas + "!");
    }

    // Cálculo base + 100 de bonus
    @Override
    public double calcularPoderCombate() {
        return super.calcularPoderCombate() + 100;
    }
}
