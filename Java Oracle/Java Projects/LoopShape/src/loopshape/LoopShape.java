
package loopshape;

public class LoopShape {

   public static void main(String[] args) {
        createRectangle(5, 4);
        System.out.println(); // Espaço entre as formas
        createTriangle(5);
    }

    public static void createRectangle(int width, int height) {
        // Validação das dimensões
        if (width < 1 || height < 1) {
            System.out.println("As dimensões devem ser maiores ou iguais a 1.");
            return;
        }
        
        for (int i = 0; i < height; i++) {
            // Imprimir uma linha do retângulo
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println(); // Mover para a próxima linha
        }
    }

    public static void createTriangle(int size) {
        // Validação do tamanho
        if (size < 1) {
            System.out.println("O tamanho deve ser maior ou igual a 1.");
            return;
        }
        
        for (int i = 1; i <= size; i++) {
            // Imprimir espaços antes do caractere '#'
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            // Imprimir os caracteres '#'
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println(); // Mover para a próxima linha
        }
    }
    
}
