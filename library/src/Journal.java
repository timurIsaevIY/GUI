public class Journal extends Publication {
    private String topic;
    private int journalNumber;

    public Journal(int year, String author, String name, String topic, int journalNumber) {
        super(year, author, name);
        this.journalNumber = journalNumber;
        this.topic = topic;
    }

}
