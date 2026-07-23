import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {

        super(message);
    }
}

public class ATMWithdrawalSystem {

    public static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: ₹" + balance);
        }

        System.out.println("Withdrawal successful.");

        System.out.println("Remaining balance: ₹" + (balance - amount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter withdrawal amount: ");

        int amount = sc.nextInt();

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}