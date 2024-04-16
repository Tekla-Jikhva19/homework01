package homeworks.hw1.scooter;

/**
 * A class to test the functionality of the scooter rental system.
 */
public class ScooterRentalTester {

    public static void main(String[] args) {
        // Create a rental company
        RentalCompany rentalCompany = new RentalCompany();

        // Add scooters to the rental company
        rentalCompany.addScooter(new Scooter());
        rentalCompany.addScooter(new Scooter());

        // Rent a scooter and go from home to the University
        int scooterId = 1; // Assuming scooter ID 1 is available
        rentalCompany.rentScooter(scooterId);
        System.out.println("Scooter rented. Going from home to University...");
        // Simulate travel to the University

        // Leave the scooter at the University
        double universityX = 41.7121106;
        double universityY = 44.7489232;
        rentalCompany.returnScooter(scooterId, universityX, universityY);
        System.out.println("Scooter left at the University.");

        // Wait for 1 hour (Simulated timing feature)
        try {
            Thread.sleep(3600000); // Sleep for 1 hour (in milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Rent the scooter again after 1 hour
        rentalCompany.rentScooter(scooterId);
        System.out.println("Scooter rented again. Going from University to home...");
        // Simulate travel back home

        // Leave the scooter near home
        double homeX =  41.71977287395173;
        double homeY =  44.802984040430054;
        rentalCompany.returnScooter(scooterId, homeX, homeY);
        System.out.println("Scooter left near home.");
    }
}
