
package principal;

import javax.swing.JOptionPane;
import model.Retangulo;

/**
 *
 * @author gusta
 */


public class Principal {
    
    public static void main(String[] args){
        Retangulo reta = new Retangulo();
        
        reta.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Retangulo: ")));
        
        reta.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Retangulo: ")));
        
        JOptionPane.showMessageDialog(null,"O valor da Área é: " + reta.getArea());
        
        JOptionPane.showMessageDialog(null,"O valor do perimetro deste retangulo é: " + reta.getPerimetro());
    }
    
}
