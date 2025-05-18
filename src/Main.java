public class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 3);

        // Call methods on the Dog object
        myDog.bark();
        myDog.fetch("ball");

        // Display dog information
        System.out.println("Dog's name: " + myDog.getName());
        System.out.println("Dog's age: " + myDog.getAge());
    }
}

class Dog {
    // Attributes (fields)
    private String name;
    private int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " says Woof!");
    }

    // Method to fetch an item
    public void fetch(String item) {
        System.out.println(name + " fetched the " + item + "!");
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
