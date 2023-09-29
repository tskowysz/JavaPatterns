public class Subscriber implements Observer{

    private String name;
    private String article;
    private Blog blog;

    public Subscriber(String name,Blog blog) {
        this.name=name;
        this.blog=blog;
        this.article=blog.getArticle();
    }

    @Override
    public void upadate() {
        article=blog.getArticle();
        System.out.println("Hey "+name+" this is a new message for you: "+article);
    }
}
