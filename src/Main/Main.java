package Main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import projetolojapi.LoginView;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        LoginView login = new LoginView();
        login.setLocationRelativeTo(null);
        login.setVisible(true);

        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
