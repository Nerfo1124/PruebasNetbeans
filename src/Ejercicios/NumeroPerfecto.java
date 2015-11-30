package Ejercicios;

import javax.swing.JOptionPane;

/**
 *Qué es un número perfecto?
 * Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.
 * Por ejemplo, el número 6 es perfecto.
 * El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es perfecto.
 * Si sumamos 1 + 2 + 3 = 6 
 * @author Fernando
 */
public class NumeroPerfecto {
    
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero."));
        for(int i=1; i<numero; i++){
            if(numero%i == 0){
                suma = suma + i;
            }
        }
        if(suma==numero){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es perfecto.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es perfecto.");
        }
    }
}
