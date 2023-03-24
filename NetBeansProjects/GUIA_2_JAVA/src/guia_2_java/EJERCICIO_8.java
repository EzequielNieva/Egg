/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_java;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int t;
      t = leer.nextInt();
     
        for(int i=0 ; i < t; i++ ) {
            for (int j=0;j < t ; j++ ){
                if (i==0 && j !=t-1) {
                    System.out.print("*");
                   
                }
                if (i==0 && j == t-1) {
                    System.out.println("*");
                   
                }
                if (j==0){
                    if (i>0){
                        if (i<t-1){
                            System.out.print("*");
                            
                        }
                    }
                }
                if (j!=0){
                    if (i!=0){
                        if (i!=t-1){
                            if (j!=t-1){
                                System.out.print(" ");
                                
                            }
                        }
                    }
                }
                if (j==t-1){
                    if (i>0){
                        if (i<t){
                            System.out.println("*");
                            
                        }
                    }
                }
                if (i==t-1) {
                    System.out.print("*");
                    
                }
            }
        }

    }}
