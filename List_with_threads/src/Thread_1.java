
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Thread_1 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
           System.out.println("WATEK 1: "+Lista.lista.add(1));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
