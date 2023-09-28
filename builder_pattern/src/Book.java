public class Book {
    String title;
    String authorName;
    String authorSurname;
    String publishingHouse;


    private Book(String title, String authorName, String authorSurname, String publishingHouse) {
        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.publishingHouse = publishingHouse;
    }

    public static class BookBuiler {
        private String title;
        private String authorName;
        private String authorSurname;
        private String publishingHouse;

        public BookBuiler setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuiler setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public BookBuiler setAuthorSurname(String authorSurname) {
            this.authorSurname = authorSurname;
            return this;
        }

        public BookBuiler setPublishingHouse(String publishingHouse) {
            this.publishingHouse = publishingHouse;
            return this;
        }

        public Book build() {
            return new Book(title, authorName, authorSurname, publishingHouse);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
