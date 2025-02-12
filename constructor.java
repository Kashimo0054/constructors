class Human {
    private String name; // Instance variable
    private int age; // Instance variable

    public Human() {
        this.name = "John";
        this.age = 25;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class App {
    public static void main(String[] args) {

        Human person = new Human();
        Human person1 = new Human("malik", 29);
        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
        System.out.println("Name: " + person1.getName() + " Age: " + person1.getAge());

    }
}
