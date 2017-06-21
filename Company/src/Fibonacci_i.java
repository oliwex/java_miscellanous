
import java.util.concurrent.CountDownLatch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Fibonacci_i extends Thread
{
    private CountDownLatch latch;
    private static int number;
    
    Fibonacci_i(CountDownLatch latch,int number)
    {
        this.latch=latch;
        this.number=number;
    }
    public void run()
    {
        System.out.println("Started fibonacci iteracyjny");
        int a = 0, b = 1;
 
        for(int i=0;i<this.number;i++)
        { 
            this.number=b;
            b += a; //pod zmienną b przypisujemy wyraz następny czyli a+b
            a = b-a; //pod zmienną a przypisujemy wartość zmiennej b
        }
        System.out.println(this.number);
        System.out.println("Finished fibonacci iteracyjny");
    }
}
