/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Priority_class extends Thread
{
    public void run()
    {
        for (int i=0;i<1000;i++)
        {
            System.out.println(i);
        }
        
    }
}
