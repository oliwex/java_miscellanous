
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
public class Producer_Consumer_Linked_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException
    {
        
            final Processor processor = new Processor();
            
            Thread t1 = new Thread(new Runnable() {
                
                @Override
                public void run() {
                    try {
                        processor.producer();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Producer_Consumer_Linked_List.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            Thread t2 = new Thread(new Runnable() {
                
                @Override
                public void run()
                {
                    try {
                        processor.consumer();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Producer_Consumer_Linked_List.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            t1.start();
            t2.start();
           
            t1.join();
            t2.join();

    }
    
}
