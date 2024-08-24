/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chikens01;

/**
 *
 * @author 47423489824
 */
public class Chikens01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int Chicken = 3;
        int eggsPerChiken = 5;
        int totalEggs;
        
        //Segunda
        totalEggs = eggsPerChiken * Chicken;
        System.out.println("total ovos segunda :" + totalEggs);
        
        //Terça
        Chicken += 1;
        System.out.println("total galinhas terça :" + Chicken);
        totalEggs = totalEggs * 2;
        totalEggs = totalEggs + 5;
        System.out.println("total de ovos terça:" + totalEggs);
        
        //Quarta
        Chicken = Chicken / 2;
        System.out.println("total de galinhas restantes" + Chicken);
        totalEggs += eggsPerChiken * Chicken;
        System.out.println("TOTAL FINAL :" + totalEggs);
        
    }
    
}
