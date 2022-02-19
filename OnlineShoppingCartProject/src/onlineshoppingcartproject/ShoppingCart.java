/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshoppingcartproject;

import java.util.ArrayList;

/**
 *
 * @author Bobby Lo
 */
public class ShoppingCart {

    private String customerName; //decalre private variables name and date
    private String currentDate;
    ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>(); //arraylist for cartitems 

    ;

    // default constructors
public ShoppingCart() {
        customerName = "none";
        currentDate = "February 1, 2016";
    }
//getters and setters for variables name and date
    public ShoppingCart(String name, String date) {
        this.currentDate = date;
        this.customerName = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    //add items to array list
    public void addItem(ItemToPurchase i) {
        cartItems.add(i);
    }

    //removes item from array list
    public void removeItem(String itemName) {
        for (int i = 0; i < cartItems.size(); ++i) { //for loop cartItems
            ItemToPurchase item = cartItems.get(i);
            if (itemName.equals(item.getName())) {
                cartItems.remove(i);
            } else {
                System.out.println("Item not found in cart. Nothing modified."); //prints item not in cart
            }
        }
    }

    public void modifyItem(ItemToPurchase item, String itemName) // modify item in cart
    {
        for (int i = 0; i < cartItems.size(); ++i) {
            item = cartItems.get(i);
            if (itemName.equals(item.getName())) {
                cartItems.get(i).setName("");
                cartItems.get(i).setDescription("");
                cartItems.get(i).setPrice(20);
                cartItems.get(i).setQuantity(5);
            } else {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
    }

    public int getNumItemsInCart() { // returns total items in cart

        int sum = 0;
        for (ItemToPurchase i : cartItems) {
            sum = sum + i.getQuantity();
        }
        return sum;
    }

    public double getCostOfCart() { // returns total cost of cart

        double costOfCart = 0;
        for (ItemToPurchase i : cartItems) {
            costOfCart = costOfCart + i.getPrice();
        }
        return costOfCart;
    }

    public void printTotal() { // print total shopping 

        if (cartItems != null && cartItems.size() > 0) {
            System.out.println(customerName + "'s Shopping Cart - " + currentDate);
            System.out.println("Number of Items: " + cartItems.size());
            System.out.println();
            for (ItemToPurchase i : cartItems) {
                i.printPrice();
            }
        } else {
            System.out.println("Shopping cart is empty.");
        }
    }

    public void printDescriptions() { //print Description of items 
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + cartItems.size());
        System.out.println();
        System.out.println("Item Descriptions");
        for (ItemToPurchase i : cartItems) {
            i.printItemDescription();
        }
    }
}
