package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a rental company that manages scooters.
 */
public class RentalCompany {

    private int uid = 0;
    private List<Scooter> scooters = new ArrayList<>();

    /**
     * Retrieves a list of available scooters.
     *
     * @return List of available scooters
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * Adds a scooter to the rental company.
     *
     * @param scooter The scooter to add
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the rental company.
     *
     * @param id The ID of the scooter to remove
     * @return True if the scooter was removed successfully, false otherwise
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * Rents a scooter with the specified ID.
     *
     * @param id The ID of the scooter to rent
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false);
                // Additional logic can be added here
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " is not available for rent.");
    }

    /**
     * Returns a rented scooter back to the rental company.
     *
     * @param id The ID of the scooter to return
     * @param x  The X-coordinate of the location where the scooter is returned
     * @param y  The Y-coordinate of the location where the scooter is returned
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && !scooter.isAvailable()) {
                scooter.setAvailable(true);
                // Additional logic can be added here
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " cannot be returned.");
    }

    /**
     * Displays information about all scooters in the rental company.
     */
    public void displayAllScooters() {
        System.out.println("All Scooters:");
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}
