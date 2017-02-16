package oefening_506;
import javax.swing.*;

class Panel extends JPanel {
    private JTextField output;
    private int test, end;

    public Panel() {
        test = 0;
        output = new JTextField(5);
        output.setHorizontalAlignment(JTextField.CENTER);
        add(output);

        for(int i = 0; i <= 1000; i++) {
            end = i + test;
            test = end;
            output.setText("" + end);
        }
    }
}
