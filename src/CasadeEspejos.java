import javax.swing.*;
import java.util.Scanner;

public class CasadeEspejos {
    public static void main(String[] args) {
        System.out.println("***Bienvedinos a la casa de los espejos***");

        var consola = new Scanner(System.in);
        System.out.print("Cual es tu edad: ");
       int Edad = Integer.parseInt(consola.nextLine());
        System.out.print("Tienes miedo a la oscuridad?: ");
        boolean MiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        //verificamos
        if (!MiedoOscuridad && Edad >= 10 )
        {
            System.out.println("Puedes entrar a la casa de los espejos.");
        }

        else{
            System.out.println("Lo siento, no puedes entrar. ");

        }
    }
}
