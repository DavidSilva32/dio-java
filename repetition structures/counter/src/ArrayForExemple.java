public class ArrayForExemple {
    public static void main(String[] args) {
        // In arrays the element indice begins in ZERO
        String[] students = {"Ashley", "Marco", "Leon", "Clair"};

        // Abbreviation form
        for (String student: students) {
            System.out.println("Name of student is " + student);
        }

        // for (int i=0; i < students.length; i++) {
        //     System.out.println("The student in the indice i=" + i + " is " + students[i]);
        // }
    }
}
