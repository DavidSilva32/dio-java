public class Relationals {
    public static void main (String [] args) {
        // ==, !=, >, <, >=, <=

        String name1 = "David";
        String name2 = new String("David");
        System.out.println(name1.equals(name2));

        int[] numbers = {1,2};

        boolean yesOrNo = numbers[0] == numbers[1];

        System.out.println("Is number one equal to number two? " + yesOrNo);

        // boolean yesOrNo = numbers[0] != numbers[1];

        // System.out.println("Is number one different from number two?" + yesOrNo);

    }
    
}
