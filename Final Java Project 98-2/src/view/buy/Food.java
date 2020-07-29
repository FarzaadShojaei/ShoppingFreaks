/*
 * Created by JFormDesigner on Tue Jul 28 20:36:32 IRDT 2020
 */

package view.buy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controller.Controller;
import net.miginfocom.swing.*;
import view.Buy;
import view.Cart;

/**
 * @author mohammad
 */
public class Food extends JFrame {
    public Food() {
        initComponents();
    }

    private void menuActionPerformed(ActionEvent e) {
        dispose();
        Buy buy = new Buy();
        buy.setVisible(true);
        buy.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void cartActionPerformed(ActionEvent e) {
        dispose();
        Cart cart = new Cart();
        cart.setVisible(true);
        cart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void pizzaPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        pizzaPrice.setText(controller.priceReporter("Pizza") + " Toman");
        if (controller.numberReporter("Pizza") == 0){
            pizzaATC.setEnabled(false);
            pizzaPrice.setText("Not Available");
        }
    }

    private void hotDogPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        hotDogPrice.setText(controller.priceReporter("HotDog") + " Toman");
        if (controller.numberReporter("HotDog") == 0){
            hotDogATC.setEnabled(false);
            hotDogPrice.setText("Not Available");
        }
    }

    private void kebabPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        kebabPrice.setText(controller.priceReporter("Turkish Kebab") + " Toman");
        if (controller.numberReporter("Turkish Kebab") == 0){
            kebabATC.setEnabled(false);
            kebabPrice.setText("Not Available");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        pizzaPrice = new JLabel();
        hotDogPrice = new JLabel();
        kebabPrice = new JLabel();
        pizzaATC = new JButton();
        hotDogATC = new JButton();
        kebabATC = new JButton();
        menu = new JButton();
        cart = new JButton();

        //======== this ========
        setTitle("Food");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[132,fill]" +
            "[137,fill]" +
            "[129,fill]",
            // rows
            "[44]" +
            "[46]" +
            "[50]" +
            "[42]" +
            "[25]"));

        //---- label1 ----
        label1.setText("Pizza");
        contentPane.add(label1, "cell 0 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("HotDog");
        contentPane.add(label2, "cell 1 0,alignx center,growx 0");

        //---- label3 ----
        label3.setText("Turkish Kebab");
        contentPane.add(label3, "cell 2 0,alignx center,growx 0");

        //---- pizzaPrice ----
        pizzaPrice.setText("Price");
        pizzaPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                pizzaPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(pizzaPrice, "cell 0 1,alignx center,growx 0");

        //---- hotDogPrice ----
        hotDogPrice.setText("Price");
        hotDogPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                hotDogPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(hotDogPrice, "cell 1 1,alignx center,growx 0");

        //---- kebabPrice ----
        kebabPrice.setText("Price");
        kebabPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                kebabPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(kebabPrice, "cell 2 1,alignx center,growx 0");

        //---- pizzaATC ----
        pizzaATC.setText("Add to Cart");
        contentPane.add(pizzaATC, "cell 0 2");

        //---- hotDogATC ----
        hotDogATC.setText("Add to Cart");
        contentPane.add(hotDogATC, "cell 1 2");

        //---- kebabATC ----
        kebabATC.setText("Add to Cart");
        contentPane.add(kebabATC, "cell 2 2");

        //---- menu ----
        menu.setText("Menu");
        menu.addActionListener(e -> menuActionPerformed(e));
        contentPane.add(menu, "cell 0 3");

        //---- cart ----
        cart.setText("Cart");
        cart.addActionListener(e -> cartActionPerformed(e));
        contentPane.add(cart, "cell 2 3");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel pizzaPrice;
    private JLabel hotDogPrice;
    private JLabel kebabPrice;
    private JButton pizzaATC;
    private JButton hotDogATC;
    private JButton kebabATC;
    private JButton menu;
    private JButton cart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
