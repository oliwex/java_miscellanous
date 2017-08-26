
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
public class Thread_2 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("WATEK 2: "+Lista.lista.add(2));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
        
    
}
