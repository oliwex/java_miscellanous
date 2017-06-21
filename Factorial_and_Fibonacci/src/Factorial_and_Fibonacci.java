/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Minio
 */
public class Factorial_and_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Podaj liczbę: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        Fibonacci fib=new Fibonacci(n);
        Factorial fac=new Factorial(n);
        
        fib.start();
        fac.start();
        
        try {
            //fib.sleep(2000);
            fib.join();
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        
        fib.interrupt();
        fac.interrupt();
    }
    
}
