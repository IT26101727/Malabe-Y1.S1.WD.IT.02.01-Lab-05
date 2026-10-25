
import java.util.Scanner;

public class IT26101727Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Constants
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        int startDate, endDate, daysReserved;
        double discountRate = 0.0;
        double totalAmount, discount, amountToPay;

        // Input dates
        System.out.print("Enter start date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter end date (1-31): ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            input.close();
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println(
                "Error: Start date must be less than end date."
            );
            input.close();
            return;
        }

        // Calculate number of days
        daysReserved = endDate - startDate;

        // Calculate discount rate
        if (daysReserved < 3) {
            discountRate = 0.0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        // Calculate payment
        totalAmount = daysReserved * ROOM_CHARGE;
        discount = totalAmount * discountRate;
        amountToPay = totalAmount - discount;

        // Display results
        System.out.println("\nNumber of days reserved: " + daysReserved);
        System.out.printf("Room charge: Rs. %.2f%n", totalAmount);
        System.out.printf("Discount: Rs. %.2f%n", discount);
        System.out.printf("Total amount to pay: Rs. %.2f%n", amountToPay);

        
    }
}
