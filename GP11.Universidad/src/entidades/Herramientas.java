
package entidades;

import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.List;
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
    public static ArrayList<Inscripcion> cambiarNotaDeNullACero(List<Inscripcion> inscripcionEnviada){
        ArrayList<Inscripcion> inscripcionCorregida = new ArrayList<Inscripcion>();
        
        for(Inscripcion inscripcion : inscripcionEnviada){
            if(null == inscripcion.getNota() || inscripcion.getNota().isNaN()){
                inscripcion.setNota(0.0);
            }
            inscripcionCorregida.add(inscripcion);
        }
        
        return inscripcionCorregida;
    }

}
