public class Main {
    public static void main(String[] args) {
        Book book=new Book.BookBuiler().setTitle("W pustyni i w puszczy").setAuthorName("Henryk").setAuthorSurname("Sienkiewicz").setPublishingHouse("Aigo House").build();
        System.out.println(book);
    }
}