
package agevalidity;
import java.util.Scanner;

public class AgeValidity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean drivingUnderAge = (false);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade:");
        int age = scanner.nextInt();
        
        if(age <= 18){
            drivingUnderAge = true;
            System.out.println(drivingUnderAge);
        }
        else{
            drivingUnderAge = false;
            System.out.println(drivingUnderAge);
        }
    }
    
}
