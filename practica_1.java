import SeresVivos.Animal;
import SeresVivos.AnimalDomestico;
import SeresVivos.AnimalGranja;

/*
 * Practica 1: Clases, Atributos y Metodos
 * Clase base: SeresVivos :: Animal
 * Subclases (herencia): SeresVivos :: AnimalDomestico y SeresVivos :: AnimalGranja
 *
 * Compilar: javac practica_1.java SeresVivos/*.java
 * Ejecutar: java practica_1
 */
public class practica_1 {

    public static void main(String[] args) {

        // ---------------- ANIMAL DOMESTICO ----------------
        AnimalDomestico mascota = new AnimalDomestico("Firulais", "Labrador", "Tiberio", "Perro", 25.0,
                new String[] {"Cafe", "Blanco"}, Animal.TipoPelaje.CORTO, Animal.Genero.MACHO, 12);

        System.out.println("\t\t*** ANIMAL DOMESTICO ***\n");
        mascota.mostrarDatos();
        System.out.println(mascota.hacerSonido());
        mascota.jugar("pelota");
        mascota.vacunar("Rabia");
        mascota.entrenar("sentarse");
        mascota.comer(2.0);          // metodo heredado de Animal
        mascota.mostrarDatos();

        // ---------------- ANIMAL DE GRANJA ----------------
        AnimalGranja vaca = new AnimalGranja("VAC-001", AnimalGranja.Producto.LECHE, "15/03/2024", "Vaca", 4,
                450.0, new String[] {"Blanco", "Negro"}, Animal.TipoPelaje.CORTO, Animal.Genero.HEMBRA, 20);

        System.out.println("\n\t\t*** ANIMAL DE GRANJA ***\n");
        vaca.mostrarDatos();
        System.out.println(vaca.hacerSonido());
        vaca.comer(15.0);            // metodo heredado de Animal
        double litros = vaca.producir();
        System.out.println("Produccion del dia: " + String.format("%.2f", litros) + " litros de " + vaca.getProducto());
        vaca.trasladar("Corral 2");
        vaca.dormir(6);              // metodo heredado de Animal
        vaca.revisarSalud();
        vaca.mostrarDatos();

        // Atributo de ambito de clase: se consulta desde la clase, no desde un objeto
        System.out.println("\nTotal de animales registrados: " + Animal.getTotalAnimales());
    }
}
