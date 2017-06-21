/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dzialania;

/**
 *
 * @author Minio
 */
public class Silnia extends Thread
{
    
    private int a;
    
    public Silnia(int a)
    {
        this.a=a;
    }
    
    private float silnia(int a)
    {
        if(this.a<2)
        {
            return 1; 
        }
        else
        {
            return this.a*silnia(this.a-1);  
        }
    }
    
    @Override
    public void run()
    {
        System.out.println("Silnia z liczby wynosi wynosi: "+this.silnia(this.a));
    }
}
