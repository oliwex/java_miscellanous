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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        int c=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        a=scan.nextInt();
        
        System.out.println("Podaj liczbe b: ");
        b=scan.nextInt();
        do
        {
            System.out.println("1.dodawanie");
            System.out.println("2.odejmowanie");
            System.out.println("3.dzielenie");
            System.out.println("4.mnożenie");
            c=scan.nextInt();
        }
        while(c==0);
        
        Calculator_class cc = new Calculator_class(a,b);
        
        switch(c)
        {
            case 1:
            {
                System.out.println("Wynik: "+cc.action_return(c));
                break;
            }
            case 2:
            {
                System.out.println("Wynik: "+cc.action_return(c));
                break;
            }
            case 3:
            {
                System.out.println("Wynik: "+cc.action_return(c));
                break;
            }
            case 4:
            {
                System.out.println("Wynik: "+cc.action_return(c));
                break;
            }
        }
        
    }
    
}
