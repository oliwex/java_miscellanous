/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class KlasaB extends Thread
{
    public static int count;
    /*
    @Override
    public void run()
    {
        System.out.println(this.count);
        this.countPlus();
    }*/
    public int countPlus(int count)
    {            
        this.count=count;
        this.count++;
        System.out.println("Klasa B: "+this.count);
        return this.count;
    }  
}
