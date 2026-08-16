
package arthive;

import javax.swing.JFrame;

public class ArtHive {
    
public static String staticUserName = ""; // static variable 

public static String staticName = ""; // static variable 
public static String staticEmail = ""; // static variable

public static String staticEventPrice = ""; // static variable
public static String staticEventId = ""; // static variable

public static String staticArtproductId = ""; // static variable 
public static String staticBalance = ""; // static variable
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setExtendedState(LoginFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        LoginFrame.setLocationRelativeTo(null);
        
    }
    
}
