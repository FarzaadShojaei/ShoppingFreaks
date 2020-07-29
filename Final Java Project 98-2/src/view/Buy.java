/*
 * Created by JFormDesigner on Tue Jul 21 15:59:54 IRDT 2020
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import view.buy.*;

/**
 * @author mohammad
 */
public class Buy extends JFrame {
    public Buy() { initComponents(); }

    private void menubuttonActionPerformed(ActionEvent e) {
        dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void clothesbuttonActionPerformed(ActionEvent e) {
        dispose();
        Cloth cloth = new Cloth();
        cloth.setVisible(true);
        cloth.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void foodbuttonActionPerformed(ActionEvent e) {
        dispose();
        Food food = new Food();
        food.setVisible(true);
        food.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void bookbuttonActionPerformed(ActionEvent e) {
        dispose();
        Book book = new Book();
        book.setVisible(true);
        book.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void kitchenbuttonActionPerformed(ActionEvent e) {
        dispose();
        Kitchen kitchen = new Kitchen();
        kitchen.setVisible(true);
        kitchen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void toolsbuttonActionPerformed(ActionEvent e) {
        dispose();
        Tools tools = new Tools();
        tools.setVisible(true);
        tools.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1ActionPerformed(ActionEvent e) {
        dispose();
        Cart cart = new Cart();
        cart.setVisible(true);
        cart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
        cart = new JButton();

        //======== this ========
        setTitle("Buy");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[100,fill]" +
            "[96,fill]" +
            "[100,fill]",
            // rows
            "[43]" +
            "[39]" +
            "[41]" +
            "[37]" +
            "[38]" +
            "[27]"));

        //---- clothesbutton ----
        clothesbutton.setText("Clothes");
        clothesbutton.addActionListener(e -> clothesbuttonActionPerformed(e));
        contentPane.add(clothesbutton, "cell 1 0");

        //---- foodbutton ----
        foodbutton.setText("Food");
        foodbutton.addActionListener(e -> foodbuttonActionPerformed(e));
        contentPane.add(foodbutton, "cell 1 1");

        //---- bookbutton ----
        bookbutton.setText("Book & etc");
        bookbutton.addActionListener(e -> bookbuttonActionPerformed(e));
        contentPane.add(bookbutton, "cell 1 2");

        //---- kitchenbutton ----
        kitchenbutton.setText("Home & Kitchen");
        kitchenbutton.addActionListener(e -> kitchenbuttonActionPerformed(e));
        contentPane.add(kitchenbutton, "cell 1 3");

        //---- toolsbutton ----
        toolsbutton.setText("Tools");
        toolsbutton.addActionListener(e -> toolsbuttonActionPerformed(e));
        contentPane.add(toolsbutton, "cell 1 4");

        //---- menubutton ----
        menubutton.setText("Menu");
        menubutton.addActionListener(e -> menubuttonActionPerformed(e));
        contentPane.add(menubutton, "cell 0 5");

        //---- cart ----
        cart.setText("Cart");
        cart.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(cart, "cell 2 5");
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
    private JButton cart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
