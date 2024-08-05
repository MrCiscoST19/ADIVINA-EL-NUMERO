package Segundo; // Define el paquete al que pertenece esta clase

import java.util.Random; // Importa la clase Random para generar números aleatorios
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class AdivinaElNumero { // Define la clase pública AdivinaElNumero
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Random aleatorio = new Random(); // Crea un objeto Random para generar números aleatorios
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        int premio; // Variable para almacenar el número aleatorio a adivinar
        int intento; // Variable para almacenar el número que el usuario intenta adivinar
        int respuesta; // Variable para almacenar la respuesta del usuario sobre si quiere seguir jugando
        int diferencia; // Variable para almacenar la diferencia entre el número adivinado y el número premiado

        System.out.println("!Bienvenido al juego, mi estimad@!"); // Mensaje de bienvenida al usuario
        System.out.println("Contexto: En este juego te romperás la cabeza para adivinar un número entre 1 al 100."); // Explicación del juego
        System.out.println("Nota: Solo los más inteligentes con IQ mayor al promedio, pueden adivinar ese número en tres intentos."); // Nota sobre la dificultad del juego
        System.out.println("Regla: No puedes pedir ayuda a los demás, te estamos observando y estamos cerca de lo que tu piensas."); // Regla del juego
        System.out.println("Buena suerte, y que la fuerza te acompañe!"); // Mensaje de buena suerte
        System.out.println("--------------------------------------------------------------------------------------------------------"); // Línea separadora

        do {
            premio = aleatorio.nextInt(101); // Genera un número aleatorio entre 0 y 100 (incluidos ambos)

            do {
                System.out.println("Adivina un número del 1 al 100: "); // Solicita al usuario que ingrese un número
                intento = scanner.nextInt(); // Lee el número ingresado por el usuario

                // Calcula la diferencia entre el número premiado y el número ingresado
                if (intento < premio) {
                    diferencia = premio - intento;
                } else {
                    diferencia = intento - premio;
                }

                // Da un mensaje basado en la diferencia
                if (diferencia <= 10) {
                    System.out.println("Estás cerca"); // Mensaje si la diferencia es 10 o menor
                } else if (diferencia <= 20) {
                    System.out.println("Muy cerca"); // Mensaje si la diferencia es 20 o menor
                } else {
                    System.out.println("Demasiado lejos de adivinar"); // Mensaje si la diferencia es mayor a 20
                }

                // Indica al usuario si debe ingresar un número mayor o menor
                if (intento < premio) {
                    System.out.println("Ingresa un número mayor"); // Mensaje si el número ingresado es menor que el premiado
                } else {
                    System.out.println("Ingresa un número menor"); // Mensaje si el número ingresado es mayor que el premiado
                }

                System.out.println("--------------------------------------------------------------------------------------------------------"); // Línea separadora

            } while (intento != premio); // Repite el ciclo mientras el número ingresado no sea igual al número premiado

            System.out.println("¡Felicidades! Haz logrado Adivinar el número."); // Mensaje de felicitación al usuario

            do {
                System.out.print("¿Te atreves a seguir Adivinando? (1 para sí, 0 para no): "); // Pregunta si el usuario quiere seguir jugando
                respuesta = scanner.nextInt(); // Lee la respuesta del usuario
            } while (respuesta != 0 && respuesta != 1); // Repite el ciclo hasta que la respuesta sea 0 o 1

        } while (respuesta == 1); // Repite el juego si el usuario elige continuar (respuesta == 1)
    }
}
