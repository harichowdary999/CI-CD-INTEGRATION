package project;

import java.util.Scanner;
public class Attendencecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total : ");
        int totalClasses = sc.nextInt();
        System.out.print("Present : ");
        int attendedClasses = sc.nextInt();
        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;
        System.out.println("Your attendance percentage is: " + attendancePercentage + "%");
        if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("Your attendance is too low. You are not allowed to sit in the exam.");
        }
        sc.close();
    }
}






