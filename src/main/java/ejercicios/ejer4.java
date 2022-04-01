
package ejercicios;


public class ejer4 {
    public static void main(String[] args) {
        //Declaracion de variables
        double afpT, afpE, sueldo, pagoafp, pagoT, pagoF;
        
        //Inicializar variables
        sueldo = 500;
        afpT = 0.06;
        afpE = 0.065;
        
        pagoafp = sueldo * afpT;
        pagoT = sueldo * afpE;
        pagoF = pagoafp + pagoT;
        
        //uso de variables
        
        System.out.println("Usted esta pagando a AFP la cantidad de:" + pagoF);
        
    }
    
}
