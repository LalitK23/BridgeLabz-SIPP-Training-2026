import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {

        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double amount, double availableFunds)
            throws InsufficientFundsException {

        if (amount > availableFunds) {

            throw new InsufficientFundsException(
                    "Payment failed. Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter total bill amount: ");

            int totalBill = sc.nextInt();

            System.out.print("Enter number of items: ");

            int items = sc.nextInt();

            int billPerItem = totalBill / items;

            System.out.println("Bill per item: " + billPerItem);

            int[] patients = {101, 102, 103};

            System.out.print("Enter patient index: ");

            int index = sc.nextInt();

            System.out.println("Patient ID: " + patients[index]);

            sc.nextLine();

            System.out.print("Enter payment amount: ");

            String amountText = sc.nextLine();

            double amount = Double.parseDouble(amountText);

            processPayment(amount, 5000);

        } catch (ArithmeticException e) {

            System.out.println("Items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid patient index.");

        } catch (NumberFormatException e) {

            System.out.println("Invalid number entered.");

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}