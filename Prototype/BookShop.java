import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String name;

    private List<Book> books = new ArrayList<Book>();

    public Object getBooks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setName("Book" + i);
            getBooks().add(b);
        }
    }

    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        for (Book b : getBooks()) {
            bs.getBooks().add(b);
        }
        return bs;

    }
}
