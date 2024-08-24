/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart01;

/**
 *
 * @author 47423489824
 */
public class ShoppingCart01 {

//    public static void main(String[] args) {
//        
//        String custName = "Alex";
//        String itemDesc = " quer comprar uma camisa";
//        String message = custName + itemDesc;
//        
//        System.out.println(message);
//        
//    }
    
        public static void main(String[] args) {
        
        String custName = "Alex";
        String itemDesc = " quer comprar uma camisa";
        
        double price = 12.99;
        double  tax = 5.99;
        int quantify = 2;
        
        double totalPrice;
        
        totalPrice = (price + tax) *  quantify;
        
        System.out.println(custName.concat(itemDesc));
        System.out.println("O custo total com imposto é: R$"+ totalPrice);
    }
    
}
