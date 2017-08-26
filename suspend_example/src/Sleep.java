/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Sleep extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("i am going to sleep");
            }
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}