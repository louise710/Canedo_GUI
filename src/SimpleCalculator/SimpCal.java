package SimpleCalculator;

import javax.swing.*;

public class SimpCal extends JFrame{
    private JPanel jpanel;

    public static void main(String[] args) {
        SimpCal app = new SimpCal();
        app.setContentPane(app.jpanel);
        app.setSize(800, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");


    }
}
