import javax.swing.JOptionPane;

public class Hospitall {

    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog(null, "Enter pressure of the patient: ");
        float pressure = Float.parseFloat(input1);

        String input2 = JOptionPane.showInputDialog(null, "Enter the temperature of the patient: ");
        float temp = Float.parseFloat(input2);

        if (pressure > 140 && temp > 38) {
            System.out.println("Critical ADMIT🏥 patient");
        } else if (pressure < 140) {
            System.out.println("Give MEDICATION 💉 to the patient");
        } else if (pressure > 140 && temp < 38) {
            System.out.println("Send patient to the LABARATORY🥼🧪");
        }

    }
}
