/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4_java;

/**
 *
 * @author Ezequiel
 */
public class EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        double num1,num2;
        System.out.println("Ingrese el numero1: ");
        num1=leer.nextDouble();
        System.out.println("Ingrese el numero2: ");
        num2=leer.nextDouble();
        calculadora(num1,num2);
        leer.close();
    }
    
    public static void calculadora(double num1,double num2){
        int opcion;
        Scanner leer=new Scanner(System.in);
        do {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Que operacion desea realizar? ");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: "+suma(num1,num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+resta(num1,num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+multiplicar(num1,num2));
                    break;
                case 4:
                    if (num2!=0) {
                        System.out.println("La division es: "+division(num1,num2));
                    } else {
                        System.out.println("Indeterminado");
                    }
                    break;
                case 5:
                    System.out.println("Apagando calculadora...");
                    return;
                default:
                    System.out.println("Ingreso numero erroneo");
                    break;
            }
        } while (opcion!=5);
        
    }
    
    public static double suma(double num1,double num2){
        return num1+num2;
    }
    
    public static double resta(double num1,double num2){
        return num1-num2;
    }
    
    public static double multiplicar(double num1,double num2){
        return num1*num2;
    }
    
    public static double division(double num1,double num2){
        return num1/num2;
    }
}
