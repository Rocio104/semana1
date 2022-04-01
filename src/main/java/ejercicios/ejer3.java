
package ejercicios;


public class ejer3 {
     public static void main(String[] args) {
        //Declaracion de variables
        double sueldoxh, hora, salarioT, renta, rentaT, total;
        
        //Inicializar variables
        sueldoxh = 8;
        hora = 36;
        renta = 0.10;
        
        salarioT = sueldoxh * hora;
        rentaT = salarioT * renta;
        total = salarioT - rentaT;
        
        //uso de variables
        
        System.out.println("El salario total es:" + total);
        
     }
    
}
