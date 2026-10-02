import java.util.Scanner;
public class Ejercicios {
    public static void main(String[] args) {
        ejercicio3();
    }

    public static void ejercicio2(){
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero limite");
        int limite = lector.nextInt();

        int a = 0;
        int b = 1;


        while (b <= limite) {
        System.out.println("valor A: " + a + "\n");
        System.out.println("valor B: " + b + "\n");
            int c = a + b;
            System.out.println("valor C: " + c + "\n");
            System.out.println("---------------------------------");
            if(c > limite) break;
            a = b;
            b = c;
        }  
    }

    public static void ejercicio3(){
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int N = lector.nextInt();

        int suma = 0;

        do {
            System.out.println("valor suma: " + suma + "\n");
            suma += (N%10);
            N = N / 10;
            System.out.println("valor de N: " + N + "\n");
        } while (N > 0);
        System.out.println("El Resultado es: " + suma);
    }
}
