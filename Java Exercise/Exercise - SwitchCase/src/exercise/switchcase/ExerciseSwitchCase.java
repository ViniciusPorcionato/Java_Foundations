/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.switchcase;

/**
 *
 * @author porci
 */
public class ExerciseSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month = 3;
        String str;
        switch (month) {
            case 1:
                str = "January";
                break;
            case 2:
                str = "February";
                break;
            case 3:
                str = "March";
                break;
            default:
                str = "Some other month";
                break;
        }

// Outputs: Result March
        System.out.println("Result " + str);

    }

}
