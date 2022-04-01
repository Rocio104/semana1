
package ejercicios;


public class ejer2 {
     public static void main(String[] args) {
        
    //Establecer valores a las varables
    
    double dolares = 100;
    double europa = 0.70;
    double reino_u = 0.61;
    double australia = 0.95;
    double canada = 0.97;
    double usd = 1.00;
    double convercion1;
    double convercion2;
    double convercion3;
    double convercion4;
    double convercion5;
    
    //realizamos convercion
    
        convercion1 = dolares * europa;
        System.out.println("La convercion de dolares a la moneda de Europa es: " + convercion1);
        convercion2 = dolares * reino_u;
        System.out.println("La convercion de dolares a la moneda de Reino Unido es: " + convercion2);
        convercion3 = dolares * australia;
        System.out.println("La convercion de dolares a la  moneda de Australia es: " + convercion3);
        convercion4 = dolares * canada;
        System.out.println("La convercion de dolares a la moneda de Canada es: " + convercion4);
        convercion5 = dolares * usd;
        System.out.println("La convercion de dolares a moneda USD es: " + convercion5);
        
        
        
    }
    
}
