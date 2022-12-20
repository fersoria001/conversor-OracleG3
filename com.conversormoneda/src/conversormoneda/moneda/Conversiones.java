package conversormoneda.moneda;

import javax.swing.JOptionPane;

public class Conversiones {

    public void pesosADolar(double valor){
        double convertido = valor * 0.0058;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void pesosAEuro(double valor){
        double convertido =  valor * 0.0055;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void pesosALibra(double valor){
        double convertido =  valor * 0.0048;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void pesosAYen(double valor){
        double convertido =  valor * 0.79;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void pesosAWon(double valor){
        double convertido =  valor * 7.60;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void dolarAPesos(double valor){
        double convertido =  valor * 173;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void euroAPesos(double valor){
        double convertido =  valor * 182.29;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void libraAPesos(double valor){
        double convertido =  valor * 209.41;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void yenAPesos(double valor){
        double convertido =  valor * 1.26;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
    public void wonAPesos(double valor){
        double convertido =  valor * 0.13;
        JOptionPane.showMessageDialog(null, "The value converted is: $ " + convertido);
    }
}
