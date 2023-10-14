public class Logics {
    public static void main (String[] args) {
        boolean[] condition = {true, true};

        if (condition[0] && (7 > 4)) {
            System.out.println("Both conditions are true");
        }

        if (condition[0] || condition[1]) {
            System.out.println("One of the conditions is true");
        }

        System.out.println("End");
    }
}