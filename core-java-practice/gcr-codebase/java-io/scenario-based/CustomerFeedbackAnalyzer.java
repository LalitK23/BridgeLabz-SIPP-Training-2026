import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomerFeedbackAnalyzer {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter feedback: ");

            String feedback = br.readLine().toLowerCase();

            if (feedback.contains("good")) {

                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);
    }
}