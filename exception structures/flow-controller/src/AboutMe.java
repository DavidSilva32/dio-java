import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Enter your Name: ");
            String name = scanner.next();

            System.out.print("Enter your Last Name: ");
            String lastName = scanner.next();
            
            System.out.print("Enter your Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your Height: ");
            double height = scanner.nextDouble();

            System.out.println("Hello, I'm " + name.toUpperCase() + " " + lastName);
            System.out.println("I'm " + age);
            System.out.println("I'm " + age + " Years old");
            System.out.println("My height is " + height + "cm");
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("The fileds age and height needs to be numerical");
        }
    }
}
