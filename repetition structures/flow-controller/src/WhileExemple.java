import java.util.concurrent.ThreadLocalRandom;

public class WhileExemple {
    public static void main(String[] args) throws Exception {
        double allowance = 50.0;
        while(allowance > 0) {
            double candyValue = randomValue();

            if(candyValue > allowance) {
                candyValue = allowance;

            }
            System.out.println("Value candy: " + candyValue + " added to cart");
            allowance -= candyValue;
        }
        System.out.println("Allowance: " + allowance);
        System.out.println("John spent all his allowance");
    }

    public static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
