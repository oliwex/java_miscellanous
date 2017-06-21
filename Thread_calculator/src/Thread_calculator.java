/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.lang.ThreadGroup;
/**
 *
 * @author Minio
 */
public class Thread_calculator 
{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1.dodawanie");
        System.out.println("2.dzielenie");
        System.out.println("3.fibonacci");
        System.out.println("4.mnożenie");
        System.out.println("5.odejmowanie");
        System.out.println("6.silnia");
        
        
        System.out.println("Wybierz działanie: ");
        int wybor=sc.nextInt();
        
        System.out.println("Podaj liczbe: ");
        int a=sc.nextInt();
        System.out.println("Podaj liczbe: ");
        int b=sc.nextInt();
        
        
        
        Dzialania d=new Dzialania(wybor,a,b);
        d.run();
    }   
}
