
package Question2;

/**
 *
 * @author ST10466789 MBALI RAQA
 * Code adapted from mock test 2 (Question 2 ) - from Past Paper from 2024 
 */
public abstract class Console implements IConsole{

    // Instance variables to store the accident details
    private String ConsoleType;
    private String Store;
    private int ConsoleSalesTotal;

    /**
     * Constructor accepts the Console type, city, and number of
     * sales as parameters and assigns them to the instance variables.
     */
    public Console(String ConsoleType, String store, int salesTotal) {
        this.ConsoleType = ConsoleType;
        this.Store = store;
        this.ConsoleSalesTotal = ConsoleSalesTotal;
    }

    // Getter for the Console type
    @Override
    public String getConsoleType() {
        return ConsoleType;
    }

    // Getter for the store
    @Override
    public String getStore() {
        return Store;
    }

    // Getter for the sales total
    @Override
    public int getConsoleSalesTotal() {
        return ConsoleSalesTotal;
    }
}

// ------------------------------- end of file ------------------------------