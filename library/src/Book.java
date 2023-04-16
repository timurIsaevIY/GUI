public class Book extends Publication {
    private String publishingHouse;
    private int pageQuantity;

    public Book(int year, String author, String name, String publishingHouse, int pageQuantity) {
        super(year, author, name);
        this.pageQuantity = pageQuantity;
        this.publishingHouse = publishingHouse;
    }

}
