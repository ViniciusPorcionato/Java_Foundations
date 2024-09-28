/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computefare;
import java.util.Scanner;

/**
 *
 * @author 47423489824
 */
public class ComputeFare {

    public static void main(String[] args) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare;
        
        if(age < 11){
            fare = 3;
        }else if (age > 11 && age < 65){
            fare = 5;
        }else{
            fare = 3;
        }
        
        System.out.print("Você pagará : US$" + fare);        
    }
}
