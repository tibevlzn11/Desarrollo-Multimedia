package main;

import heroes.Batman;
import heroes.IronMan;
import heroes.Superman;
import heroes.Thor;

public class ClasePrincipal {
    public static void main(String[] args) {
        // ===== Instancia de Batman =====
        // (nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia, tipoHerramientas)
        Batman batman = new Batman("Bruce Wayne", "Batman", 60, 90.0, 15, "batarangs, gancho y bombas de humo");
        batman.mostrarFicha();
        batman.usarPoderEspecial();

        // ===== Instancia de Superman =====
        // (nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia, origenKryptoniano)
        Superman superman = new Superman("Clark Kent", "Superman", 95, 100.0, 12, true);
        superman.mostrarFicha();
        superman.usarPoderEspecial();

        // ===== Instancia de Iron Man =====
        // (nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia, modeloArmadura)
        IronMan ironMan = new IronMan("Tony Stark", "Iron Man", 85, 80.0, 10, "LXXXV");
        ironMan.mostrarFicha();
        ironMan.usarPoderEspecial();

        // ===== Instancia de Thor =====
        // (nombreReal, alias, nivelPoderBase, energiaActual, aniosExperiencia, armaAsgardiana)
        Thor thor = new Thor("Thor Odinson", "Thor", 92, 95.0, 20, "martillo Mjolnir");
        thor.mostrarFicha();
        thor.usarPoderEspecial();

        // ===== Uso del getter y setter =====
        System.out.println("========================================");
        batman.setAlias("El Caballero Oscuro");
        System.out.println("Nuevo alias de Batman: " + batman.getAlias());
    }
}
