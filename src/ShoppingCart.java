/**
 * Created by Logan on 1/7/2015.
 */
public class ShoppingCart {
    // Fields
    private LineItem[] items;
    private int nItems;

    // Default constructor
    public ShoppingCart() {
        this.nItems = 0;
        this.items = new LineItem[10];
    }

    public void add(LineItem newItem) {
        if (this.nItems < 10) {
            this.items[nItems++] = newItem;
        }
    }

    public double getTotalCost() {
        // Accumulate cost of every item
        double sum = 0;
        for(int i = 0; i < this.nItems; i++) {
            sum+=this.items[i].getCost();
        }
        return sum;
    }
}
