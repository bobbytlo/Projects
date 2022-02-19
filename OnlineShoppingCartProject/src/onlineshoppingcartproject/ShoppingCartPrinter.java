/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshoppingcartproject;

import java.util.Scanner;

/**
 *
 * @author Bobby Lo
 */
public class ShoppingCartPrinter {

    //Declare variables 
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // scan for user input
        String item1 = "";
        String item2 = "";
        String description1 = "";
        String description2 = "";
        int price1 = 0;
        int price2 = 0;
        int quantity1 = 0;
        int quantity2 = 0;

        ItemToPurchase itemInfo1 = new ItemToPurchase(); //create item 1 object then assign previosuly accepted variables to object as attributes 
        ItemToPurchase itemInfo2 = new ItemToPurchase(); //create item 2 object then assign previosuly accepted variables to object as attributes 

        System.out.println("Item 1");
        System.out.println("Enter the item name:"); // prints what to input
        itemInfo1.setName(scnr.nextLine()); //scans name and new line for user input

        System.out.println("Enter the item 1 description:");
        itemInfo1.setDescription(scnr.nextLine());

        System.out.println("Enter the item price:"); //prints price for user
        itemInfo1.setPrice(scnr.nextInt()); // scans price next int token

        System.out.println("Enter the item quantity:");
        itemInfo1.setQuantity(scnr.nextInt()); //scans quantity next int token
        System.out.println(); //new line

        System.out.println("Item 2"); //prompts user for item 2
        itemInfo2.setName(scnr.nextLine()); //takes  name and new line

        System.out.println("Enter the item name:"); // prompts for item name
        itemInfo2.setName(scnr.nextLine()); // scans name 

        System.out.println("Enter the item 2 description:");
        itemInfo2.setDescription(scnr.nextLine());

        System.out.println("Enter the item price:"); // prompts user item price
        itemInfo2.setPrice(scnr.nextInt()); // scan for price 

        System.out.println("Enter the item quantity:"); // prompts item quantity
        itemInfo2.setQuantity(scnr.nextInt()); // scans quantity
        System.out.println();

        //total cost is printed of above collected inputs
        System.out.println("TOTAL COST");

        System.out.println(itemInfo1.getName() + " " + itemInfo1.getQuantity() + " @ $" + itemInfo1.getPrice() + " = $" + (itemInfo1.getPrice() * itemInfo1.getQuantity()));

        System.out.println(itemInfo1.getName() + ": " + itemInfo1.getDescription());

        System.out.println(itemInfo2.getName() + " " + itemInfo2.getQuantity() + " @ $" + itemInfo2.getPrice() + " = $" + (itemInfo2.getPrice() * itemInfo2.getQuantity()));

        System.out.println(itemInfo2.getName() + ": " + itemInfo2.getDescription());

        System.out.println();

        System.out.println("Total: $" + ((itemInfo1.getPrice() * itemInfo1.getQuantity()) + (itemInfo2.getPrice() * itemInfo2.getQuantity())));

    }
}
