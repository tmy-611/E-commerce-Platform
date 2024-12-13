
package Admin;

import java.sql.SQLException;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws SQLException {
        JFrame login = new frmLogin();
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);   

    }
}
