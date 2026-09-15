import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("***Valor Numerico Positivo***");

         var consola = new Scanner(System.in);
        System.out.println("Proporciona un numero: ");
        int Numero = Integer.parseInt(consola.nextLine());
        if (Numero > 0 ) {
            System.out.println("Es positivo = " + Numero);
        } else if (Numero < 0 ){
            System.out.println("Es negativo = " + Numero);

        }
        else {
            System.out.println("Es negativo = " + Numero);
        }
    }
}
