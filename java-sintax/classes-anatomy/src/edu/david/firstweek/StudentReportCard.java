package edu.david.firstweek;
public class StudentReportCard {
    public static void main (String[] args) {
        int finalAverage = 7;
        if (finalAverage < 6) {
            System.out.println("Disapproved");
        } else if (finalAverage == 6) {
            System.out.println("Minerva test");
        } else {
            System.out.println("Approved");
        }
    }
}