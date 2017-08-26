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
public class Factor extends Thread
{
    private CountDownLatch latch;
    private static int number;
    
    Factor(CountDownLatch latch,int number)
    {
        this.latch=latch;
        this.number=number;
    }
    public void run()
    {
        System.out.println("Started silnia");
        System.out.println(this.fac(this.number));
        System.out.println("Finished silnia");
    }
    private int fac(int n)
    {
        int wynik=1;
        
        if (n == 0) 
        {
            return 1;
        }
        else
        {
            while (n > 0)
            {
            wynik *= n;
            n--;
            }
            return wynik;
        }
    }
}