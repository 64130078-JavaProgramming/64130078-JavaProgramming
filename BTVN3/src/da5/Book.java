package da5;

public class Book implements IBook{
	// Properties
    private int id;
    private String name;
    private String publishDate;
    private String author;
    private String language;
    private float averagePrice;
    
    // Array for 5 price elements
    private int[] PriceList = new int[5];

    // Constructor
    public Book(int id, String name, String publishDate, String author, String language) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
        this.language = language;
    }

    // Getters
    public int getId() {
        return id;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    // Setters for PriceList
    public void setPriceList(int[] prices) {
        if (prices.length == 5) {
            PriceList = prices;
        } else {
            System.out.println("Please provide exactly 5 prices.");
        }
    }

    // Implement the display method from IBook
    @Override
    public void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("Average Price: " + averagePrice);
    }

    // Method to calculate the average price
    public void calculate() {
        int sum = 0;
        for (int price : PriceList) {
            sum += price;
        }
        this.averagePrice = (float) sum / PriceList.length;
    }
}