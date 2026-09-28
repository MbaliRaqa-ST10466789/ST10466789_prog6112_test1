package Question1;

/**
 *
 * @author Mbali Raqa
 */
import java.util.Scanner;

/**
 * Question 1:  Yearly Sales for number 1 Electronics franchise 
 * Uses a single array (cities) and a two-dimensional array (number od sales )
 * to capture, process and report number of sales 
 * for three cities, then determines the city with the most sales.
 * Code adapted from mock test2 (Question1, Road accidents) - Question Paper from 2024
 * @author ST10466789 MBALI RAQA
 */
public class ElectornicsFranchiseReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single array holding the city names
        String[] cities = {"Cape Town", " Port Elizabeth", "Pretoria"};

        // Two-dimensional array: row = city, column 0 = PS5, column 1 = XBOX, column 2 = SWITCH
        int[][] sales = {{1000, 2000,3000},
                          {2000, 3000, 4000},
                          {1500, 1100, 1200}};
        
        // ---------- Capture input for each city ----------
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of sales for " + cities[i] + ": ");
            sales[i][0] = input.nextInt();

          
        }

        // Single array to store the total sales per city
        int[] totals = new int[cities.length];

        // ---------- Print the accident report (rows and columns) ----------
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLLE REPORT");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-18s%-12s%-12s%n", "", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-12d%-12d%n", cities[i], sales[i][0],  sales[i][1]);

            // Accumulate the total for this city while we loop through the data
            totals[i] = sales[i][0] + sales[i][1];
        }

        // ---------- Print the totals per city ----------
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        // Track the index of the city with the highest total as we print
        int maxIndex = 0;
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i], totals[i]);

            if (totals[i] > totals[maxIndex]) {
                maxIndex = i;
            }
        }

        // ---------- Display the city with the most accidents ----------
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println("------------------------------------------------------------");

        input.close();
    }
}
// -------------------- end of file -------------------------- --------------