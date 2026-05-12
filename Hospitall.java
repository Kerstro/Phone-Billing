import java.util.Scanner;

public class Hospitall {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter pressure of the patient: ");
        float pressure = input.nextFloat();
        System.out.println("Enter the temperature of the patient: ");
        float temp = input.nextFloat();

        if (pressure > 140 && temp > 38) {
            System.out.println("Critical ADMIT🏥 patient");
        } else if (pressure < 140) {
            System.out.println("Give MEDICATION 💉 to the patient");
        } else if (pressure > 140 && temp < 38) {
            System.out.println("Send patient to the LABARATORY🥼🧪");
        }

        input.close();
    }
}
