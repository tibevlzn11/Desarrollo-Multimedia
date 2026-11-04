import java.util.Scanner;
public class ejemplo_bidimensional {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double mat[][] = {  
                            {9.5, 9, 9.7,6.4,7.8,9.2},
                            {8.4,7.3,6.3,5.2},
                            {5.1,4.3,6.7,6.8,7.1,5.9,6.2,6.1},
                            {9.3,9.7,9,8.4,5},
                            {6.7,7,10,10,5,9.3,9}
                        };

        char grupos[] = {'A', 'B', 'C', 'D', 'E'};
        double promedios[] = new double[mat.length];
        double sumaGlobal = 0;
        int totalNotas = 0;

        // Promedio por grupo
        for (int i = 0; i < mat.length; i++) {
            double suma = 0;
            for (int j = 0; j < mat[i].length; j++) {
                suma += mat[i][j];
            }
            promedios[i] = suma / mat[i].length;
            sumaGlobal += suma;
            totalNotas += mat[i].length;
            System.out.printf("Promedio grupo %c: %.2f%n", grupos[i], promedios[i]);
        }

        // Promedio global (de todas las notas)
        double promedioGlobal = sumaGlobal / totalNotas;
        System.out.printf("Promedio global: %.2f%n", promedioGlobal);

        // Grupo con mejor y menor promedio
        int mejor = 0, peor = 0;
        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > promedios[mejor]) mejor = i;
            if (promedios[i] < promedios[peor]) peor = i;
        }
        System.out.printf("Grupo con mejor promedio: %c (%.2f)%n", grupos[mejor], promedios[mejor]);
        System.out.printf("Grupo con menor promedio: %c (%.2f)%n", grupos[peor], promedios[peor]);

        // int [][] b = {{1,2,3},{4,5,6}};

        // int [][] c = new int[3][];

        // c[0] = new int[5];
        // c[1] = new int[4];
        // c[2] = new int[8];

        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b[i].length; j++) {
        //         System.out.print(b[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

    }
}
