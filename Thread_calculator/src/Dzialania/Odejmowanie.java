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
public class Odejmowanie extends Thread
{
    private int a;
    private int b;
    
    public Odejmowanie(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    private float odejmowanie()
    {
        return this.a-this.b;
    }
    
    @Override
    public void run()
    {
        System.out.println("Różnica wynosi: "+this.odejmowanie());
    }
}
