package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {

        ClasePadre RespuestaSuma = new HijaSumar();
        RespuestaSuma.SolicitarDatos();
        RespuestaSuma.Operaciones();
        RespuestaSuma.ImprimirResultado();

        ClasePadre RespuestaResta = new HijaRestar();
        RespuestaResta.SolicitarDatos();
        RespuestaResta.Operaciones();
        RespuestaResta.ImprimirResultado();

        ClasePadre RespuestaMultiplicacion = new HijaMultiplicar();
        RespuestaMultiplicacion.SolicitarDatos();
        RespuestaMultiplicacion.Operaciones();
        RespuestaMultiplicacion.ImprimirResultado();

        ClasePadre RespuestaDivision = new HijaDividir();
        RespuestaDivision.SolicitarDatos();
        RespuestaDivision.Operaciones();
        RespuestaDivision.ImprimirResultado();
    }
}
