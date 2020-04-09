package Main;

import View.Telaprincipal;
import javax.swing.UIManager;

// @author Diogo
public class Main {

    public Main() {
        Telaprincipal.getInstance().setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[3].getClassName());
        } catch (Exception ex) {
        }
        new Main();
    }
}