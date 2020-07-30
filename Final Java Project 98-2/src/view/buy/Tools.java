/*
 * Created by JFormDesigner on Tue Jul 21 17:07:14 IRDT 2020
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
public class Tools extends JFrame {
    public Tools() {
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

    private void tapePriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        tapePrice.setText(controller.priceReporter("Tape") + " Toman");
    }

    private void axePriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        axePrice.setText(controller.priceReporter("Axe") + " Toman");
    }

    private void batPriceAncestorAdded(AncestorEvent e) {
        Controller controller = new Controller();
        batPrice.setText(controller.priceReporter("Bat") + " Toman");
    }

    private void tapeATCActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.updateProducts("Tape");
        if (controller.numberReporter("Tape") == 0){
            tapeATC.setEnabled(false);
            tapePrice.setText("Not Available");
        }
    }

    private void axeATCActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.updateProducts("Axe");
        if (controller.numberReporter("Axe") == 0){
            axeATC.setEnabled(false);
            axePrice.setText("Not Available");
        }
    }

    private void batATCActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.updateProducts("Bat");
        if (controller.numberReporter("Bat") == 0){
            batATC.setEnabled(false);
            batPrice.setText("Not Available");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        tapePrice = new JLabel();
        axePrice = new JLabel();
        batPrice = new JLabel();
        tapeATC = new JButton();
        axeATC = new JButton();
        batATC = new JButton();
        menu = new JButton();
        cart = new JButton();

        //======== this ========
        setTitle("Tools");
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
        label1.setText("Tape");
        contentPane.add(label1, "cell 0 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("Axe");
        contentPane.add(label2, "cell 1 0,alignx center,growx 0");

        //---- label3 ----
        label3.setText("Bat");
        contentPane.add(label3, "cell 2 0,alignx center,growx 0");

        //---- tapePrice ----
        tapePrice.setText("Price");
        tapePrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                tapePriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(tapePrice, "cell 0 1,alignx center,growx 0");

        //---- axePrice ----
        axePrice.setText("Price");
        axePrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                axePriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(axePrice, "cell 1 1,alignx center,growx 0");

        //---- batPrice ----
        batPrice.setText("Price");
        batPrice.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent e) {
                batPriceAncestorAdded(e);
            }
            @Override
            public void ancestorMoved(AncestorEvent e) {}
            @Override
            public void ancestorRemoved(AncestorEvent e) {}
        });
        contentPane.add(batPrice, "cell 2 1,alignx center,growx 0");

        //---- tapeATC ----
        tapeATC.setText("Add to Cart");
        tapeATC.addActionListener(e -> tapeATCActionPerformed(e));
        contentPane.add(tapeATC, "cell 0 2");

        //---- axeATC ----
        axeATC.setText("Add to Cart");
        axeATC.addActionListener(e -> axeATCActionPerformed(e));
        contentPane.add(axeATC, "cell 1 2");

        //---- batATC ----
        batATC.setText("Add to Cart");
        batATC.addActionListener(e -> batATCActionPerformed(e));
        contentPane.add(batATC, "cell 2 2");

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
    private JLabel tapePrice;
    private JLabel axePrice;
    private JLabel batPrice;
    private JButton tapeATC;
    private JButton axeATC;
    private JButton batATC;
    private JButton menu;
    private JButton cart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
