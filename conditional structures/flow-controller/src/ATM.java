public class ATM {
    public static void main(String[] args) {
        // Simple Conditional
        double balance = 25.0;
        double requestedAmount = 15;

        if (requestedAmount < balance) {
            balance = balance - requestedAmount;
        } else {
            System.out.println("Insufficient balance");
        }

        System.out.println(balance);
    }
}