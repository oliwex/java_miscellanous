
import java.util.LinkedList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Processor extends Thread
{
    private LinkedList<Integer> lista=new LinkedList<Integer>();
    private final int LIMIT=10;
    private Object lock = new Object();
    
    public void producer() throws InterruptedException
    {
        int i=0;
        
        while(true)
        {
            synchronized(this.lock)
            {
                while(this.lista.size() == this.LIMIT)
                {
                    this.lock.wait();
                }  
            }
            this.lista.add(i++);
            this.lock.notify();
        }
    }
    
    public void consumer() throws InterruptedException
    {
        Random random=new Random();
        while(true)
        {
            synchronized(this.lock)
            {
                while(this.lista.size() == this.LIMIT)
                {
                    this.lock.notify();
                }
                System.out.println("Rozmiar listy wynosi: "+this.lista.size());
                int value=this.lista.removeFirst();
                System.out.println("; value is: " + value);
                this.lock.notify();
            }
            
            Thread.sleep(random.nextInt(1000));
        }
    }
}

