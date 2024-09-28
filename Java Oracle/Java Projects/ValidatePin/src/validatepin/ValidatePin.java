
package validatepin;

import java.util.Scanner;


public class ValidatePin {

    public static void main(String[] args) {
        int pinValido = 1234; // PIN válido
        Scanner scanner = new Scanner(System.in);
        int pinInserido;

        System.out.println("Por favor, insira seu PIN:");

        // Loop para validar o PIN
        while (true) {
            pinInserido = scanner.nextInt();

            if (pinInserido == pinValido) {
                System.out.println("PIN correto! Você agora tem acesso à sua conta.");
                break; // Sai do loop
            } else {
                System.out.println("PIN incorreto. Tente novamente:");
            }
        }

        scanner.close();
    }
    
}
