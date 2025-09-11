package practica.sistemas.numericos;

import javax.swing.JOptionPane;

public class PracticaSistemasNumericos {

    public static String convertirDecimalAOctal(int dec) {
        if (dec == 0) return "0";  // Caso especial
        
        String octal = "";
        while (dec > 0) {
            int residuo = dec % 8;
            octal = residuo + octal;  // Esto está bien
            dec = dec / 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        int decimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en decimal: "));
        
       
        String resultado = convertirDecimalAOctal(decimal);
        JOptionPane.showMessageDialog(null, decimal + " en octal es: " + resultado);
    }
}