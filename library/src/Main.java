public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("Timur", "Isaev","timurIsaev@gmail.com", library);
        User user2 = new User("Ruslan", "Nigmatullin","RuslanNigmatullin@gmail.com", library);
        Book book1 = new Book(1949,"George Orwell", "1984", "Alpina publisher", 434);
        Book book2 = new Book(1863,"Leo Tolstoy", "War and Peace", "Acsmo", 798);
        Journal journal1 = new Journal(2010, "Stanley", "Spiderman", "comics", 1);
        Journal journal2 = new Journal(2010, "Stanley", "Spiderman and Sandman", "comics", 2);

        library.SignUpTheUser(user1);

        library.addPublication(book1);
        library.addPublication(book2);
        library.addPublication(journal2);

        user1.requestToAdd(book1);
        user1.requestToAdd(journal1);
        user1.requestToAdd(book1);
        user1.requestToReturn(book1);
        user1.requestToReturn(book1);

        user2.requestToAdd(journal2);

        library.removePublication(book1);

    }
}