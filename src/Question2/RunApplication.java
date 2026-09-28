
package Question2;

import java.util.Scanner;

/**
 * Driver class that gets user input and instantiates Console Report
 * to produce the final Console sales report.
 * Code adapted from mock test 2 (Question 2) - from past paper from 2024 
 * @author ST10466789 MBALI RAQA
 */
public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for and read the Console type
        System.out.print("Enter the Console type: ");
        String ConsoleType = input.nextLine();

        // Prompt for and read the store
        System.out.print("Enter the Store for the Console: ");
        String store = input.nextLine();

        // Prompt for and read the total sales, using the captured
        // Console type and city to build a dynamic prompt message
        System.out.print("Enter the total " + ConsoleType + " sales for " + store + ": ");
        int total = input.nextInt();

        // Instantiate the ConsoleSalesReport subclass with the captured values
        ConsoleSalesTotal sales = new ConsoleSalesTotal(ConsoleType, store, total);

        // Blank line to match the sample output spacing
        System.out.println();

        // Produce the report
        sales.printConsoleSalesTotal();

        input.close();
    }
}
    