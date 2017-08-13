package creational.builder;

public class Main {
    public static void main(String[] args) {
        Subject subject = Subject.builder().name("Name").age(100).build();
        System.out.println(subject);
    }
}
