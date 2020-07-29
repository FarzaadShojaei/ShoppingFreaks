/*
 * Created by JFormDesigner on Tue Jul 21 17:06:38 IRDT 2020
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
public class Book extends JFrame {
    public Book() {
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

    private void littlePrincePriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        littlePrincePrice.setText(controller.priceReporter("Little Prince") + " Toman");
        if (controller.numberReporter("Little Prince") == 0){
            littlePrinceATC.setEnabled(false);
            littlePrincePrice.setText("Not Available");
        }
    }

    private void warAndPeacePriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        warAndPeacePrice.setText(controller.priceReporter("War And Peace") + " Toman");
        if (controller.numberReporter("War And Peace") == 0){
            warAndPeaceATC.setEnabled(false);
            warAndPeacePrice.setText("Not Available");
        }
    }

    private void metro2034PriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        metro2034Price.setText(controller.priceReporter("Metro 2034") + " Toman");
        if (controller.numberReporter("Metro 2034") == 0){
            metro2034ATC.setEnabled(false);
            metro2034Price.setText("Not Available");
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        littlePrincePrice = new JLabel();
        warAndPeacePrice = new JLabel();
        metro2034Price = new JLabel();
        littlePrinceATC = new JButton();
        warAndPeaceATC = new JButton();
        metro2034ATC = new JButton();
        menu = new JButton();
        cart = new JButton();

        //======== this ========
        setTitle("Books");
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
        label1.setText("Little Prince");
        contentPane.add(label1, "cell 0 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("War And Peace");
        contentPane.add(label2, "cell 1 0,alignx center,growx 0");

        //---- label3 ----
        label3.setText("Metro 2034");
        contentPane.add(label3, "cell 2 0,alignx center,growx 0");

        //---- littlePrincePrice ----
        littlePrincePrice.setText("Price");
        littlePrincePrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                littlePrincePriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(littlePrincePrice, "cell 0 1,alignx center,growx 0");

        //---- warAndPeacePrice ----
        warAndPeacePrice.setText("Price");
        warAndPeacePrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                warAndPeacePriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(warAndPeacePrice, "cell 1 1,alignx center,growx 0");

        //---- metro2034Price ----
        metro2034Price.setText("Price");
        metro2034Price.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                metro2034PriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(metro2034Price, "cell 2 1,alignx center,growx 0");

        //---- littlePrinceATC ----
        littlePrinceATC.setText("Add to Cart");
        contentPane.add(littlePrinceATC, "cell 0 2");

        //---- warAndPeaceATC ----
        warAndPeaceATC.setText("Add to Cart");
        contentPane.add(warAndPeaceATC, "cell 1 2");

        //---- metro2034ATC ----
        metro2034ATC.setText("Add to Cart");
        contentPane.add(metro2034ATC, "cell 2 2");

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
    private JLabel littlePrincePrice;
    private JLabel warAndPeacePrice;
    private JLabel metro2034Price;
    private JButton littlePrinceATC;
    private JButton warAndPeaceATC;
    private JButton metro2034ATC;
    private JButton menu;
    private JButton cart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
