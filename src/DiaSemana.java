public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("***Dia de la semana con Switch***");
        int Dia = 9; //suponiendo que lunes : 1, martes : 2, estc ...
        switch (Dia) {
            case 1 -> System.out.println("Lunes");

            case 2 -> System.out.println("Martes");

            case 3 -> System.out.println("Miercoles");

            case 4 -> System.out.println("Jueves");

            case 5 -> System.out.println("Viernes");

            case 6 -> System.out.println("Sabado");

            case 7 -> System.out.println("Domingo");

            default -> System.out.println("Dia invalido");


        }
    }
}
