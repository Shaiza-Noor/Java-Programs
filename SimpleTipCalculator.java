
import java.util.Scanner;

public class SimpleTipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask for bill amount
        System.out.print("Enter bill amount: ");
        double bill = input.nextDouble();
        // Default tip percentage
        double tipPercentage = 15;
        // Calculate tip
        double tip = (bill * tipPercentage) / 100;

        // Calculate total
        double total = bill + tip;

        // Print results
        System.out.println("Tip amount: " + tip);
        System.out.println("Total amount (bill + tip): " + total);

        input.close();
    }
}
