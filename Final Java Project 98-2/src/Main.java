import java.util.*;
import java.sql.*;
import java.net.*;
import view.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SignUp signUp = new SignUp();
        signUp.setVisible(true);
        signUp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
