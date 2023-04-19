package Java8Features.Lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {


    public List<Book> getBooks()
    {
        List<Book> books=new ArrayList<>();
        books.add(new Book("RSVP",1,23));
        books.add(new Book("IVP",2,34));
        books.add(new Book("Young Man",3,45));

        return books;

    }
}
