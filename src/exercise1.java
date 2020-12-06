import javax.swing.*;

public class exercise1 {
    public static void main(String[] args) {
        /**Make a program which displays a different message depending on the age given.
         * Here are the possible responses:

         age is less than 16, say "You can't drive."
         age is less than 18, say "You can't vote."
         age is less than 25, say "You can't rent a car."
         age is 25 or over, say "You can do anything that's legal."
         Here's a sample run.
         Notice that a person who is under 16 will display three messages,
         one for being under 16, one for also being under 18,
         and one for also being under 25.*/

        String godine = JOptionPane.showInputDialog("Upiši koliko imaš godina");
        int godine1 = Integer.parseInt(godine);

        String BrojGodina;

        if (godine1 <= 16) {
            BrojGodina = "Ne možeš voziti";
    }
        else if (godine1 <= 18){
            BrojGodina = "Ne možeš glasati";
        }
        else if (godine1 <= 25){
            BrojGodina = "Ne možeš rentati auto";
        }
        else {
            BrojGodina = "Radi šta god želiš legalno";
        }
        JOptionPane.showInternalMessageDialog(null, "Ti imaš " + godine1 + " i " + BrojGodina);
    }
}