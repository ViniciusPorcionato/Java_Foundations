
import computeclass.ComputeMethods;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods cm = new ComputeMethods();

        // Converter Fahrenheit para Celsius
        double degreesF = 100; // Exemplo
        double celsius = cm.fToC(degreesF);
        System.out.println(degreesF + "F em Celsius é: " + celsius);

        // Calcular hipotenusa
        int a = 3; // Exemplo
        int b = 4; // Exemplo
        double hypotenuse = cm.hypotenuse(a, b);
        System.out.println("Hipotenusa de " + a + " e " + b + " é: " + hypotenuse);

        // Simular rolagem de dados
        int sumOfDice = cm.roll();
        System.out.println("Soma dos dados rolados é: " + sumOfDice);
    }
}


