package main;

import operaciones.HijaDividir;
import operaciones.HijaMultiplicar;
import operaciones.HijaRestar;
import operaciones.HijaSumar;

public class ClasePrincipal {
    public static void main(String[] args) {
        HijaSumar RespuestaSuma = new HijaSumar();
        RespuestaSuma.SolicitarDatos();
        RespuestaSuma.Sumar();
        System.out.print("La suma es : ");
        RespuestaSuma.ImprimeResultado();

        HijaRestar RespuestaResta = new HijaRestar();
        RespuestaResta.SolicitarDatos();
        RespuestaResta.Restar();
        System.out.print("La resta es : ");
        RespuestaResta.ImprimeResultado();

        HijaMultiplicar RespuestaMultiplicacion = new HijaMultiplicar();
        RespuestaMultiplicacion.SolicitarDatos();
        RespuestaMultiplicacion.Multiplicar();
        System.out.print("La multiplicación es : ");
        RespuestaMultiplicacion.ImprimeResultado();

        HijaDividir RespuestaDivision = new HijaDividir();
        RespuestaDivision.SolicitarDatos();
        RespuestaDivision.Dividir();
        System.out.print("La división es : ");
        RespuestaDivision.ImprimeResultado();
    }
}
