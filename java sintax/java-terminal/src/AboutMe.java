import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Creating the Scanner Object
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Enter your name:");
            String name = scanner.next();

            System.out.println("Enter your last name: ");
            String lastName = scanner.next();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Enter your height: ");
            double height = scanner.nextDouble();

            // Printing tha data obtained for the user

            System.out.println("Hello, My name is " + name + " " + lastName);
            System.out.println("I'm " + age + " years old");
            System.out.println("My height is " + height + "cm");
        }
    }
}
