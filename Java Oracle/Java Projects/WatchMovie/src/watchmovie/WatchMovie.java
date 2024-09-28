
package watchmovie;

import java.util.Scanner;

public class WatchMovie {

    public static void main(String[] args) {
        System.out.print("Enter the movie ticket price \n");
        Scanner keyboard = new Scanner(System.in);
        int priceTicket = keyboard.nextInt();
        System.out.print("Enter the movie classification \n");
        int classification = keyboard.nextInt();
        
        if(priceTicket >= 12 && classification == 5){
            System.out.print("Estou interessado em assistir o filme");
        }else{
            System.out.print("Não interessado em assistir o filme");
        }
    }
    
}
