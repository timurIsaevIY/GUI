import java.util.ArrayList;

public class Library {
    /*private final ArrayList<Book> books = new ArrayList();
    private final ArrayList<Journal> journals = new ArrayList();  */

    private final ArrayList<User> users = new ArrayList();

    private final ArrayList<Publication> publications = new ArrayList();

    /*public void addBook(Book book) {
        books.add(book);
    }

    public void addJournal(Journal journal) {
        journals.add(journal);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeJournal(Journal journal) {
        journals.remove(journal);
    } */

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public void removePublication(Publication publication) {
        publications.add(publication);
    }
    public boolean givePublication(User user, Publication publication) {
        if (!publication.getIsGiven() && publications.contains(publication) && users.contains(user)) {
            publication.setIsGiven(true);
            System.out.println("issued");
            return true;
        }
        else if (!users.contains(user)) {
            System.out.println("please, sign up");
        }
        else if (!publications.contains(publication)) {
            System.out.println("no such publication");
        }
        else if (publication.getIsGiven()) {
            System.out.println("taken by another user");
        }
        return false;
    }

    public boolean returnPublication(User user, Publication publication) {
        if (publication.getIsGiven() && publications.contains(publication) && users.contains(user)) {
            System.out.println("Book is handed over");
            publication.setIsGiven(false);
            return true;
        }
        else if (!users.contains(user)) {
            System.out.println("please, sign up");
        }
        else if (!publications.contains(publication)) {
            System.out.println("no such publication");
        }
        else if (!publication.getIsGiven()) {
            System.out.println("you mixed up the publication");
        }
        return false;
    }
    public void SignUpTheUser (User user) {
        users.add(user);
        System.out.println("User has been successfully added");
    }
}
