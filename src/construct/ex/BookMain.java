package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book0 = new Book("","");
        Book book1 = new Book("Hello Java", "Seo");
        Book book2 = new Book("JPA 프로그래밍", "kim",700);

        Book[] books = {book0,book1,book2};
        for (Book b:books){
            System.out.println("제목: "+b.title+"  저자:"+b.author+ "  페이지:"+b.page);
        }
    }
}
