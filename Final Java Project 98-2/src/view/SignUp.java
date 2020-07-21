/*
 * Created by JFormDesigner on Tue Jul 21 14:44:29 IRDT 2020
 */

package view;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class SignUp extends JFrame {
    public SignUp() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label2 = new JLabel();
        nameTextField = new JTextField();
        label3 = new JLabel();
        phoneTextField = new JTextField();
        label4 = new JLabel();
        addressTextField = new JTextField();
        label5 = new JLabel();
        meliCodeTextField = new JTextField();
        button1 = new JButton();

        //======== this ========
        setTitle("SignUp");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[99,fill]" +
            "[150,fill]" +
            "[84,fill]",
            // rows
            "[49]" +
            "[39]" +
            "[45]" +
            "[42]" +
            "[42]" +
            "[48]" +
            "[]"));

        //---- label1 ----
        label1.setText("Welcome!!");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));
        contentPane.add(label1, "cell 1 0");

        //---- label2 ----
        label2.setText("Name :");
        contentPane.add(label2, "cell 1 1");
        contentPane.add(nameTextField, "cell 2 1");

        //---- label3 ----
        label3.setText("Phone Number :");
        contentPane.add(label3, "cell 1 2");
        contentPane.add(phoneTextField, "cell 2 2");

        //---- label4 ----
        label4.setText("Address");
        contentPane.add(label4, "cell 1 3");
        contentPane.add(addressTextField, "cell 2 3");

        //---- label5 ----
        label5.setText("Meli Code :");
        contentPane.add(label5, "cell 1 4");
        contentPane.add(meliCodeTextField, "cell 2 4");

        //---- button1 ----
        button1.setText("Sign Up");
        contentPane.add(button1, "cell 2 5");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JLabel label2;
    private JTextField nameTextField;
    private JLabel label3;
    private JTextField phoneTextField;
    private JLabel label4;
    private JTextField addressTextField;
    private JLabel label5;
    private JTextField meliCodeTextField;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
