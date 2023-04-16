import java.util.ArrayList;

public class User {
    private final String name;
    private final String  lastname;
    private final String email;
    private Library library;

    private final ArrayList<Publication> publications = new ArrayList();

    public User(String name, String lastname, String email, Library library) {
        this.email = email;
        this.lastname = lastname;
        this.name = name;
        this.library = library;
    }

    public void requestToAdd(Publication publication) {
        if(library.givePublication(this,publication)) publications.add(publication);
    }

    public void requestToReturn(Publication publication) {
        if (library.returnPublication(this, publication)) publications.remove(publication);
    }


}

