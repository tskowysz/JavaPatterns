public class Main {
    public static void main(String[] args) {
       Blog blog=new Blog();
       Subscriber subscriber=new Subscriber("Thomas",blog);
       Subscriber subscriber1=new Subscriber("John",blog);
       Subscriber subscriber2=new Subscriber("Carrie",blog);


       blog.addObserver(subscriber);
       blog.addObserver(subscriber1);
       blog.addObserver(subscriber2);

       blog.publisNewArticle("add a new article.");

    }
}