package operaciones;
import java.util.Scanner;
//clase padre
public class ClasePadre {
    protected int numero1, numero2, resultado;
    Scanner ingreso = new Scanner(System.in);

    //Método que solicita números al usuario
    public void SolicitarDatos(){
        System.out.print("Ingrese el primer numero: ");
        numero1 = ingreso.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = ingreso.nextInt();
    }

    //Método imprime el resultado en pantalla
    public void ImprimeResultado(){
        System.out.println(resultado);
    }
}
