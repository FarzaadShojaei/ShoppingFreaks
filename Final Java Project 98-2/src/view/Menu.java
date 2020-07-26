/*
 * Created by JFormDesigner on Tue Jul 21 15:29:49 IRDT 2020
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class Menu extends JFrame {
    public Menu() {
        initComponents();
    }

    private void buyButtonActionPerformed(ActionEvent e) {
        Buy buy = new Buy();
        dispose();
        buy.setVisible(true);
        buy.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void commentButtonActionPerformed(ActionEvent e) {
        Comment comment = new Comment();
        dispose();
        comment.setVisible(true);
        comment.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        buyButton = new JButton();
        commentButton = new JButton();

        //======== this ========
        setTitle("Menu");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[122,fill]" +
            "[123,fill]" +
            "[fill]",
            // rows
            "[52]" +
            "[46]" +
            "[56]"));

        //---- buyButton ----
        buyButton.setText("Buying");
        buyButton.addActionListener(e -> buyButtonActionPerformed(e));
        contentPane.add(buyButton, "cell 1 1");

        //---- commentButton ----
        commentButton.setText("Send Comment");
        commentButton.addActionListener(e -> commentButtonActionPerformed(e));
        contentPane.add(commentButton, "cell 2 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JButton buyButton;
    private JButton commentButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
