public class Person {
    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    private String fullName = "Pavel";
    private int age = 30;

    public void move(){
        System.out.println("Такой-то  Person говорит");
    }
    public void talk(){
        System.out.println("Такой-то  Person говорит");
    }
}
