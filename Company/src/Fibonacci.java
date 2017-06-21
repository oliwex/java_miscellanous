/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Fibonacci extends Thread
{
    private CountDownLatch latch;
    private static int number;
    
    Fibonacci(CountDownLatch latch,int number)
    {
        this.latch=latch;
        this.number=number;
    }
    public void run()
    {
        System.out.println("Started fibonacci");
        System.out.println(this.fib(this.number));
        System.out.println("Finished fibonacci");
    }
    private static int fib(int a)
    {
        if(a<3)
        {
            return 1;
        }
        else
        {
            return fib(a-2)+fib(a-1);
        }
    }
}