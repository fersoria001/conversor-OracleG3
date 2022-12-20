package conversormedidas.temperaturas;

import javax.swing.JOptionPane;

public class ConversionMedidas {
    private double constanteUno = 9/5;
    private double constanteDos = 5/9;

    public void celsiusAFahrenheit(double celsius){
        double convertido =  ((celsius * constanteUno) + 32); 
        JOptionPane.showMessageDialog(null, "The value converted is:  " + convertido);
    }

    public void fahrenheitACelsius(double fahrenheit){
        double convertido =  fahrenheit - 32 * constanteDos;
        JOptionPane.showMessageDialog(null, "The value converted is: " + convertido);
    }
}
