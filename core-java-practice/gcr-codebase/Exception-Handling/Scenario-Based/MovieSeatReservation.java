import java.util.Scanner;

public class MovieSeatReservation {

    public static int getSeat(int index) {

        int[] seats = {101, 102, 103, 104, 105};

        try {

            return seats[index];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid seat position.");

            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat index: ");

        int index = sc.nextInt();

        int seat = getSeat(index);

        if (seat != -1) {

            System.out.println("Seat number: " + seat);
        }

        sc.close();
    }
}