package Java8Features.Lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksSort() {
        BookDAO dao = new BookDAO();
        List<Book> books = dao.getBooks();
        Collections.sort(books, new MyComaparator());
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksSort());
    }

    class MyComaparator implements Comparator<Book> {

        @Override
        public int compare(Book books, Book o2) {
            return books.getName().compareTo(o2.getName());

        }
    }
}