import java.util.List;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setName("name");
        ((List<Book>) bs.getBooks).remove(2);
        bs.loadBooks();
        System.out.println(bs.getBooks());

        BookShop bs1 = (BookShop) bs.clone();
        bs1.setName("name1");
        bs1.loadBooks();
        System.out.println(bs1.getBooks());
    }
}
