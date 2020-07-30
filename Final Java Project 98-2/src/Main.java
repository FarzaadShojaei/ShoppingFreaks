import java.util.*;
import java.sql.*;
import java.net.*;

import controller.Controller;
import view.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.initNumberOfProducts();
        SignUp signUp = new SignUp();
        signUp.setVisible(true);
        signUp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                controller.removeProducts();
            }
        });
    }
}
