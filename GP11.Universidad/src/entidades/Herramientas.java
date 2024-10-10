
package entidades;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Herramientas {
    public static boolean revisarSiEstaVacio( JTextField campoArevisar1, JTextField campoArevisar2, JTextField campoArevisar3) {
        boolean devolver = 
           campoArevisar1.getText().strip().isEmpty() || 
           campoArevisar2.getText().strip().isEmpty() || 
           campoArevisar3.getText().strip().isEmpty();
        
        return devolver;
    }
    public static boolean revisarSiEstaVacio( JTextField campoArevisar1, JTextField campoArevisar2, JTextField campoArevisar3, JTextField campoArevisar4) {
        boolean devolver = 
           campoArevisar1.getText().strip().isEmpty() || 
           campoArevisar2.getText().strip().isEmpty() || 
           campoArevisar3.getText().strip().isEmpty() || 
           campoArevisar4.getText().strip().isEmpty();
        
        return devolver;
    }
    public static boolean revisarSiEstaVacio(JDateChooser calendar, JTextField campoArevisar1, JTextField campoArevisar2, JTextField campoArevisar3, JTextField campoArevisar4) {
        boolean devolver = calendar.getDate() == null || 
           campoArevisar1.getText().strip().isEmpty() || 
           campoArevisar2.getText().strip().isEmpty() || 
           campoArevisar3.getText().strip().isEmpty() || 
           campoArevisar4.getText().strip().isEmpty();
       
        return devolver;
    }

}
