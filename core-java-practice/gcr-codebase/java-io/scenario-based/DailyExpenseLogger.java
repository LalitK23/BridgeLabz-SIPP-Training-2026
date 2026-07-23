import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter category: ");

            String category = sc.nextLine();

            System.out.print("Enter amount: ");

            int amount = sc.nextInt();

            FileWriter fw = new FileWriter("expenses.txt", true);

            fw.write(category + " - " + amount);

            fw.write(System.lineSeparator());

            fw.close();

            System.out.println("Expense saved.");

        } catch (IOException e) {

            System.out.println("File error.");
        }

        sc.close();
    }
}