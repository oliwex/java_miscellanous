
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(5);
        ExecutorService executor1 = Executors.newFixedThreadPool(3);
        ExecutorService executor2 = Executors.newFixedThreadPool(3);
        ExecutorService executor3 = Executors.newFixedThreadPool(5);
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Podaj liczbe: ");
        int a=sc.nextInt();
        
        for (int i=0;i<10;i++)
        {
            if (i<3)
            {
                executor1.submit(new Fibonacci(latch,a));   
            }
            if(i<8)
            {
                executor2.submit(new Fibonacci_i(latch,a));  
            }
            if (i<10)
            {
                executor3.submit(new Factor(latch,a));  
            }  
        }
        try
        {
            latch.await();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Complete");
        executor1.shutdown();
        executor2.shutdown();
        executor3.shutdown();
    }
    
}
