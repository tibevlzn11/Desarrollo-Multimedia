import java.util.Scanner;
public class introduccion {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");

        String nombres = lector.nextLine();

        System.out.println("¿Cual es tu edad?");
        byte edad = lector.nextByte();

        System.out.println("¿Cual es tu año de ingreso?");
        short anio_ingreso = lector.nextShort();

        System.out.println("¿Cual es tu numero de matricula?");
        long matricula = lector.nextLong();

        System.out.println("¿Cual es tu estatura?");
        float estatura = lector.nextFloat();

        System.out.println("¿Cual es tu peso?");
        double peso = lector.nextDouble();
        lector.nextLine();

        System.out.println("¿Cual es tu letra favorita?");
        char letraFavoria = lector.nextLine().charAt(0);

        System.out.println("¿Eres donador de organos? (si/no)");
        String donadorOrganos = lector.nextLine();
        boolean flagDonador = false;
        if(donadorOrganos.trim().equalsIgnoreCase("si") || donadorOrganos.trim().equalsIgnoreCase("sí"))
            flagDonador = true;

        System.out.println("¿Tiene Licencia de conducir? (si/no)");
        String licenciaConducir = lector.nextLine();
        boolean flagLicencia = false;
        if(licenciaConducir.trim().equalsIgnoreCase("si") || licenciaConducir.trim().equalsIgnoreCase("sí"))
            flagLicencia = true;

        System.out.println("========== CREDENCIAL ==========");
        System.out.println("Nombre: " + nombres);
        System.out.println("Año de ingreso: " + anio_ingreso + " | Matricula: " + matricula);
        System.out.println("Edad: " + edad + " | Peso: " + peso + " | Estatura: " + estatura);
        System.out.println("Letra favorita: " + letraFavoria);
        System.out.println("Donador de organos: " + (flagDonador ? "Si" : "No"));
        System.out.println("Licencia de conducir: " + (flagLicencia ? "Si" : "No"));
        System.out.println("=================================");

        lector.close();
    }   


}


