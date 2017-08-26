/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Factorial extends Thread
{
    private static int n;
    
    Factorial(int n)
    {
        this.n=n;
    }
    @Override
    public void run()
    {
        long silnia=1;
        for(int i=1;i<this.n;i++)
        {
            silnia=silnia*i; //lub silnia = silnia * i
            System.out.println("Silnia: "+silnia);
        } 
    }

}
