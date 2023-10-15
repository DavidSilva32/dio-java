public class SchoolResult {
    public static void main(String[] args) {
        double media = 7;

        // Ternary Condition
        String result = media >= 7 ? "Approved" : media >= 5 && media < 7 ? "Recovary Test" : "Disapproved";

        System.out.println(result);

        // // Compoud Condition
        // if (media >= 7) {
        // System.out.println("Approved");
        // } else if (media >= 5 && media < 7) {
        // //It must return True or False
        // System.out.println("Recovery Test");
        // } else {
        // System.out.println("Disapproved");
        // }

    }
}