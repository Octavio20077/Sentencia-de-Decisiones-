import java.util.Scanner;

public class TiendaenLinea {
    public static void main(String[] args) {
        var conosla = new Scanner(System.in);
        System.out.println("***Tienda e linea con Descuentos***");

        //Condiciones
        final double MONT_MIN_DESC =  1000.00;

        //solicitamos informacion de la compra
        System.out.print("Cual fue el monto de tu compra?: ");
        double MontoCompra = Double.parseDouble(conosla.nextLine());

        System.out.print("Eres miembro de la tienda (true/false)?: ");
        boolean MiembroTienda = Boolean.parseBoolean(conosla.nextLine());

        //Calculamos el descuento
        double descuento = 0.0; //descuento del 10%

        //verificamos cada paso con los datos proporcionados
        if (MontoCompra >= MONT_MIN_DESC && MiembroTienda){
            descuento = 0.1; //descuento equivaente al 10%
        } else if (MiembroTienda) {
            descuento = 0.05; //Descuento equivalente al 5%
        }
        else {
            descuento = 0; //descuento equivalente al 0%
        }
        //hacemos los calculos para obtener el monto final
        if (descuento != 0){
            double montoDescuento = MontoCompra * descuento;
            double montoFinal = MontoCompra - montoDescuento;
            System.out.printf("""
                    %nFelicidades!, has obtenido un descuento del %.0f%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de descuento: $%.2f%n
                    """, descuento * 100, MontoCompra, montoDescuento, montoFinal );
        }
        else {
            System.out.printf("""
                    %nNo obtuviste ningun tipo de descuento 
                    te invitamos a hacerte mimebro de la tienda!
                    Monto final de la compra: $%.2f%n
                    """, MontoCompra);

        }


    }
}
