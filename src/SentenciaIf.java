public class SentenciaIf {
    public static void main(String[] args) {
        int Edad = 15;
        if (Edad >= 18) {
            System.out.println("eres mayor de edad");
        }
         else if (Edad >= 13 && Edad < 18) {
                System.out.println("eres un adolecente");
            }
         else System.out.println("Eres un niño");
    }

    }
