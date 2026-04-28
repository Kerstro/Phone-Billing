import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        // double Chairs = 19;
        // double PChair = 1150;

        // double total = Chairs * PChair;

        // System.out.printf("The total cost of %.2f% chairs is %.2f%n", Chairs, total);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("This is an ADULT");
        } else {
            System.out.println("This is a BABYY");
        }
        scanner.close();
    }
}