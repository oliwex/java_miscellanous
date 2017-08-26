/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Minio
 */
public class quadric_function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj współrzędne funkcji kwadratowej: ");
        int a=sc.nextInt();
        System.out.println("Podaj współrzędne funkcji kwadratowej: ");
        int b=sc.nextInt();
        System.out.println("Podaj współrzędne funkcji kwadratowej: ");
        int c=sc.nextInt();
        
        quadric_function_class qfc = new quadric_function_class(a,b,c);
        qfc.count_cero_place();
    }
    
}
