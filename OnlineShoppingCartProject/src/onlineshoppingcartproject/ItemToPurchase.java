/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshoppingcartproject;

/**
 *
 * @author Bobby Lo
 */
public class ItemToPurchase {

    //declare instance variables 
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;

    // Zero argumented constructors
    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "none";
    }

    //getters and setters for variables 
    public ItemToPurchase(String itemName, int itemPrice, int itemQuantity, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void printItemDescription() {
        System.out.println(itemName + ": " + itemDescription);
    }

    public String getName() {
        return itemName;
    }

    //getter and setters for name
    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    //getter and setters for price
    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    //getter and setters for quantity
    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    void printPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
