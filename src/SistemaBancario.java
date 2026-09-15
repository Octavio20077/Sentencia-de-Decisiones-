import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("***Bienvenidos al sistema Bancario***");

        var consola = new Scanner(System.in);

        System.out.print("Deseas salir del sistema(true/false)?: ");
        boolean salirSistema = Boolean.parseBoolean(consola.nextLine());
         //verificamos aplicando una logica inversa
        if (!salirSistema){
            System.out.println("Continuamos dentro del sistema...");
        }
        else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
