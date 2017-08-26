/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Thread_synchronization {
public int count=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Threads thread1=new Threads();
        Threads1 thread2=new Threads1();
        thread1.start();
        thread2.start();
        try
        {
           thread1.join(2000); 
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
