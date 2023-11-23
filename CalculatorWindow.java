package ProjectCalculator;
import javax.swing.*;
import java.awt.*;

public class CalculatorWindow extends JFrame {
    private JButton Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;
    private JButton ButtonPlus, ButtonMinus, ButtonEquals, ButtonMulti, ButtonDiv, ButtonClear;
    private JTextField CalculationField;

    public CalculatorWindow(Container container){
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridy = 0;

        Button1 = new JButton("1");
        constraints.gridx = 0;
        constraints.gridy = 4;
        container.add(Button1, constraints);

        Button2 = new JButton("2");
        constraints.gridx = 1;
        constraints.gridy = 4;
        container.add(Button2, constraints);

        Button3 = new JButton("3");
        constraints.gridx = 2;
        constraints.gridy = 4;
        container.add(Button3, constraints);

        Button4 = new JButton("4");
        constraints.gridx = 0;
        constraints.gridy = 5;
        container.add(Button4, constraints);

        Button5 = new JButton("5");
        constraints.gridx = 1;
        constraints.gridy = 5;
        container.add(Button5, constraints);

        Button6 = new JButton("6");
        constraints.gridx = 2;
        constraints.gridy = 5;
        container.add(Button6, constraints);

        Button7 = new JButton("7");
        constraints.gridx = 0;
        constraints.gridy = 6;
        container.add(Button7, constraints);

        Button8 = new JButton("8");
        constraints.gridx = 1;
        constraints.gridy = 6;
        container.add(Button8, constraints);

        Button9 = new JButton("9");
        constraints.gridx = 2;
        constraints.gridy = 6;
        container.add(Button9, constraints);

        Button0 = new JButton("0");
        constraints.gridx = 1;
        constraints.gridy = 7;
        container.add(Button0, constraints);

        ButtonPlus = new JButton("+");
        constraints.gridx = 3;
        constraints.gridy = 4;
        container.add(ButtonPlus, constraints);

        ButtonMinus = new JButton("-");
        constraints.gridx = 3;
        constraints.gridy = 5;
        container.add(ButtonMinus, constraints);

        ButtonMulti = new JButton("*");
        constraints.gridx = 3;
        constraints.gridy = 6;
        container.add(ButtonMulti, constraints);

        ButtonDiv = new JButton("/");
        constraints.gridx = 3;
        constraints.gridy = 7;
        container.add(ButtonDiv, constraints);

        ButtonEquals = new JButton("=");
        constraints.gridx = 2;
        constraints.gridy = 7;
        container.add(ButtonEquals, constraints);

        ButtonClear = new JButton("C");
        constraints.gridx = 0;
        constraints.gridy = 7;
        container.add(ButtonClear, constraints);

        CalculationField = new JTextField("0");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth=4;
        CalculationField.setEnabled(false);
        container.add(CalculationField, constraints);
    }

    public void SetWin(String s){
        CalculationField.setText(s);
    }
}
