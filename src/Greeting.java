public class Greeting {
    public static void greet(String name, int age, String city) {
        // This method takes name, age, and city as input and prints a greeting message.
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You live in " + city + ".");
    }

    public static void main(String[] args) {
        greet("Rebecca", 30, "Salt Lake City");
        greet("Eric", 45, "Phoenix ");
    }

}

