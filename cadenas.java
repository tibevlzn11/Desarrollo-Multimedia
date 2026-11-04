import java.util.Scanner;

public class cadenas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        int opcion;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("Cadena actual: \"" + cadena + "\"");
            System.out.println("1. Estadisticas basicas de la cadena");
            System.out.println("2. Formateo y conversion");
            System.out.println("3. Busqueda y validacion de un caracter o subcadena");
            System.out.println("4. Extraccion de subcadenas");
            System.out.println("5. Reemplazo dinamico de caracteres");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    estadisticas(cadena);
                    break;
                case 2:
                    System.out.println(formatear(cadena));
                    break;
                case 3:
                    System.out.print("Ingresa el caracter o palabra a buscar: ");
                    String buscar = sc.nextLine();
                    buscarSubcadena(cadena, buscar);
                    break;
                case 4:
                    System.out.print("Ingresa el indice inicial: ");
                    int inicio = leerEntero();
                    System.out.print("Ingresa el indice final: ");
                    int fin = leerEntero();
                    String sub = extraerSubcadena(cadena, inicio, fin);
                    if (sub != null) {
                        System.out.println("Subcadena extraida: \"" + sub + "\"");
                    }
                    break;
                case 5:
                    System.out.print("Caracter a reemplazar: ");
                    char viejo = leerCaracter();
                    System.out.print("Nuevo caracter: ");
                    char nuevo = leerCaracter();
                    String reemplazada = reemplazarCaracter(cadena, viejo, nuevo);
                    System.out.println("Cadena con reemplazo: \"" + reemplazada + "\"");
                    break;
                case 6:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
    }

    // Opcion 1: metodo con parametros y sin retorno
    public static void estadisticas(String cadena){
        System.out.println("Longitud: " + cadena.length());
        if (cadena.isEmpty()) {
            System.out.println("La cadena esta vacia, no hay primer ni ultimo caracter.");
            return;
        }
        System.out.println("Primer caracter: '" + cadena.charAt(0) + "'");
        System.out.println("Ultimo caracter: '" + cadena.charAt(cadena.length() - 1) + "'");
    }

    // Opcion 2: metodo con parametros y con retorno
    public static String formatear(String cadena){
        return "Mayusculas: " + cadena.toUpperCase()
             + "\nMinusculas: " + cadena.toLowerCase()
             + "\nSin espacios al inicio y final: \"" + cadena.trim() + "\"";
    }

    // Opcion 3: metodo con parametros (cadena y busqueda) y sin retorno
    public static void buscarSubcadena(String cadena, String buscar){
        int posicion = cadena.indexOf(buscar);
        if (buscar.isEmpty()) {
            System.out.println("No ingresaste nada para buscar.");
        } else if (posicion >= 0) {
            System.out.println("\"" + buscar + "\" SI se encuentra en la cadena, inicia en la posicion " + posicion);
        } else {
            System.out.println("\"" + buscar + "\" NO se encuentra en la cadena.");
        }
    }

    // Opcion 4: metodo con parametros (cadena, inicio, fin) y con retorno de la subcadena
    public static String extraerSubcadena(String cadena, int inicio, int fin){
        if (inicio < 0 || fin > cadena.length() || inicio > fin) {
            System.out.println("Indices no validos. Deben cumplir 0 <= inicio <= fin <= " + cadena.length());
            return null;
        }
        return cadena.substring(inicio, fin);
    }

    // Opcion 5: metodo con parametros y con retorno
    public static String reemplazarCaracter(String cadena, char viejo, char nuevo){
        return cadena.replace(viejo, nuevo);
    }

    public static int leerEntero(){
        while (true) {
            String linea = sc.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.print("Ingresa un numero valido: ");
            }
        }
    }

    public static char leerCaracter(){
        while (true) {
            String linea = sc.nextLine();
            if (!linea.isEmpty()) {
                return linea.charAt(0);
            }
            System.out.print("Ingresa un caracter: ");
        }
    }
}
