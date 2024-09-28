
package displaymultples;

import java.util.Scanner;

public class DisplayMultples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();

        System.out.println("Múltiplos de " + numero + " de 1 a 12:");
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero * i);
        }

        scanner.close();
    }
    
}
