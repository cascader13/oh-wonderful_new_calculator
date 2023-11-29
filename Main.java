import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {"7", "8", "9", "<", "4", "5", "6", "/", "1", "2", "3", "*", "0", "C", "=", "-", "","",".", "+"};
    private JPanel panel;
    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        textField = new JTextField(40);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonLabel = e.getActionCommand();
        if (buttonLabel.equals("=")) {
            String expression = textField.getText();
            String result = evaluateExpression(expression);
            textField.setText(result);
        } else if (buttonLabel.equals("C")) {
            textField.setText("");
        } else if (buttonLabel.equals("<")) {
           String a = textField.getText();
           if(!a.equals("")){
               textField.setText(a.substring(0, a.length() - 1));
           }
        } else {
            textField.setText(textField.getText() + buttonLabel);
        }
    }
    public String evaluateExpression(String expression) {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            return engine.eval(expression).toString();
        } catch (ScriptException e) {
            return "Error";
        }
    }



    public static void main(String[] args) {
        new Calculator();
    }
}