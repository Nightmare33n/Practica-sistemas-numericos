import javax.swing.JOptionPane; // importar coso para q se vea todo mas bonito

public class OctalADecimal { // hacer clase OctalADecimal ahi

    public static int convertirOctalADecimal(String octal) { // le metes como param un octal
        int decimal = 0; // iniciar una variable en 0
        int potencia = 0; // pa guardar la potencia de 8
        
        // empezar desde el ultimo digito del octal
        for (int i = octal.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(octal.charAt(i)); // sacar cada digito
            
            // verificar q el digito sea valido pa octal (0-7)
            if (digito < 0 || digito > 7) {
                throw new IllegalArgumentException("Numero octal invalido: " + octal);
            }
            
            decimal += digito * Math.pow(8, potencia); // multiplicar el digito por 8^potencia
            potencia++; // aumentar la potencia pa el siguiente digito
        }
        
        return decimal; // devolver el resultado en decimal
    }

    public static void main(String[] args) { // metodo main, pa que todo jale
        try {
            String octal = JOptionPane.showInputDialog("Ingrese el numero en octal: ");
            // Le preguntas al user, pon un octal aja:
            
            if (octal == null || octal.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingresaste nada!");
                return;
            }
            
            int resultado = convertirOctalADecimal(octal.trim()); // usas la funcion q hicimos antes
            JOptionPane.showMessageDialog(null, octal + " en decimal es: " + resultado); // Muestra q si es el resultado
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }
}