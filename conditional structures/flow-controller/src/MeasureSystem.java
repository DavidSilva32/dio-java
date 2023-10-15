public class MeasureSystem {
 public static void main(String[] args) {
    String abbreviation = "M";

    switch (abbreviation) {
        case "P":
            System.out.println("Small");
            break;
        case "M":
            System.out.println("Medio");
            break;
        case "G":
            System.out.println("Big");
            break;
        default:
            System.out.println("Undefined");
            break;
    }
 }   
}
