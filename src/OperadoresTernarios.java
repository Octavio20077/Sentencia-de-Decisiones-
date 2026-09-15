public class OperadoresTernarios {
    public static void main(String[] args) {
        System.out.println("***Operador Ternario***");

        //sintaxis
        //condicion? exp1 : exp2

        //Determinar si un numero es par o no
        int numero = 4;
        String resultado = (numero % 2 == 0 )? "par": "Impar";
        System.out.println("El numero: " + numero + " es " + resultado);

        //Calcula si es mayor de edad
        int edad = 18;
        String mensaje = (edad >= 18) ? "eres mayor" : "eres menor";
        System.out.println("Tienes: " + edad  + " " +  mensaje);

        //valor positivo, negativo o cero (operador ternario amidado)
        numero = -3;
        resultado = ( numero >= 0) ? "Es Positivo" : "Es Negativo";
        System.out.println("Tu numero es: " + numero + ", " +  resultado);
    }
}
