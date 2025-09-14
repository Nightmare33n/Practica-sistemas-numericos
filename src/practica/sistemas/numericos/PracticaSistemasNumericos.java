package practica.sistemas.numericos; // paquete smn

import javax.swing.JOptionPane; // importar coso para q se vea todo mas bonito

public class PracticaSistemasNumericos { // hacer clase PracticaSistemasNumericos ahi

    public static String convertirDecimalAOctal(int dec) { // le metes como param un decimal
        if (dec == 0) return "0";  // Este coso si el decimal es 0 obvio el octal tmb
        
        String octal = ""; // iniciar una variable sin nadota
        while (dec > 0) { // iniciar un bucle pa que se repita hasta q sea menor a 0
            int residuo = dec % 8; // guardar el residuo de dividir / 8
            octal = residuo + octal;   // guardar cada digito en la variable octal
            dec = dec / 8; // el decimal de va dividiendo por 8 yes yes
        }
        return octal; // devolver el resultado en octal
    }

    public static void main(String[] args) { // metodo main, pa que todo jale
        int decimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en decimal: "));
        // Le preguntas al user, pon un decimal aja:
        
       
        String resultado = convertirDecimalAOctal(decimal); // usas la funcion q hicimos antes y se guarda en resutltado
        JOptionPane.showMessageDialog(null, decimal + " en octal es: " + resultado); // Muestra q si es el resultado
    }
}