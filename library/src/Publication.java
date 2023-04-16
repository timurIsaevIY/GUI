public abstract class Publication {
    private int year;
    private String author;
    private String name;
    private boolean isGiven = false;
    public Publication(int year, String author, String name) {
        this.year = year;
        this.author = author;
        this.name = name;
    }

    public boolean getIsGiven() {
        return isGiven;
    }

    public void setIsGiven(boolean isGiven) {
        this.isGiven = isGiven;
    }
}
