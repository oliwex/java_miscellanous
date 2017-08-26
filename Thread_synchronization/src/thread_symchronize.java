/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class thread_symchronize extends Thread
{
    private boolean running=true;
    public void run()
    {
        int i=0;
        while (this.running)
        {
            System.out.println("Piszę: "+i);
            i++;
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void shutdown()
    {
        this.running=false;
    }

}
