import java.util.Scanner;

/*
 * Practica 3: Sistema de Calificaciones
 * Tipos de datos, Wrappers, Constantes y Caracteres de barra invertida
 */
public class practica_3 {

    // Constante con el numero de materias; se usa en arreglos, ciclos y en el promedio
    static final int NUM_CALIFICACIONES = 7;

    // Constante con la calificacion minima aprobatoria
    static final double CALIFICACION_MINIMA = 60.0;

    // Ancho total de la boleta (para las lineas separadoras)
    static final int ANCHO = 96;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // ---------------- CAPTURA DE DATOS DEL ALUMNO ----------------
        System.out.println("\t\t*** CAPTURA DE DATOS DEL ALUMNO ***\n");

        System.out.print("Nombre del alumno: ");
        String nombre = lector.nextLine();

        System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimiento = lector.nextLine();

        System.out.print("Matricula: ");
        String matricula = lector.nextLine();

        System.out.print("Correo: ");
        String correo = lector.nextLine();

        System.out.print("Teléfono: ");
        String telefono = lector.nextLine();

        System.out.print("Carrera (Licenciatura): ");
        String carrera = lector.nextLine();

        System.out.print("Cuatrimestre: ");
        String cuatrimestre = lector.nextLine();

        System.out.print("Tipo de sangre: ");
        String tipoSangre = lector.nextLine();

        // Validacion del estado civil: solo se acepta soltero o casado
        String estadoCivil;
        do {
            System.out.print("Estado civil (soltero/casado): ");
            estadoCivil = lector.nextLine().trim().toLowerCase();
            if (!estadoCivil.equals("soltero") && !estadoCivil.equals("casado")) {
                System.out.println("\t[ERROR] Escribe \"soltero\" o \"casado\".");
            }
        } while (!estadoCivil.equals("soltero") && !estadoCivil.equals("casado"));
        // Primera letra en mayuscula para mostrarlo en la boleta
        estadoCivil = estadoCivil.substring(0, 1).toUpperCase() + estadoCivil.substring(1);

        System.out.print("Teléfono de contacto de emergencia: ");
        String contacto = lector.nextLine();

        System.out.print("Parentesco del contacto: ");
        String parentesco = lector.nextLine();

        // ---------------- CAPTURA DE MATERIAS Y CALIFICACIONES ----------------
        // Los tres arreglos usan la constante, asi siempre son exactamente 7 materias
        String[] claves = new String[NUM_CALIFICACIONES];
        String[] materias = new String[NUM_CALIFICACIONES];
        // Arreglo del wrapper Double (no del primitivo double)
        Double[] calificaciones = new Double[NUM_CALIFICACIONES];

