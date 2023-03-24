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
public class EJERCICIO_5_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];
        
        System.out.println("MATRIZ A - ORIGINAL");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 19) -9;
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ B - TRANSPUESTA");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizB[j][i] = matrizA[i][j];
                System.out.print(matrizB[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ C - NEGATIVA");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizC[j][i] = matrizA[i][j] * -1;
                System.out.print(matrizC[j][i] + " ");
            }
            System.out.println("");
        }
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (matrizA[i][j] != matrizC[i][j]) {
                    System.out.println("La matriz no es antisimetrica.");
                    break;
                }
                break;
            }
            break;
        }     
    }
    
}
