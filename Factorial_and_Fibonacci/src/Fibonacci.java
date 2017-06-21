/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Fibonacci extends Thread
{
    private static int n;
    Fibonacci(int n)
    {
        this.n=n;
    }
    @Override
    public void run()
    {
      long a = 0, b = 1;
 
        for(int i=0;i<this.n;i++)
        {
            System.out.println("Fibonacci: "+b);
            b += a; //pod zmienną b przypisujemy wyraz następny czyli a+b
            a = b-a; //pod zmienną a przypisujemy wartość zmiennej b
        }

    }
    

}

