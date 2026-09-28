
package Question2;

/**
 * Subclass of Console that adds the printCOnsoleSales() method
 * used to display the console type report.
 * code adapted from mock test 2 (QUestion 2) - from past paper 2024
 * @author ST10466789 MBALI RAQA
 */
public class ConsoleSalesTotal extends Console {

    /**
     * Constructor passes the console type, city and sales total up
     * to the parent Console class using super().
     */
    public ConsoleSalesTotal(String ConsoleType, String store, int ConsoleSalesTotal) {
        super(ConsoleType, store, ConsoleSalesTotal);
    }

    /**
     * Prints the Console sales report in the required format,
     * matching the sample screenshot layout.
     */
    public void printAccidentReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("Store: " + getStore());
        System.out.println("CONSOLE SALES TOTAL: " + getConsoleSalesTotal());
        System.out.println("*************************");
    }  

    void printConsoleSalesTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}