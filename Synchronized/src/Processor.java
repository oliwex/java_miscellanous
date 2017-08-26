
import java.util.Scanner;

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
    public void produce() throws InterruptedException 
    {
        synchronized (this) 
        {
            System.out.println("Producer thread running ....");
            wait();
            System.out.println("Resumed.");
        }
    }

    public void consume() throws InterruptedException 
    {
        
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        
        synchronized (this) 
        {
            System.out.println("Waiting for return key.");
            scanner.nextLine();
            System.out.println("Return key pressed.");
            notify();
            Thread.sleep(5000);
        }
    }
        
        
    }
 
