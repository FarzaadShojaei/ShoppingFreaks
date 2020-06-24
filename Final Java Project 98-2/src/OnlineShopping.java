import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Jun 24 19:18:12 IRDT 2020
 */



/**
 * @author Farzad
 */
public class OnlineShopping {
    public OnlineShopping() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Farzad
        Menu = new JFrame();
        CommentButton = new JButton();
        dialog1 = new JDialog();
        IdLabel1 = new JLabel();
        CommentLabel1 = new JTextField();
        IdLabel2 = new JLabel();
        textField1 = new JTextField();
        SendButton = new JButton();
        ErrorDialog = new JDialog();
        ErrorText = new JTextField();
        LoginDialog = new JDialog();
        scrollPane1 = new JScrollPane();
        UsernameText = new JTextArea();
        passwordField = new JPasswordField();
        button1 = new JButton();

        //======== Menu ========
        {
            var MenuContentPane = Menu.getContentPane();
            MenuContentPane.setLayout(null);

            //---- CommentButton ----
            CommentButton.setText("Comments");
            MenuContentPane.add(CommentButton);
            CommentButton.setBounds(10, 325, 153, CommentButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < MenuContentPane.getComponentCount(); i++) {
                    Rectangle bounds = MenuContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = MenuContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                MenuContentPane.setMinimumSize(preferredSize);
                MenuContentPane.setPreferredSize(preferredSize);
            }
            Menu.pack();
            Menu.setLocationRelativeTo(Menu.getOwner());
        }

        //======== dialog1 ========
        {
            var dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);

            //---- IdLabel1 ----
            IdLabel1.setText("Id");
            dialog1ContentPane.add(IdLabel1);
            IdLabel1.setBounds(10, 25, 49, 45);
            dialog1ContentPane.add(CommentLabel1);
            CommentLabel1.setBounds(60, 25, 174, 50);

            //---- IdLabel2 ----
            IdLabel2.setText("Id");
            dialog1ContentPane.add(IdLabel2);
            IdLabel2.setBounds(0, 105, 55, 30);
            dialog1ContentPane.add(textField1);
            textField1.setBounds(60, 105, 179, textField1.getPreferredSize().height);

            //---- SendButton ----
            SendButton.setText("Send");
            dialog1ContentPane.add(SendButton);
            SendButton.setBounds(25, 275, 158, SendButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog1ContentPane.setMinimumSize(preferredSize);
                dialog1ContentPane.setPreferredSize(preferredSize);
            }
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }

        //======== ErrorDialog ========
        {
            var ErrorDialogContentPane = ErrorDialog.getContentPane();
            ErrorDialogContentPane.setLayout(null);

            //---- ErrorText ----
            ErrorText.setText("Failed");
            ErrorDialogContentPane.add(ErrorText);
            ErrorText.setBounds(40, 45, 109, ErrorText.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < ErrorDialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = ErrorDialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = ErrorDialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                ErrorDialogContentPane.setMinimumSize(preferredSize);
                ErrorDialogContentPane.setPreferredSize(preferredSize);
            }
            ErrorDialog.pack();
            ErrorDialog.setLocationRelativeTo(ErrorDialog.getOwner());
        }

        //======== LoginDialog ========
        {
            var LoginDialogContentPane = LoginDialog.getContentPane();
            LoginDialogContentPane.setLayout(null);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(UsernameText);
            }
            LoginDialogContentPane.add(scrollPane1);
            scrollPane1.setBounds(20, 30, 125, scrollPane1.getPreferredSize().height);
            LoginDialogContentPane.add(passwordField);
            passwordField.setBounds(30, 80, 124, passwordField.getPreferredSize().height);

            //---- button1 ----
            button1.setText("Login");
            LoginDialogContentPane.add(button1);
            button1.setBounds(45, 135, 88, button1.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < LoginDialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = LoginDialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = LoginDialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                LoginDialogContentPane.setMinimumSize(preferredSize);
                LoginDialogContentPane.setPreferredSize(preferredSize);
            }
            LoginDialog.pack();
            LoginDialog.setLocationRelativeTo(LoginDialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Farzad
    private JFrame Menu;
    private JButton CommentButton;
    private JDialog dialog1;
    private JLabel IdLabel1;
    private JTextField CommentLabel1;
    private JLabel IdLabel2;
    private JTextField textField1;
    private JButton SendButton;
    private JDialog ErrorDialog;
    private JTextField ErrorText;
    private JDialog LoginDialog;
    private JScrollPane scrollPane1;
    private JTextArea UsernameText;
    private JPasswordField passwordField;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
