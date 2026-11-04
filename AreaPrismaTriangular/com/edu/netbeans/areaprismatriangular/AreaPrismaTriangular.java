package com.edu.netbeans.areaprismatriangular;

public class AreaPrismaTriangular {
    double vbase, valturatriangulo, valturarectangulo, areatotal;

    public AreaPrismaTriangular(double base, double alturadelrectangulo, double alturadeltriangulo) {
        this.vbase = base;
        this.valturatriangulo = alturadeltriangulo;
        this.valturarectangulo = alturadelrectangulo;
    }

    public void areatotal() {
        areatotal = (vbase * valturarectangulo * 3) + (((vbase * valturatriangulo) / 2) * 2);
    }

    public void imprimir() {
        areatotal();
        System.out.println("El área del prisma es: " + areatotal);
    }
}
