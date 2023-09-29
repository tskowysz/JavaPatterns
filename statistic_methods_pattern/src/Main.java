public class Main {
    public static void main(String[] args) {
        Person mike=new Person("Mike","Raue","Lea 111",13,"boy","123-432-554");

        Student mikeStudent = Student.from(mike);

        System.out.println(mikeStudent);


    }
}