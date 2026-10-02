import java.util.Scanner;

public class ejemplo_array {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        // int val1 = 23;
        // int []arreglo1 = new int[10]; //se llena con numeros pares
        // int []arreglo2 = {12, 20,45, val1, ++val1, 5};
        // System.out.println("El tamano del arreglo 1 es: "+arreglo1.length);
        // System.out.println("El tamano del arreglo 2 es: "+arreglo2.length);
        // System.out.println("Arreglo 1:");
        // for(int i = 0; i < arreglo1.length; i++ ){
        //     arreglo1[i] = ((i + 1) * 2);
        //     // arreglo1[i] = i * 2;
        //     System.out.println("posicion: "+i+" - valor: "+arreglo1[i]);
        // }
        //     System.out.println("Arreglo 2:");
        // for(int i = 0; i < arreglo2.length; i++)
        //      System.out.println("posicion: "+i+" - valor: "+arreglo2[i]);

        
        int []numeros;
        int countPares = 0, countImp = 0;
        System.out.println("Cuantas calificaciones quieres guardar?");
        numeros = new int [lector.nextInt()];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("ingresa el numero " + (i+1));
            numeros[i] = lector.nextInt();
            if((numeros[i]%2) == 0) 
                countPares++;
            else 
                countImp++;
        }
        System.out.println("Pares: " + countPares + " Impares: " + countImp);

    }



}
