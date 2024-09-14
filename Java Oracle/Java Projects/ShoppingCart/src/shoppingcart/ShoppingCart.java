/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart;

/**
 *
 * @author 47423489824
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        boolean outOfStock = false; // Assumindo que o item está em estoque

        if (quantity > 1) {
            message = custName + " wants to purchase " + quantity + " " + itemDesc + "s.";
        } else if (quantity == 0) {
            outOfStock = true;
        }

        if (outOfStock) {
            System.out.println("Desculpe, o item está esgotado.");
        } else {
            System.out.println(message + " Preço final: $" + total);
        }
    }
    
}
