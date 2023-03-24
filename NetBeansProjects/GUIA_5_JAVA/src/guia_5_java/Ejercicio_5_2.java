/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_java;

/**
 *
 * @author Ezequiel
 */
public class Ejercicio_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int[][] matriz = new int[3][3];        
        int [] filas = new int [3];
        int [] columnas = new int [3];
        int diag1=0;
        int diag2=0;
        boolean magica=true;
        
        
        if(matriz.length == matriz[0].length){
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    filas[i]+=matriz[i][j];
                    columnas[j]+=matriz[j][i];
                    if(i==j){
                        diag1=matriz[i][j];
                    }
                    if((i+j)==matriz.length-1){
                        diag2=matriz[i][j];
                    }
                }
                
            }
        
        }
        if(diag1==diag2){
            for (int i = 0; i < columnas.length; i++) {
                if(!((filas[i]==columnas[i])&&(filas[i]==diag1))){
                    magica=false;
                }
                
            }
        }else{
            magica=false;
        }
        
        if(magica){
            System.out.println("La matriz es mágica!");
        }else{
            System.out.println("La matriz no es mágica.");
        }
        
        
    }
}
    
    
