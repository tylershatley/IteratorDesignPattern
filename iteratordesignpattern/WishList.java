package iteratordesignpattern;
import java.lang.reflect.Array;
import java.util.Arrays;

public class WishList {
    static final int MAX_ITEMS = 5;
    private String name;
    private Item []items;
    private int count = 0;
    /**
     * Wishlist holds the name of the wishlist
     * @param name
     */
    public WishList(String name) {
        this.name = name;
        items = new Item[MAX_ITEMS];
        this.count = count;
    }
    /**
     * addItem takes in
     * @param title
     * @param description
     * @param price
     * creates a next item and finds out the size and doubles it if so
     */
    public void addItem(String title, String description, double price) {
        Item item = new Item(title, description, price);
        if (count == MAX_ITEMS) {
            items = doubleArraySize(items);
        }
        else {
            items[count] = item;
            count += 1;
        }
    }
    /**
     * 
     * @return newWishListIterator of items
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }
    /**
     * Function i created to double the size of the array
     * while keeping in original contents
     * researched the Arrays.copyOf method, i like it
     * @param items
     * @return new array that is doubled compared to the param items
     * with origianl items content
     */
    private Item[] doubleArraySize(Item[] items) {
        int size = Array.getLength(items);
        Item [] doubledArr = Arrays.copyOf(items, size * 2);
        return doubledArr;
    }
}
