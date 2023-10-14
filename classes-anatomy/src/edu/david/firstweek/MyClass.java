package edu.david.firstweek;
public class MyClass {
    public static void main(String[] args) {
        String firstName = "David";
        String secondName = "Silva";

        String fullName = fullName(firstName, secondName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String secondName) {
        return "Method result " + firstName.concat(" ").concat(secondName);
    }
}