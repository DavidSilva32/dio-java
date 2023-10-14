public class UnaryOperator {
    public static void main (String [] args) {
        int number = 5;

        // To negative
        number = - number;
        System.out.println(number);

        // To positive
        number = number * -1;
        System.out.println(number);

        // repetition - number = number + 1
        number++;
        System.out.println(number);

        // number = number - 1
        number--;
        System.out.println(number);

        // Inverter the variable value
        boolean variable = true;

        variable = !variable;

        System.out.println(variable);

    }
}
