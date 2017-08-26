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
public class Set_priority {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Thread t=new Thread();
        t.start();
        System.out.println("Imię wątku: "+t.getName());
        t.setName("Penis");
        System.out.println("Nowe Imię wątku: "+t.getName());
        
        System.out.println("Priorytet wątku to: "+t.getPriority());
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj priorytet: ");
        int p=sc.nextInt();
        
        t.setPriority(p);
        System.out.println("Nowy priorytet wątku to: "+t.getPriority());
    }
    
}
