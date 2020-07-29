/*
 * Created by JFormDesigner on Tue Jul 21 17:07:05 IRDT 2020
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
public class Kitchen extends JFrame {
    public Kitchen() {
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

    private void forkPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        forkPrice.setText(controller.priceReporter("Fork") + " Toman");
        if (controller.numberReporter("Fork") == 0){
            forkATC.setEnabled(false);
            forkPrice.setText("Not Available");
        }
    }

    private void ovenPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        ovenPrice.setText(controller.priceReporter("Oven") + " Toman");
        if (controller.numberReporter("Oven") == 0){
            ovenATC.setEnabled(false);
            ovenPrice.setText("Not Available");
        }
    }

    private void platePriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        platePrice.setText(controller.priceReporter("Plate") + " Toman");
        if (controller.numberReporter("Plate") == 0){
            plateATC.setEnabled(false);
            platePrice.setText("Not Available");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        forkPrice = new JLabel();
        ovenPrice = new JLabel();
        platePrice = new JLabel();
        forkATC = new JButton();
        ovenATC = new JButton();
        plateATC = new JButton();
        menu = new JButton();
        cart = new JButton();

        //======== this ========
        setTitle("Kitchen");
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
        label1.setText("Fork");
        contentPane.add(label1, "cell 0 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("Oven");
        contentPane.add(label2, "cell 1 0,alignx center,growx 0");

        //---- label3 ----
        label3.setText("Plate");
        contentPane.add(label3, "cell 2 0,alignx center,growx 0");

        //---- forkPrice ----
        forkPrice.setText("Price");
        forkPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                forkPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(forkPrice, "cell 0 1,alignx center,growx 0");

        //---- ovenPrice ----
        ovenPrice.setText("Price");
        ovenPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                ovenPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(ovenPrice, "cell 1 1,alignx center,growx 0");

        //---- platePrice ----
        platePrice.setText("Price");
        platePrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                platePriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(platePrice, "cell 2 1,alignx center,growx 0");

        //---- forkATC ----
        forkATC.setText("Add to Cart");
        contentPane.add(forkATC, "cell 0 2");

        //---- ovenATC ----
        ovenATC.setText("Add to Cart");
        contentPane.add(ovenATC, "cell 1 2");

        //---- plateATC ----
        plateATC.setText("Add to Cart");
        contentPane.add(plateATC, "cell 2 2");

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
    private JLabel forkPrice;
    private JLabel ovenPrice;
    private JLabel platePrice;
    private JButton forkATC;
    private JButton ovenATC;
    private JButton plateATC;
    private JButton menu;
    private JButton cart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
