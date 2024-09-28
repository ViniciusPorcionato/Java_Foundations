
package computeclass;

import java.util.Random;

public class ComputeMethods {
     public double fToC(double degreesF) {
        return (degreesF - 32) * 5.0 / 9.0;
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public int roll() {
        Random rand = new Random();
        return rand.nextInt(6) + 1 + rand.nextInt(6) + 1; // soma de dois dados
    }
}
