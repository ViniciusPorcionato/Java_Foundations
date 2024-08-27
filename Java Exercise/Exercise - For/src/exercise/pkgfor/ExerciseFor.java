/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkgfor;

/**
 *
 * @author porci
 */
public class ExerciseFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variável do tipo string
        String word = "ViniciusPorcionato";
        
        //loop for 
        //para cada caractere c no array resultante da conversão de word para um array de caracteres, execute o bloco de código dentro do loop
        //word.toCharArray() : converte a string word em um array de caracteres
        for (char c : word.toCharArray()) {
            System.out.print(c + "-");
        }
        
    }

}
