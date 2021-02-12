package iteratordesignpattern;

public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Constructor for item that takes in
     * @param title
     * @param description
     * @param price
     * then assisgns the parameters to Item variables
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }
    /**
     * toString function, not sure of the point of it
     */
    public String toString() { 
        return this.description + "\nPrice: " + this.price; 
    }
    /**
     * method getPrice()
     * @return price of item
     */
    public double getPrice() {
        return this.price;
    }
    /**
     * Print method that prints off the title, description and price
     * I couldnt get my toString to work in here for whatever bizzare reason
     */
    public void print() {
        System.out.println("\n****** " + title + " ******\n" +
            description + "\nPrice: $" + price);
    }

}
