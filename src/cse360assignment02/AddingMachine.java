package cse360assignment02;

public class AddingMachine {
    private int total;
    private String log;

    /**
     * The constructor creates a new AddingMachine object and instantiates the value of total to zero
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        log = "0"; // the log must be initialized to initial value of total which is zero
    }

    /**
     * A getter for total
     *
     * @return value of total
     */
    public int getTotal() {
        return total;
    }

    /**
     * This function increments the total by the given value
     *
     * @param value is added to the total
     */
    public void add(int value) {
        total += value;
        log += " + " + value;
    }

    /**
     * This function decrements the total by the given value
     *
     * @param value is subtracted from total
     */
    public void subtract(int value) {
        total -= value;
        log += " - " + value;
    }

    /**
     * This is a custom toString for the class and print all the operations performed
     *
     * @return the log of all operations
     */
    public String toString() {
        return log;
    }

    /**
     * clears the adding machine by setting all the values back to zero
     */
    public void clear() {
        total = 0;
        log = "0";
    }
}