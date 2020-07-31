/*
 * Created by JFormDesigner on Tue Jul 21 17:03:55 IRDT 2020
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
public class Cloth extends JFrame {
    public Cloth() {
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

    private void tankPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        tankPrice.setText(controller.priceReporter("TankTop") + " Toman");
    }

    private void jeansPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        jeansPrice.setText(controller.priceReporter("Jeans") + " Toman");
    }

    private void shirtPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        shirtPrice.setText(controller.priceReporter("Shirt") + " Toman");
    }

    private void tankATCActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.updateProducts("TankTop");
//        int temp = 1;
        Cart cart1 = new Cart();
        cart1.setTankNum(1);
        if (controller.numberReporter("TankTop") == 0){
            tankATC.setEnabled(false);
            tankPrice.setText("Not Available");
        }
    }

    private void jeansATCActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.updateProducts("Jeans");
        Cart cart1 = new Cart();
        cart1.setJeansNum(1);
        if (controller.numberReporter("Jeans") == 0){
            jeansATC.setEnabled(false);
            jeansPrice.setText("Not Available");
        }
    }

    private void shirtATCActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.updateProducts("Shirt");
        if (controller.numberReporter("Shirt") == 0){
            shirtATC.setEnabled(false);
            shirtPrice.setText("Not Available");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        tankPrice = new JLabel();
        jeansPrice = new JLabel();
        shirtPrice = new JLabel();
        tankATC = new JButton();
        jeansATC = new JButton();
        shirtATC = new JButton();
        menu = new JButton();
        cart = new JButton();

        //======== this ========
        setTitle("Cloth");
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
        label1.setText("TankTop");
        contentPane.add(label1, "cell 0 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("Jeans");
        contentPane.add(label2, "cell 1 0,alignx center,growx 0");

        //---- label3 ----
        label3.setText("Shirt");
        contentPane.add(label3, "cell 2 0,alignx center,growx 0");

        //---- tankPrice ----
        tankPrice.setText("Price");
        tankPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                tankPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(tankPrice, "cell 0 1,alignx center,growx 0");

        //---- jeansPrice ----
        jeansPrice.setText("Price");
        jeansPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                jeansPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(jeansPrice, "cell 1 1,alignx center,growx 0");

        //---- shirtPrice ----
        shirtPrice.setText("Price");
        shirtPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                shirtPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(shirtPrice, "cell 2 1,alignx center,growx 0");

        //---- tankATC ----
        tankATC.setText("Add to Cart");
        tankATC.addActionListener(e -> tankATCActionPerformed(e));
        contentPane.add(tankATC, "cell 0 2");

        //---- jeansATC ----
        jeansATC.setText("Add to Cart");
        jeansATC.addActionListener(e -> jeansATCActionPerformed(e));
        contentPane.add(jeansATC, "cell 1 2");

        //---- shirtATC ----
        shirtATC.setText("Add to Cart");
        shirtATC.addActionListener(e -> shirtATCActionPerformed(e));
        contentPane.add(shirtATC, "cell 2 2");

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
    private JLabel tankPrice;
    private JLabel jeansPrice;
    private JLabel shirtPrice;
    private JButton tankATC;
    private JButton jeansATC;
    private JButton shirtATC;
    private JButton menu;
    private JButton cart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
