import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();

            double meter = height[i] / 100;

            bmi[i] = weight[i] / (meter * meter);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < number; i++) {
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}