import java.util.Locale;
import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("***Sistema de Envios***");
         // definimos las tarifas por kg
        final double TARIFA_NACIONAL = 10.0;
        final double TARIFA_INTERNACIONAL = 20.0;

        //solicitamos los valores de destino y peso
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete: ");
        String destino = consola.nextLine().strip().toLowerCase();

        System.out.println("Ingresa el peso del paquete (en kg): ");
        double peso = Double.parseDouble(consola.nextLine());

        //calculo del envio del paquete
        Double costoEnvio = switch (destino){
            case "Nacional" -> peso * TARIFA_NACIONAL;
            case "Internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. ingresa Nacional/Internacional");
                yield null;
            }


        };
        //mostramos el costo de envio
        if (costoEnvio != null)
            System.out.printf("El costo de envio del paquete es $%.2f", costoEnvio);






    }
}
