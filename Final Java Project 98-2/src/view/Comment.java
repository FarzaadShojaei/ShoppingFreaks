/*
 * Created by JFormDesigner on Tue Jul 21 15:38:35 IRDT 2020
 */

package view;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class Comment extends JFrame {
    public Comment() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        sendButton = new JButton();
        menuButton = new JButton();

        //======== this ========
        setTitle("Comment");
        var contentPane = getContentPane();
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
        label1.setText("Enter your commnet :");
        contentPane.add(label1, "cell 0 1,aligny top,growy 0");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1, "cell 1 1 1 2,height 130");

        //---- sendButton ----
        sendButton.setText("Send");
        contentPane.add(sendButton, "cell 1 3");

        //---- menuButton ----
        menuButton.setText("Menu");
        contentPane.add(menuButton, "cell 0 4");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton sendButton;
    private JButton menuButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
