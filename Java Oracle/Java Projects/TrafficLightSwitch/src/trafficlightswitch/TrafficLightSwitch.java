
package trafficlightswitch;

import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color code (1 for Red, 2 for Green, 3 for Yellow): ");
        int currentColor = scanner.nextInt();

        switch (currentColor) {
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }

        scanner.close();
    }
    
}
