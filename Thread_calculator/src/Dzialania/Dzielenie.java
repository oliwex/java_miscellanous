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
public class Dzielenie extends Thread
{
    private int a;
    private int b;
    
    public Dzielenie(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    private float dzielenie()
    {
        int c = 0;
        try
        {
            c=this.a/this.b; 
        }
        catch (Exception e)
        {
            System.out.println(e.getCause().getMessage());
        }
        return c;
    }
    
    @Override
    public void run()
    {
        System.out.println("Iloraz wynosi: "+this.dzielenie());
    }
}
