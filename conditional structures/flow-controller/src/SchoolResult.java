public class SchoolResult {
    public static void main(String[] args) {
        double media = 6;

        if (media >= 7) {
            System.out.println("Approved");
        } else if (media >= 5 && media < 7) {
            //It must return True or False 
            System.out.println("Recovery Test");
        } else {
            System.out.println("Disapproved");
        }
    }
}