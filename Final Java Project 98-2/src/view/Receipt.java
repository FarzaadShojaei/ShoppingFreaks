/*
 * Created by JFormDesigner on Fri Jul 31 02:00:15 IRDT 2020
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class Receipt extends JFrame {
    public Receipt() {
        initComponents();
    }

    private void tPriceAncestorAdded(AncestorEvent e) {
        Cart cart = new Cart();
        tPrice.setText(cart.totalPrice());
    }

    private void button1ActionPerformed(ActionEvent e) {
        System.exit(0);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        tPrice = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[122,fill]" +
            "[200,fill]",
            // rows
            "[40]" +
            "[40]" +
            "[40]"));

        //---- label1 ----
        label1.setText("Total Price  :");
        contentPane.add(label1, "cell 0 0");

        //---- tPrice ----
        tPrice.setText("text");
        tPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                tPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(tPrice, "cell 1 0");

        //---- button1 ----
        button1.setText("Exit");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 1 2");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JLabel tPrice;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
