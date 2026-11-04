package com.edu.netbeans.areaprismatriangular;

import java.util.Scanner;

public class AreaPrismaTriangularMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        double base = entrada.nextDouble();

        System.out.println("Ingrese la altura del triangulo: ");
        double alturadeltriangulo = entrada.nextDouble();

        System.out.println("Ingrese la altura del rectángulo: ");
        double alturadelrectangulo = entrada.nextDouble();

        AreaPrismaTriangular valores = new AreaPrismaTriangular(base, alturadelrectangulo, alturadeltriangulo);

        valores.imprimir();
    }
}
