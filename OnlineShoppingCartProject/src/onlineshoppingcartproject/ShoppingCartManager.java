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
public class ShoppingCartManager {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Create an object of the class Scanner
        
        String customerName = scan.nextLine(); //Prompt the user to enter the customer's name
        String currentDate = scan.nextLine(); //Prompt the user to enter the current date
        
        System.out.println("Enter Customer's Name: ");   //Prompt the user to enter the customer's name.
        System.out.println("Enter Today's Date: "); //Prompt the user to enter the today's date.

        ShoppingCart s = new ShoppingCart(customerName, currentDate); //create object ShoppingCart and pass cust name and date
      
        System.out.println();
        System.out.println("Customer Name: " + s.getCustomerName()); //Display the customer's name and today's date.
        System.out.println("Today's Date: " + s.getCurrentDate());
        
//printTotal();
//printDescription();
//addItem();
//removeItem();
// ran out of time to work on this assignemnt, will have to submit what I have. sad face. 

    }

}
