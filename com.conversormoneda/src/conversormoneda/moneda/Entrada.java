package conversormoneda.moneda;

import javax.swing.JOptionPane;

public class Entrada {
    public static String pedirInput()
    {
        String cantidad = JOptionPane.showInputDialog(null, "Ingrese un valor: ");
        return cantidad;
    };

        public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            JOptionPane.showMessageDialog(null,"Intente otra vez!");
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException NoPudoConvertir) {
            JOptionPane.showMessageDialog(null,"Intente otra vez!");
            return false;
        }
        return true;
    }
}
