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
public class Fibonacci extends Thread
{
    
    private int a;
    
    public Fibonacci(int a)
    {
        this.a=a;
    }
    
    private float fibonacci(int a)
    {
    if(this.a<3)
    return 1;
 
    return fibonacci(this.a-2)+fibonacci(this.a-1);
    }
    
    @Override
    public void run()
    {
        System.out.println("Fibonacci wynosi: "+this.fibonacci(this.a));
    }
}
