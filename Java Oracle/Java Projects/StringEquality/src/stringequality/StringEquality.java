
package stringequality;

import java.util.Scanner;

public class StringEquality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); 

        if (nome.equals("Moe")) {
            System.out.println("Você é o rei do rock and roll");
        } else {
            System.out.println("Você não é o rei");
        }
    }
    
}
