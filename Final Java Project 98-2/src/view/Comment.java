/*
 * Created by JFormDesigner on Tue Jul 21 15:38:35 IRDT 2020
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
public class Comment extends JFrame {
    public Comment() {
        initComponents();
    }

    private void sendButtonActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.insertComments(commentTextArea.getText());
    }

    private void menuButtonActionPerformed(ActionEvent e) {
        dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        commentTextArea = new JTextArea();
        sendButton = new JButton();
        menuButton = new JButton();

        //======== this ========
        setTitle("Comment");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[141,fill]" +
            "[241,fill]",
            // rows
            "[24]" +
            "[46]" +
            "[37]" +
            "[45]" +
            "[40]" +
            "[]"));

        //---- label1 ----
        label1.setText("Enter your comment :");
        contentPane.add(label1, "cell 0 1,aligny top,growy 0");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(commentTextArea);
        }
        contentPane.add(scrollPane1, "cell 1 1 1 2,height 130");

        //---- sendButton ----
        sendButton.setText("Send");
        sendButton.addActionListener(e -> sendButtonActionPerformed(e));
        contentPane.add(sendButton, "cell 1 3");

        //---- menuButton ----
        menuButton.setText("Menu");
        menuButton.addActionListener(e -> menuButtonActionPerformed(e));
        contentPane.add(menuButton, "cell 0 4");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea commentTextArea;
    private JButton sendButton;
    private JButton menuButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
