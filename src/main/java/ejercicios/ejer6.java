
package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class ejer6 {
     public static void main(String[] args) {
        //Declaracion de variables
        
        double promedio, nota1, nota2, nota3, nota4, nota5;
        NumberFormat formato = new DecimalFormat("#0.00");
        
        //Inicializar variables 
        nota1 = 25 * 8.0 / 100;
        nota2 = 15 * 7.5 / 100;
        nota3 = 15 * 9.0 / 100;
        nota4 = 20 * 8.0 / 100;
        nota5 = 25 * 9.0 / 100;
        
        
        promedio = nota1 + nota2 + nota3 + nota4 + nota5;
        
        
        //uso de variables
        
        System.out.println("El promedio final es:" + formato.format(promedio));
        
        
        
        
        
    }
    
}
