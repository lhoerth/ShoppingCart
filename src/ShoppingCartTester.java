/**
 * Created by Logan on 1/7/2015.
 */
public class ShoppingCartTester {
    public static void main(String[] args) {
        // Single Item
        ShoppingCart singleItemCart = new ShoppingCart();
        LineItem volleyBall = new LineItem("Volley Ball", 2, 14.19);
        singleItemCart.add(volleyBall);
        System.out.println("singleItemCart total: $" + singleItemCart.getTotalCost());

        // Typical case
        ShoppingCart typicalCart = new ShoppingCart();
        LineItem[] stuff = new LineItem[5];
        stuff[0] = new LineItem("Umbrella", 1, 2.99);
        stuff[1] = new LineItem("Sunglasses", 1, 5.99);
        stuff[2] = new LineItem("Sandals", 1, 11.97);
        stuff[3] = new LineItem("Inflatable Beach Ball", 1, 13.99);
        stuff[4] = new LineItem("Picnic Blanket", 1, 9.00);
        for (int i = 0; i < 5; i++){
            typicalCart.add(stuff[i]);
        }
        System.out.println("typicalCart total: $" + typicalCart.getTotalCost());

        // Full cart
        ShoppingCart fullCart = new ShoppingCart();
        LineItem[] moreStuff = new LineItem[10];
        moreStuff[0] = new LineItem("Umbrella", 3, 2.99);
        moreStuff[1] = new LineItem("Sunglasses", 3, 5.99);
        moreStuff[2] = new LineItem("Sandals", 3, 11.97);
        moreStuff[3] = new LineItem("Inflatable Beach Ball", 2, 13.99);
        moreStuff[4] = new LineItem("Picnic Blanket", 3, 9.00);
        moreStuff[5] = new LineItem("Volley Ball", 2, 14.19);
        moreStuff[6] = new LineItem("Volleyball Net", 1, 28.47);
        moreStuff[7] = new LineItem("Goggles", 2, 15.99);
        moreStuff[8] = new LineItem("Snorkel", 2, 0.95);
        moreStuff[9] = new LineItem("Pail and Shovel", 2, 5.00);
        for (int i = 0; i < 10; i++){
            fullCart.add(moreStuff[i]);
        }
        System.out.println("fullCart total: $" + fullCart.getTotalCost());

        // Too many items
        ShoppingCart overflowCart = new ShoppingCart();
        LineItem[] mostStuff = new LineItem[11];
        mostStuff[0] = new LineItem("Umbrella", 3, 2.99);
        mostStuff[1] = new LineItem("Sunglasses", 3, 5.99);
        mostStuff[2] = new LineItem("Sandals", 3, 11.97);
        mostStuff[3] = new LineItem("Inflatable Beach Ball", 2, 13.99);
        mostStuff[4] = new LineItem("Picnic Blanket", 3, 9.00);
        mostStuff[5] = new LineItem("Volley Ball", 2, 14.19);
        mostStuff[6] = new LineItem("Volleyball Net", 1, 28.47);
        mostStuff[7] = new LineItem("Goggles", 2, 15.99);
        mostStuff[8] = new LineItem("Snorkel", 2, 0.95);
        mostStuff[9] = new LineItem("Pail and Shovel", 2, 5.00);
        mostStuff[10] = new LineItem("Kite", 5, 15.80);
        for (int i = 0; i < 11; i++){
            overflowCart.add(mostStuff[i]);
        }
        System.out.println("overflowCart total: $" + overflowCart.getTotalCost());

        // Empty cart
        ShoppingCart emptyCart = new ShoppingCart();
        System.out.println("emptyCart total: $" + emptyCart.getTotalCost());

    }
}
