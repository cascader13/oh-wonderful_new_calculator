package ProjectCalculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 220);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        new CalculatorWindow(frame.getContentPane());
    }
}