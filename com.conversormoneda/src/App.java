import javax.swing.JOptionPane;

import conversormoneda.model.Conversiones;
import conversormoneda.model.Entrada;
import conversormoneda.model.menuConversion;
import conversormoneda.model.menuPrincipal;


/**
 * App
 */
public class App {

    public static void main(String[] args) {
    boolean iniciar = true;
    do{
        Object seleccion = JOptionPane.showInputDialog(
            null, 
            menuPrincipal.mensaje,
            menuPrincipal.titulo,
            JOptionPane.QUESTION_MESSAGE,
            null,
            menuPrincipal.opciones,
            menuPrincipal.opciones[0]);

        if(seleccion == menuPrincipal.opciones[0])
        {
            String numero;
            do
            {
                numero = Entrada.pedirInput();
            }
            while(!Entrada.isNumeric(numero));
            Double valor = Double.parseDouble(numero);
            Object origen = JOptionPane.showInputDialog(
                null, 
                menuConversion.mensaje,
                menuConversion.titulo,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menuConversion.opciones,
                menuConversion.opciones[0]);
            Conversiones conversion = new Conversiones();
            switch((String)origen)
            {
                case "Pesos a Dolar":
                {
                    conversion.pesosADolar(valor);
                    break;
                }
                case "Pesos a Euro":
                {
                    conversion.pesosAEuro(valor);
                    break;
                }
                
                case "Pesos a Libra E.":
                {
                    conversion.pesosALibra(valor);
                    break;
                }
                
                case "Pesos a Yen":
                {
                    conversion.pesosAYen(valor);
                    break;
                }
                case "Pesos a Won":
                {
                    conversion.pesosAWon(valor);
                    break;
                }
                case "Dolar a Pesos":
                {
                    conversion.dolarAPesos(valor);
                    break;
                }
                case "Euro a Pesos":
                {
                    conversion.euroAPesos(valor);
                    break;
                }
                case "Libra.E a Pesos":
                {
                    conversion.libraAPesos(valor);
                    break;
                }
                case "Yen a Pesos":
                {
                    conversion.yenAPesos(valor);
                    break;
                }
                case "Won a Pesos":
                {
                    conversion.wonAPesos(valor);
                    break;
                }

            }
        } else {
            iniciar = false;
            JOptionPane.showMessageDialog(null, "Extra no implementado");
        }
        int continuar = JOptionPane.showConfirmDialog(null, "Do you want to convert another currency?");
        if(JOptionPane.OK_OPTION == continuar)
        {
            iniciar = true;
        } else {
            iniciar = false;
            JOptionPane.showMessageDialog(null, "Goodbye!");
        }
    } while (iniciar);
    } 

}