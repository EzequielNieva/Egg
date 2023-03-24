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
public class EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
   conversor();
    }

    public static double monto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los euros que desea convertir");
        double euro = leer.nextDouble();
        return euro;
    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("menu\n"
                + "1-Libras\n"
                + "2-Dolar\n"
                + "3-Yenes");
        return leer.nextInt();
    }
    
    public static void conversor(){
        Scanner leer = new Scanner(System.in);
        boolean continuar=false; 
        while (!(continuar)){
            switch (menu()) {
            case 1:
                System.out.println("Total de libras: "+(0.86*monto()));
                break;
            case 2:
                System.out.println("Total de dolares: "+(1.28611*monto()));
                break;
            case 3:
                System.out.println("Total de dolares: "+(129.852*monto()));
                break;
            default:
                System.out.println("Numero equivocado");
                break;
        }
            System.out.println("Desea continuar?S/N");
            continuar=(boolean) leer.next();
        }
    }
    }
   
   
