package polimorfismo;
import java.util.Scanner;

public abstract class ClasePadre {

    protected int numero1, numero2, resultado;
    Scanner ingreso = new Scanner(System.in);

    public void SolicitarDatos() {
        System.out.print("Ingrese el primer numero: ");
        numero1 = ingreso.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        numero2 = ingreso.nextInt();
    }

    public abstract void Operaciones();

    public void ImprimirResultado(){
        System.out.println(resultado);
    }
}
