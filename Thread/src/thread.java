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
public class thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   
        System.out.println("Podaj liczbe do silni: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        thread_create tc = new thread_create(a); //starting a class
        Thread t1 =new Thread(tc); //starting a thread
        
        t1.start();
        
        
        
        
    }
    
}
