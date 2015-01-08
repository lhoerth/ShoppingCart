/**
 * Created by Logan on 1/7/2015.
 */
public class LineItem {
    // Fields/Member variables
    private String name;
    private int quantity;
    private double price;

    // Constructor method
    public LineItem(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.price = pricePerUnit;
    }

    // Accessor method
    public double getCost() {
        // returns total cost of the line item
        // (unit price X quantity)
        return this.price*this.quantity;
    }

    // Mutator method
    public void setQuantity(int newQuantity) {
        // sets the number of units of the item
        this.quantity = newQuantity;
    }
}
