/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_java;

/**
 *
 * @author Ezequiel
 */
public class EJERCICIOEXTRA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int A = (int) (Math.random()*100);
        System.out.println("valor A "+A);
        int B = (int) (Math.random()*100);
         System.out.println("valor B "+B);
          int C = (int) (Math.random()*100);
         System.out.println("valor C "+C);
          int D = (int) (Math.random()*100);
         System.out.println("valor D "+D);
         int aux=0;
         aux=B;
         B=C;
         System.out.println("valor B "+B);
         C=A;
          System.out.println("valor C "+C);
         A=D;
         System.out.println("valor A "+A);
         D=aux;
          System.out.println("valor D "+D);       
         
    }
    
}