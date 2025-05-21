import java.util.Scanner;

    public class StudentGradesAnalyzer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask for the number of students
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            // Create an array to store grades
            double[] grades = new double[numStudents];

            // Input grades
            System.out.println("Enter the grades for each student:");
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter grade for student " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();

                // Ensure the grade is within valid range
                while (grades[i] < 0 || grades[i] > 100) {
                    System.out.print("Invalid grade! Please enter a grade between 0 and 100: ");
                    grades[i] = scanner.nextDouble();
                }
            }

            // Compute the average, highest, and lowest grades
            double sum = 0;
            double highest = grades[0];
            double lowest = grades[0];

            for (double grade : grades) {
                sum += grade;
                if (grade > highest) highest = grade;
                if (grade < lowest) lowest = grade;
            }

            double average = sum / numStudents;

            // Output the results
            System.out.println("\nCodeAlpha-CA/MA1/9495");
            System.out.println("\nGrade Summary:");
            System.out.printf("Average grade: %.2f\n", average);
            System.out.printf("Highest grade: %.2f\n", highest);
            System.out.printf("Lowest grade: %.2f\n", lowest);

            scanner.close();
        }
    }


