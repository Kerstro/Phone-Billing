import javax.swing.JOptionPane;

public class Hospitall {
    float pressure;
    float temp;

    void getinput() {
        String input1 = JOptionPane.showInputDialog(null, "Enter pressure of the patient: ");
        pressure = Float.parseFloat(input1);
        // return pressure;

        String input2 = JOptionPane.showInputDialog(null, "Enter the temperature of the patient: ");
        temp = Float.parseFloat(input2);
        // return temp;
    }

    void diagnosePatient() {
        if (pressure > 140 && temp > 38) {
            JOptionPane.showMessageDialog(null, "\"Critical ADMIT🏥 patient\"");
        } else if (pressure < 140) {
            JOptionPane.showMessageDialog(null, "\"Give MEDICATION 💉 to the patient\"");
        } else if (pressure > 140 && temp < 38) {
            JOptionPane.showMessageDialog(null, "Send patient to the LABARATORY🥼");
        }
    }

    public static void main(String[] args) {

        Hospitall patient = new Hospitall();
        patient.getinput();
        patient.diagnosePatient();

        // String input1 = JOptionPane.showInputDialog(null, "Enter pressure of the
        // patient: ");
        // float pressure = Float.parseFloat(input1);

        // String input2 = JOptionPane.showInputDialog(null, "Enter the temperature of
        // the patient: ");
        // float temp = Float.parseFloat(input2);

        // if (pressure > 140 && temp > 38) {
        // JOptionPane.showMessageDialog(null, "\"Critical ADMIT🏥 patient\"");
        // } else if (pressure < 140) {
        // JOptionPane.showMessageDialog(null, "\"Give MEDICATION 💉 to the patient\"");
        // } else if (pressure > 140 && temp < 38) {
        // JOptionPane.showMessageDialog(null, "Send patient to the LABARATORY🥼");
        // }

    }
}
