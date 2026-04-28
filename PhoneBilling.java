import java.util.Scanner;
import java.time.LocalTime;

public class PhoneBilling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get current hour automatically from the system clock
        int hour = LocalTime.now().getHour();

        System.out.println("=== Mobile Phone Billing System ===");
        System.out.printf("Current time: %s%n", LocalTime.now().withSecond(0).withNano(0));

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter call duration in seconds: ");
        double durationSeconds = scanner.nextDouble();

        System.out.print("Is the call to another network? (1=Yes, 0=No): ");
        int otherNetwork = scanner.nextInt();

        // Convert seconds to minutes for billing
        double durationMinutes = durationSeconds / 60.0;

        // Calculate base charge
        double baseCharge;

        if (otherNetwork == 1) {
            // Rule (c): flat rate for other networks
            baseCharge = 5.00;
        } else if (hour >= 6 && hour < 18) {
            // Rule (a): daytime rate (6am to 6pm)
            baseCharge = 4.00 * durationMinutes;
        } else {
            // Rule (b): nighttime rate (6pm to 6am)
            baseCharge = 3.00 * durationMinutes;
        }

        // Rule (d): 16% VAT for calls longer than 2 minutes
        double vat = 0.0;
        if (durationMinutes > 2) {
            vat = baseCharge * 0.16;
        }

        double totalCharge = baseCharge + vat;

        // Display the bill
        System.out.println("\n========== BILL ==========");
        System.out.println("Customer   : " + name);
        System.out.printf("Call Time  : %02d:00 (%s)%n", hour, (hour >= 6 && hour < 18) ? "Daytime" : "Nighttime");
        System.out.printf("Duration   : %.1f seconds (%.2f minutes)%n", durationSeconds, durationMinutes);
        System.out.printf("Base Charge: Kshs %.2f%n", baseCharge);
        System.out.printf("VAT (16%%) : Kshs %.2f%n", vat);
        System.out.printf("Total Bill : Kshs %.2f%n", totalCharge);
        System.out.println("==========================");

        scanner.close();
    }
}