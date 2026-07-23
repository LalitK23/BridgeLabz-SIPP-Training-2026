import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < 3; j++) {

                marks[i][j] = sc.nextDouble();

                if (marks[i][j] < 0) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < number; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        for (int i = 0; i < number; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }
    }
}
