import java.util.Random;

public class DoWhileExemple {
    public static void main(String[] args) {
        System.out.println("Dialing...");

        do {
            System.out.println("Cell phone ringing");
        } while (ringing());

        System.out.println("Hello !!!");

    }

    public static boolean ringing() {
        boolean answered = new Random().nextInt(3) == 1;
        String result = answered == true ? "Yes" : "No";
        System.out.println("Answered? " + result);
        // Denying the act of ringing
        return !answered;
    }
}
