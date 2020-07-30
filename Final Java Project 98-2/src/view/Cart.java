/*
 * Created by JFormDesigner on Tue Jul 28 21:51:40 IRDT 2020
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class Cart extends JFrame {
    public Cart() {
        initComponents();
    }

    private void menuActionPerformed(ActionEvent e) {
        dispose();
        Buy buy = new Buy();
        buy.setVisible(true);
        buy.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setTankNum(int num) {
        tapeNum.setText(String.valueOf(num));
    }

    public void setJeansNum(String num) {
        jeansNum.setText(num);
    }

    public void setShirtNum(int num) {
        shirtNum.setText(String.valueOf(num));
    }

    public void setPizzaNum(int num) {
        pizzaNum.setText(String.valueOf(num));
    }

    public void setHotdogNum(int num) {
        hotdogNum.setText(String.valueOf(num));
    }

    public void setKebabNum(int num) {
        kebabNum.setText(String.valueOf(num));
    }

    public void setLittleprinceNum(int num) {
        littleprinceNum.setText(String.valueOf(num));
    }

    public void setWarpeaceNum(int num) {
        warpeaceNum.setText(String.valueOf(num));
    }

    public void setMetroNum(int num) {
        metroNum.setText(String.valueOf(num));
    }

    public void setForkNum(int num) {
        forkNum.setText(String.valueOf(num));
    }

    public void setOvenNum(int num) {
        ovenNum.setText(String.valueOf(num));
    }

    public void setPlateNum(int num) {
        plateNum.setText(String.valueOf(num));
    }

    public void setTapeNum(int num) {
        pizzaNum.setText(String.valueOf(num));
    }

    public void setAxeNum(int num) {
        pizzaNum.setText(String.valueOf(num));
    }

    public void setBatNum(int num) {
        pizzaNum.setText(String.valueOf(num));
    }

    private void payActionPerformed(ActionEvent e) {
        dispose();
        Pay pay1 = new Pay();
        pay1.setVisible(true);
        pay1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        tankNum = new JLabel();
        label9 = new JLabel();
        metroNum = new JLabel();
        label2 = new JLabel();
        jeansNum = new JLabel();
        label10 = new JLabel();
        forkNum = new JLabel();
        label3 = new JLabel();
        shirtNum = new JLabel();
        label11 = new JLabel();
        ovenNum = new JLabel();
        label4 = new JLabel();
        pizzaNum = new JLabel();
        label12 = new JLabel();
        plateNum = new JLabel();
        label5 = new JLabel();
        hotdogNum = new JLabel();
        label13 = new JLabel();
        tapeNum = new JLabel();
        label6 = new JLabel();
        kebabNum = new JLabel();
        label14 = new JLabel();
        axeNum = new JLabel();
        label7 = new JLabel();
        littleprinceNum = new JLabel();
        label15 = new JLabel();
        batNum = new JLabel();
        label8 = new JLabel();
        warpeaceNum = new JLabel();
        label16 = new JLabel();
        totalPrice = new JLabel();
        menu = new JButton();
        pay = new JButton();

        //======== this ========
        setTitle("Cart");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[130,fill]" +
            "[35,fill]" +
            "[130,fill]" +
            "[35,fill]",
            // rows
            "[35]" +
            "[35]" +
            "[35]" +
            "[35]" +
            "[35]" +
            "[35]" +
            "[35]" +
            "[35]" +
            "[35]" +
            "[35]"));

        //---- label1 ----
        label1.setText("TankTop");
        contentPane.add(label1, "cell 0 0,alignx center,growx 0");

        //---- tankNum ----
        tankNum.setText("0");
        contentPane.add(tankNum, "cell 1 0,alignx center,growx 0");

        //---- label9 ----
        label9.setText("Metro 2034");
        contentPane.add(label9, "cell 2 0,alignx center,growx 0");

        //---- metroNum ----
        metroNum.setText("0");
        contentPane.add(metroNum, "cell 3 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("Jeans");
        contentPane.add(label2, "cell 0 1,alignx center,growx 0");

        //---- jeansNum ----
        jeansNum.setText("0");
        contentPane.add(jeansNum, "cell 1 1,alignx center,growx 0");

        //---- label10 ----
        label10.setText("Fork");
        contentPane.add(label10, "cell 2 1,alignx center,growx 0");

        //---- forkNum ----
        forkNum.setText("0");
        contentPane.add(forkNum, "cell 3 1,alignx center,growx 0");

        //---- label3 ----
        label3.setText("Shirt");
        contentPane.add(label3, "cell 0 2,alignx center,growx 0");

        //---- shirtNum ----
        shirtNum.setText("0");
        contentPane.add(shirtNum, "cell 1 2,alignx center,growx 0");

        //---- label11 ----
        label11.setText("Oven");
        contentPane.add(label11, "cell 2 2,alignx center,growx 0");

        //---- ovenNum ----
        ovenNum.setText("0");
        contentPane.add(ovenNum, "cell 3 2,alignx center,growx 0");

        //---- label4 ----
        label4.setText("Pizza");
        contentPane.add(label4, "cell 0 3,alignx center,growx 0");

        //---- pizzaNum ----
        pizzaNum.setText("0");
        contentPane.add(pizzaNum, "cell 1 3,alignx center,growx 0");

        //---- label12 ----
        label12.setText("Plate");
        contentPane.add(label12, "cell 2 3,alignx center,growx 0");

        //---- plateNum ----
        plateNum.setText("0");
        contentPane.add(plateNum, "cell 3 3,alignx center,growx 0");

        //---- label5 ----
        label5.setText("HotDog");
        contentPane.add(label5, "cell 0 4,alignx center,growx 0");

        //---- hotdogNum ----
        hotdogNum.setText("0");
        contentPane.add(hotdogNum, "cell 1 4,alignx center,growx 0");

        //---- label13 ----
        label13.setText("Tape");
        contentPane.add(label13, "cell 2 4,alignx center,growx 0");

        //---- tapeNum ----
        tapeNum.setText("0");
        contentPane.add(tapeNum, "cell 3 4,alignx center,growx 0");

        //---- label6 ----
        label6.setText("Turkish Kebab");
        contentPane.add(label6, "cell 0 5,alignx center,growx 0");

        //---- kebabNum ----
        kebabNum.setText("0");
        contentPane.add(kebabNum, "cell 1 5,alignx center,growx 0");

        //---- label14 ----
        label14.setText("Axe");
        contentPane.add(label14, "cell 2 5,alignx center,growx 0");

        //---- axeNum ----
        axeNum.setText("0");
        contentPane.add(axeNum, "cell 3 5,alignx center,growx 0");

        //---- label7 ----
        label7.setText("Little Prince");
        contentPane.add(label7, "cell 0 6,alignx center,growx 0");

        //---- littleprinceNum ----
        littleprinceNum.setText("0");
        contentPane.add(littleprinceNum, "cell 1 6,alignx center,growx 0");

        //---- label15 ----
        label15.setText("Bat");
        contentPane.add(label15, "cell 2 6,alignx center,growx 0");

        //---- batNum ----
        batNum.setText("0");
        contentPane.add(batNum, "cell 3 6,alignx center,growx 0");

        //---- label8 ----
        label8.setText("War And Peace");
        contentPane.add(label8, "cell 0 7,alignx center,growx 0");

        //---- warpeaceNum ----
        warpeaceNum.setText("0");
        contentPane.add(warpeaceNum, "cell 1 7,alignx center,growx 0");

        //---- label16 ----
        label16.setText("Total Price :");
        contentPane.add(label16, "cell 0 8,alignx center,growx 0");

        //---- totalPrice ----
        totalPrice.setText("0");
        contentPane.add(totalPrice, "cell 2 8,alignx center,growx 0");

        //---- menu ----
        menu.setText("Menu");
        menu.addActionListener(e -> menuActionPerformed(e));
        contentPane.add(menu, "cell 0 9");

        //---- pay ----
        pay.setText("Pay");
        pay.addActionListener(e -> payActionPerformed(e));
        contentPane.add(pay, "cell 2 9");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JLabel tankNum;
    private JLabel label9;
    private JLabel metroNum;
    private JLabel label2;
    private JLabel jeansNum;
    private JLabel label10;
    private JLabel forkNum;
    private JLabel label3;
    private JLabel shirtNum;
    private JLabel label11;
    private JLabel ovenNum;
    private JLabel label4;
    private JLabel pizzaNum;
    private JLabel label12;
    private JLabel plateNum;
    private JLabel label5;
    private JLabel hotdogNum;
    private JLabel label13;
    private JLabel tapeNum;
    private JLabel label6;
    private JLabel kebabNum;
    private JLabel label14;
    private JLabel axeNum;
    private JLabel label7;
    private JLabel littleprinceNum;
    private JLabel label15;
    private JLabel batNum;
    private JLabel label8;
    private JLabel warpeaceNum;
    private JLabel label16;
    private JLabel totalPrice;
    private JButton menu;
    private JButton pay;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
