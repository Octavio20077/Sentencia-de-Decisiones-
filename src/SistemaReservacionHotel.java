import java.util.Scanner;

public class SistemaReservacionHotel {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("***Sistema de reserva de Hotel***");

        //variables de hotel
        final double TARIFA_DIARIA_SIN_VISTA_MAR = 150.50;
        final double TARIFA_DIARIA_CON_VISTA_MAR = 190.50;

        //pedimos la informacion al cliente
        System.out.print("Cual es tu nombre?: ");
        String NombreCliente = consola.nextLine();

        System.out.print("Dias de estadia en el hotel?: ");
        int DiasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("La quiere con vista al mar (true/false)?: ");
        boolean VistaMar = Boolean.parseBoolean(consola.nextLine());

        //calculo del costo total de la estancia
        double CostoTotal = 0.0;
        if (VistaMar) {
            CostoTotal = DiasEstadia * TARIFA_DIARIA_CON_VISTA_MAR;
        } else {
            CostoTotal = DiasEstadia * TARIFA_DIARIA_SIN_VISTA_MAR;
        }
        System.out.printf("""
                %n------------Detalles de la Reservacion------------
                Cliente: %s
                Dias de estadia: %d
                Costo Total: $%.2f
                Con vista al mar?: %s
                """,NombreCliente, DiasEstadia,CostoTotal,VistaMar ? "Si :)" : "No :)" );



    }

}

