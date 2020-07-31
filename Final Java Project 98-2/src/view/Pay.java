/*
 * Created by JFormDesigner on Fri Jul 31 01:24:46 IRDT 2020
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.Controller;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class Pay extends JFrame {
    public Pay() {
        initComponents();
    }

    private void payButtonActionPerformed(ActionEvent e) {
        if (numberTextField.getText().equals("") || passwordField1.getPassword().equals("") || passwordField2.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter valid information ");
        } else {
            dispose();
            Receipt receipt = new Receipt();
            receipt.setVisible(true);
            receipt.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Controller controller = new Controller();
            controller.insertDocuments(numberTextField.getText(), Cart.cart.totalPrice());
            JOptionPane.showMessageDialog(null, "Thank you for your purchase .");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        numberTextField = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();
        passwordField2 = new JPasswordField();
        payButton = new JButton();

        //======== this ========
        setTitle("Pay");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                        "[122,fill]" +
                        "[200,fill]" +
                        "[fill]",
                // rows
                "[]" +
                        "[40]" +
                        "[40]" +
                        "[40]" +
                        "[40]" +
                        "[]"));

        //---- label1 ----
        label1.setText("Card Number : ");
        contentPane.add(label1, "cell 1 1");
        contentPane.add(numberTextField, "cell 2 1");

        //---- label2 ----
        label2.setText("Bank Passcode :");
        contentPane.add(label2, "cell 1 2");
        contentPane.add(passwordField1, "cell 2 2");

        //---- label3 ----
        label3.setText("Second Passcode");
        contentPane.add(label3, "cell 1 3");
        contentPane.add(passwordField2, "cell 2 3");

        //---- payButton ----
        payButton.setText("PAY");
        payButton.addActionListener(e -> payButtonActionPerformed(e));
        contentPane.add(payButton, "cell 2 4");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JTextField numberTextField;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JLabel label3;
    private JPasswordField passwordField2;
    private JButton payButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
