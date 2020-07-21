/*
 * Created by JFormDesigner on Tue Jul 21 15:59:54 IRDT 2020
 */

package view;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class Buy extends JFrame {
    public Buy() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        clothesbutton = new JButton();
        foodbutton = new JButton();
        bookbutton = new JButton();
        kitchenbutton = new JButton();
        toolsbutton = new JButton();
        menubutton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[92,fill]" +
            "[96,fill]" +
            "[104,fill]",
            // rows
            "[43]" +
            "[39]" +
            "[41]" +
            "[37]" +
            "[38]" +
            "[27]"));

        //---- clothesbutton ----
        clothesbutton.setText("Clothes");
        contentPane.add(clothesbutton, "cell 1 0");

        //---- foodbutton ----
        foodbutton.setText("Food");
        contentPane.add(foodbutton, "cell 1 1");

        //---- bookbutton ----
        bookbutton.setText("Book & etc");
        contentPane.add(bookbutton, "cell 1 2");

        //---- kitchenbutton ----
        kitchenbutton.setText("Home & Kitchen");
        contentPane.add(kitchenbutton, "cell 1 3");

        //---- toolsbutton ----
        toolsbutton.setText("Tools");
        contentPane.add(toolsbutton, "cell 1 4");

        //---- menubutton ----
        menubutton.setText("Menu");
        contentPane.add(menubutton, "cell 0 5");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JButton clothesbutton;
    private JButton foodbutton;
    private JButton bookbutton;
    private JButton kitchenbutton;
    private JButton toolsbutton;
    private JButton menubutton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
