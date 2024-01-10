import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double average = (double) totalMarks / (numSubjects * 100) * 100;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 85) {
            grade = 'B';
        } else if (average >= 80) {
            grade = 'C';
        } else if (average >= 75) {
            grade = 'D';
        } else if (average >= 70) {
            grade = 'E';
        }else if (average >= 60) {
            grade = 'F';
         }else if (average >= 50) {
            grade = 'G';
         }else {
            grade = 'H';
        }

        System.out.println("----------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}