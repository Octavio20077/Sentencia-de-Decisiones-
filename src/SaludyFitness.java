import java.util.Scanner;

public class SaludyFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness*** ");

        // definimos las constantes
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASOS = 0.04; //valor aproximado, son kilocalorias

        //pedimos los valores al usuario
        var consola = new Scanner(System.in);

        System.out.print("Cual es tu nombre?: ");
        String nombrePersona = consola.nextLine();

        System.out.print("Cuantos pasos hiciste hoy?: ");
        int pasosDiarios = Integer.parseInt(consola.nextLine());

        //verificar si el usuario alcanzo la meta
        String metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? "Si :)" : "No :( ";

        //calculamos las calorias quemadas
        double caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASOS;

        //mostramos la informacion en la consola
        System.out.printf("""
                %nUsuario: %s
                Pasos Dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzados: %s
                """, nombrePersona, pasosDiarios, caloriasQuemadas, metaAlcanzada);

    }
}
