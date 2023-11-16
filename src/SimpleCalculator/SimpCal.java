package SimpleCalculator;

import javax.swing.*;

public class SimpCal extends JFrame{
    private JPanel jpanel;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField tfNumber1;
    private JTextField lblResult;
    private JButton btnCompute;

    public SimpCal(){
        btnCompute.addActionListener(e ->{
            try {
                String operation = (String) cbOperations.getSelectedItem();
                int number1 = Integer.parseInt(tfNumber1.getText());
                int number2 = Integer.parseInt(tfNumber2.getText());
                int result = 0;

                if (operation.equals("+")) {
                    result = number1 + number2;
                } else if (operation.equals("-")) {
                    result = number1 - number2;
                } else if (operation.equals("*")) {
                    result = number1 * number2;
                } else if (operation.equals("/")) {
                    result = number1 / number2;
                }

                lblResult.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        });
    }
        public static void main(String[] args) {
            SimpCal app = new SimpCal();
            app.setContentPane(app.jpanel);
            app.setSize(700, 400);
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
            app.setVisible(true);
            app.setTitle("Simple Calculator");

        }

    }

