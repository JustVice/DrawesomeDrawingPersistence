package Logic;

import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    public static boolean run = false;
    public static String name = "Drawesome drawing persistence",version = "1.0";

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }
    
}