        System.out.println("\n\t\t*** CAPTURA DE " + NUM_CALIFICACIONES + " MATERIAS Y CALIFICACIONES (0 - 100) ***");
        for (int i = 0; i < NUM_CALIFICACIONES; i++) {
            System.out.println("\nMateria " + (i + 1) + " de " + NUM_CALIFICACIONES + ":");

            System.out.print("\tClave de la materia: ");
            claves[i] = leerNoVacio(lector, "\tClave de la materia: ");

            System.out.print("\tNombre de la materia: ");
            materias[i] = leerNoVacio(lector, "\tNombre de la materia: ");

            double nota = -1;          // valor invalido para entrar al ciclo
            boolean valida = false;

            // Se repite la pregunta hasta que la calificacion sea un numero entre 0 y 100
            while (!valida) {
                System.out.print("\tCalificación de " + materias[i] + ": ");
                String entrada = lector.nextLine().trim();
                try {
                    nota = Double.parseDouble(entrada);   // Wrapper: convierte String a double
                    if (nota >= 0 && nota <= 100) {
                        valida = true;
                    } else {
                        System.out.println("\t[ERROR] La calificación debe estar entre 0 y 100. Intenta de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\t[ERROR] \"" + entrada + "\" no es un número válido. Intenta de nuevo.");
                }
            }

            // AUTOBOXING: el double primitivo se convierte automaticamente en objeto Double
            calificaciones[i] = nota;
        }

        // ---------------- CALCULOS ----------------
        double suma = 0;
        for (int i = 0; i < NUM_CALIFICACIONES; i++) {
            suma += calificaciones[i];   // UNBOXING: Double -> double para poder sumar
        }
        double promedio = suma / NUM_CALIFICACIONES;   // Se usa la constante en el calculo

        // Conversion explicita del promedio a entero usando el wrapper Integer
        Integer promedioEntero = Integer.valueOf((int) Math.round(promedio));

        String statusFinal = (promedio >= CALIFICACION_MINIMA) ? "APRUEBA" : "REPRUEBA";

        // ---------------- IMPRESION DE LA BOLETA ----------------
        String linea = "=".repeat(ANCHO);
        String lineaDelgada = "-".repeat(ANCHO);

        System.out.println("\n" + linea);
        System.out.println(centrar("UNIVA", ANCHO));
        System.out.println(centrar("Universidad del Valle de Atemajac", ANCHO));
        System.out.println(linea);

        // Datos del alumno en dos columnas: etiqueta \t valor \t etiqueta \t valor
        System.out.println(fila("Nombre del alumno:", nombre, "Matricula:", matricula));
        System.out.println(fila("Fecha Nacimiento:", fechaNacimiento, "Estado Civil:", estadoCivil));
        System.out.println(fila("Correo:", correo, "Teléfono:", telefono));
        System.out.println(fila("Licenciatura:", carrera, "Cuatrimestre:", cuatrimestre));
        System.out.println(fila("Tipo de Sangre:", tipoSangre, "", ""));
        System.out.println(fila("Contacto Emergencia:", contacto, "Parentesco:", parentesco));

        System.out.println(linea);
        System.out.println(centrar("Boleta de Calificaciones", ANCHO));
        System.out.println(linea);

        // Encabezado de la tabla
        System.out.println(String.format("%-8s", "CLAVE") + "\t" + String.format("%-40s", "MATERIAS")
                + "\t" + String.format("%5s", "NOTA") + "\t" + "STATUS");
        System.out.println(lineaDelgada);

        // Una fila por materia con su status individual
        for (int i = 0; i < NUM_CALIFICACIONES; i++) {
            String status = (calificaciones[i] >= CALIFICACION_MINIMA) ? "Aprueba" : "Reprueba";
            System.out.println(String.format("%-8s", claves[i]) + "\t"
                    + String.format("%-40s", materias[i]) + "\t"
                    + String.format("%5s", formatoNota(calificaciones[i])) + "\t"
                    + status);
        }

        System.out.println(lineaDelgada);
        System.out.println(String.format("%-8s", "") + "\t" + String.format("%40s", "PROMEDIO")
                + "\t" + String.format("%5s", promedioEntero) + "\t" + statusFinal);
        System.out.println(linea);

        // Informacion extra: promedio real con decimales
        System.out.println("\nPromedio exacto: " + String.format("%.2f", promedio)
                + "\t->\tPromedio entero (Integer.valueOf): " + promedioEntero);

        lector.close();
    }

    // Lee una linea y la vuelve a pedir si el usuario la deja vacia
    static String leerNoVacio(Scanner lector, String pregunta) {
        String texto = lector.nextLine().trim();
        while (texto.isEmpty()) {
            System.out.println("\t[ERROR] Este dato no puede quedar vacío.");
            System.out.print(pregunta);
            texto = lector.nextLine().trim();
        }
        return texto;
    }

    // Arma una fila de dos columnas (etiqueta/valor) separadas con tabuladores
    static String fila(String etiqueta1, String valor1, String etiqueta2, String valor2) {
        return String.format("%22s", etiqueta1) + "\t" + String.format("%-32s", valor1) + "\t"
                + String.format("%14s", etiqueta2) + "\t" + valor2;
    }

    // Centra un texto dentro de un ancho dado
    static String centrar(String texto, int ancho) {
        int espacios = (ancho - texto.length()) / 2;
        return " ".repeat(Math.max(0, espacios)) + texto;
    }

    // Muestra la nota sin ".0" si es entera (ej. 95.0 -> 95, 87.5 -> 87.5)
    static String formatoNota(Double nota) {
        if (nota == Math.floor(nota)) {
            return String.valueOf(nota.intValue());   // Wrapper: Double -> int
        }
        return String.valueOf(nota);
    }
}
