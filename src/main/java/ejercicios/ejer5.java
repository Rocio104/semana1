
package ejercicios;


public class ejer5 {
    public static void main(String[] args) {
        //Declaracion de variables
        double salarioT, sueldo, horas, sueldoH, horasT,  renta, rentaT, tiempo, totalF;
        
        //inicializar variables
        sueldo = 10;
        tiempo = 30;
        horas = 50;
        sueldoH = 0.10;
        renta = 0.10;
        
        salarioT = sueldo * tiempo;
        horasT = horas * sueldoH;
        totalF = salarioT + horasT;
        rentaT = totalF - renta;
        
        //uso de variables
        
        System.out.println("Su salario total es:" + rentaT);
        
        
       
        
        
        
        
    }
    
}
