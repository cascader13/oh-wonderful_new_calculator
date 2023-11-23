package ProjectCalculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(310, 200);
        frame.setLocationRelativeTo(null);
        CalculatorWindow win = new CalculatorWindow(frame.getContentPane());

    }
}