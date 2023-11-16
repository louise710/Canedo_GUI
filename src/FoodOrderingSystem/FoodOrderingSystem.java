package FoodOrderingSystem;

import javax.swing.*;

public class FoodOrderingSystem extends JFrame{
    private JPanel jpanel;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderingSystem(){
        btnOrder.addActionListener(e -> {
            float total = 0; //get total

            if (cPizza.isSelected()) {
                total = total + 100;
            }
            if (cBurger.isSelected()) {
                total = total + 80;
            }
            if (cFries.isSelected()) {
                total = total + 65;
            }
            if (cSoftDrinks.isSelected()) {
                total = total + 55;
            }
            if (cTea.isSelected()) {
                total = total + 50;
            }
            if (cSundae.isSelected()) {
                total = total + 40;
            }

            if(rbNone.isSelected()){
                total = total;
            }
            if(rb5.isSelected()){
                total = (float) (total - (total * 0.05));
            }
            if(rb10.isSelected()){
                total = (float) (total - (total * 0.10));
            }
            if(rb15.isSelected()){
                total = (float) (total - (total * 0.15));
            }

            JOptionPane.showMessageDialog(this, "Total price is Php " + String.format("%.2f", total));
        });
    }
    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");

    }
}
