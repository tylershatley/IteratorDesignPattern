package iteratordesignpattern;


public class WishListIterator implements Iterator{
    private Item[] items;
    private int position = 0;

    /**
     * Constructor that accepts an array of items
     * @param items
     */
    public WishListIterator(Item[] items) {
        this.items = items;
    }

    /**
     * Method needed due to WishListIterator implementing Iterator
     * returns true if there is more items to iterate over
     */
    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
    }
    /**
     * Method needed due to WishListIterator implementing Iterator 
     * Returns the next item if there is one, and null otherwuse
     */
    @Override
    public Item next() {
        Item item = items[position];
        
        if (hasNext()) {
            position = position + 1;
            return item;
        }
        else {
            return null;
        }
    }
}
