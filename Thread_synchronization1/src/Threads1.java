/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Threads1 extends Thread
{
    
    public void run()
    {
        this.loop();
    }
    private void loop()
    {
        for (int i=0;i<2000;i++)
        {
            System.out.println("Czytam: "+i);
        }
    }
}
