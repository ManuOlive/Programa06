/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa06;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Cibercafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hr1, min1, seg1,soporte,z=0, resmin = 0,resseg=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la hora de entrada: Ejemplo[14],[15],etc");
        hr1=entrada.nextInt();
        System.out.println("\nIngresa el minuto de entrada: ");
        min1=entrada.nextInt();
        System.out.println("\nIngresa segundo de salida: ");
        seg1=entrada.nextInt();
        System.out.println("\nIngresa la hora de salida: Ejemplo[14],[15],etc");
        int hr2=entrada.nextInt();
        System.out.println("\nIngresa el minuto de salida: ");
        int min2=entrada.nextInt();
        System.out.println("Ingresa el segundo de salida: \n");
        int seg2=entrada.nextInt();
        if(seg1>seg2){
            soporte=seg2+60;
            resseg = soporte-seg1;
            System.out.println("\nTiempo: \n" + resseg+" Segundos");
            min2=min2-1;
           }else{
            int resta=seg2-seg1;
            System.out.println("Tiempo: \n" + resta+" Segundos");
        }
        if(min1>min2){
            int soporte2=min2+60;
            resmin = soporte2-min1;
            System.out.println("Tiempo: \n" + resmin +" Minutos");
            hr2 = hr2-1;
        }else{
            int resta2=min2-min1;
            System.out.println("Tiempo: \n" + resta2 + " Minutos");
        }
        if(hr1>hr2){
            int soporte3=hr2+24;
            z=soporte3-hr1;
            System.out.println("Tiempo: \n" + z+" Horas");
        }else{
            int resta3=hr2-hr1;
            System.out.println("Tiempo: \n" + resta3+" Horas");
        }    
              
        
                    
    }
    
}
