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
public class Mnożenie extends Thread
{
    private int a;
    private int b;
    
    public Mnożenie(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    private int mnożenie()
    {
        return this.a*this.b;
    }
    
    @Override
    public void run()
    {
        System.out.println("Iloczyn wynosi: "+this.mnożenie());
    }
}
