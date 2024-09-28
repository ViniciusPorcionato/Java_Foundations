
package processname;

import java.util.Scanner;

public class ProcessName {


    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para inserir o nome
        System.out.print("Type your name: ");
        String nomeCompleto = scanner.nextLine();
        
        // Divide o nome completo em partes
        String[] partes = nomeCompleto.split(" ");
        
        // Extrai o primeiro e o último nome
        String primeiroNome = partes[0];
        String ultimoNome = partes[partes.length - 1];
        
        // Obtém a inicial do primeiro nome
        char inicialPrimeiroNome = primeiroNome.charAt(0);
        
        // Exibe o resultado no formato desejado
        System.out.println("Your name is: " + ultimoNome + ", " + inicialPrimeiroNome + ".");
        
        // Fecha o scanner
        scanner.close();
    }
    
}
