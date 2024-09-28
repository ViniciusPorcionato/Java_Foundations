
package javalibs;

import java.util.Scanner;

public class JavaLibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de entradas do usuário
        System.out.print("Digite o nome de um personagem: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o nome de um lugar: ");
        String lugar = scanner.nextLine();

        System.out.print("Digite a idade do personagem (número inteiro): ");
        int idade = scanner.nextInt();

        System.out.print("Digite a quantidade de moedas (número decimal): ");
        double moedas = scanner.nextDouble();

        System.out.print("Digite o nome de um animal: ");
        scanner.nextLine(); // Limpa o buffer
        String animal = scanner.nextLine();

        System.out.print("Digite um verbo: ");
        String verbo = scanner.nextLine();

        System.out.print("Digite um adjetivo: ");
        String adjetivo = scanner.nextLine();

        System.out.print("Digite o tempo (número inteiro): ");
        int tempo = scanner.nextInt();

        System.out.print("Digite uma cor: ");
        scanner.nextLine(); // Limpa o buffer
        String cor = scanner.nextLine();

        System.out.print("Digite o nome de uma comida: ");
        String comida = scanner.nextLine();

        // Construindo a história
        String historia = "Era uma vez, " + nome + ", um(a) " + adjetivo + " personagem de " + idade + " anos. \n"
                + "Ele(a) vivia em " + lugar + ", onde tinha " + moedas + " moedas. \n"
                + "Um dia, " + nome + " decidiu " + verbo + " com seu(a) amigo(a) " + animal + ". \n"
                + "Depois de " + tempo + " horas de aventura, eles encontraram uma " + cor + " " + comida + ". \n"
                + "E assim, a história continua...";

        // Exibindo a história resultante
        System.out.println("\n" + historia);

        scanner.close();
    }
    
}
