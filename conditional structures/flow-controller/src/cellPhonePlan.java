public class cellPhonePlan {
    public static void main(String[] args) {
        String plan = "M"; // Basic, Media, Turbo

        switch (plan) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whatsapp and Instagram free");
            case "B":
                System.out.println("100 minutes of connection");
        }
    }
}