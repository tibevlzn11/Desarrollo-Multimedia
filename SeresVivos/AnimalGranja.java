package SeresVivos;

/*
 * SeresVivos :: AnimalGranja
 * Hereda (extends) todos los atributos y metodos de Animal y agrega los suyos.
 */
public class AnimalGranja extends Animal {

    // Lista de propiedades: productos permitidos
    public enum Producto { LECHE, HUEVO, LANA, CARNE }

    // ---------------- ATRIBUTOS ----------------
    private String idArete;
    private Producto producto;
    private double produccionDiaria = 0.0;
    private String ubicacion = "Corral 1";
    private String fechaIngreso;

    // ---------------- CONSTRUCTOR ----------------
    public AnimalGranja(String idArete, Producto producto, String fechaIngreso, String especie, int numPatas,
                        double peso, String[] color, TipoPelaje tipoPelaje, Genero genero, int expectativaVida) {
        super(especie, numPatas, peso, color, tipoPelaje, "Rural", "Granja", genero, expectativaVida);
        this.idArete = idArete;
        this.producto = producto;
        this.fechaIngreso = fechaIngreso;
    }

    // ---------------- METODOS ----------------

    // Implementacion del metodo abstracto de Animal
    @Override
    public String hacerSonido() {
        if (especie.equalsIgnoreCase("vaca")) {
            return "La vaca " + idArete + " dice: ¡Muuu!";
        } else if (especie.equalsIgnoreCase("gallina")) {
            return "La gallina " + idArete + " dice: ¡Cocoroco!";
        }
        return "El animal " + idArete + " hace un sonido.";
    }

    // Regresa la produccion del dia (5% de su peso) y la guarda en el atributo
    public double producir() {
        produccionDiaria = peso * 0.05;
        return produccionDiaria;
    }

    public void trasladar(String nuevaUbicacion) {
        System.out.println(idArete + " se traslado de " + ubicacion + " a " + nuevaUbicacion + ".");
        ubicacion = nuevaUbicacion;
    }

    public void revisarSalud() {
        System.out.println("Revision de " + idArete + ": peso " + String.format("%.2f", peso) + " kg, "
                + (peso > 0 ? "estado saludable." : "requiere atencion."));
    }

    // Sobrescribe mostrarDatos(): usa el de Animal y agrega los atributos propios
    @Override
    public void mostrarDatos() {
        System.out.println("Arete: " + idArete + " | Ingreso: " + fechaIngreso + " | Ubicacion: " + ubicacion);
        super.mostrarDatos();
        System.out.println("Producto: " + producto + " | Produccion diaria: "
                + String.format("%.2f", produccionDiaria));
        System.out.println("---------------------------------------");
    }

    // ---------------- GETTERS Y SETTERS ----------------
    public Producto getProducto() {
        return producto;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
