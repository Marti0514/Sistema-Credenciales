package sistema;

// Estudiante: Martina Pasquel
// Fecha: 23-08-2025
// Matricula: 290578351

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] argas) {
        //Definicion de las credenciales validas en el sistema
        String validUsername = "usuario123";
        String validPassword = "claveSegura";

        // Variables para guardar los datos ingresados por el  usuario
        String username; //se almacenará el user ingresado
        String password; //se almacenará la contraseña ingresada

        //Contador de intentos fallidos y límite permitido
        int attempts = 0; //Inicio en cero
        final int maxAttempts = 3; //Límite de intentos

        //Banderapara saber si el usuario accedió
        boolean accesoConcedido = false;

        //Scanner para leer la entrada por teclado
        Scanner scanner = new Scanner(System.in);

        //Bucle que se ejecuta mientras no se excedan los intentos
        do {
            System.out.print("Nombre de usuario: ");
            username = scanner.nextLine();

            System.out.print("Contraseña: ");
            password = scanner.nextLine();

            //Verificacion de credenciales
            if (username.equals(validUsername) && password.equals(validPassword)) {
                accesoConcedido = true; //Se concede si ambas son verdaderas
                break;  //Salimos del bucle
            } else {
                //Si una comparacion falla, incrementa el contador de intentos
                attempts++;
                //Informamos al usuario de los intentos
                System.out.println("Credenciales incorrectas. Intento " + attempts + " de " + maxAttempts + ".");
            }
        } while (attempts < maxAttempts);
        // El bucle termina cuando el usuario logre ingresar o supere el numero de intentos

        if (accesoConcedido) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Has superado el número máximo de intentos. El acceso ha sido bloqueado.");
        }
        //Cerramos el Scanner para liberar el recurso de entrada
        scanner.close();
    }
}
