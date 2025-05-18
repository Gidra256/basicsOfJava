public class Constractors {
    // Constructor with no parameters
    public Constractors() {
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    public Constractors(int x) {
        System.out.println("Constructor with one parameter called: " + x);
    }

    // Constructor with two parameters
    public Constractors(int x, int y) {
        System.out.println("Constructor with two parameters called: " + x + ", " + y);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Constractors obj1 = new Constractors(); // Calls the default constructor
        Constractors obj2 = new Constractors(10); // Calls the constructor with one parameter
        Constractors obj3 = new Constractors(20, 30); // Calls the constructor with two parameters
    }
}
