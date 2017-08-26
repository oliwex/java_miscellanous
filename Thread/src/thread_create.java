/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
class thread_create implements Runnable 
{
    private static int a;
    thread_create(int a)
    {
        this.a=a;
    }
    
    public void run() //method which is executing code into a thread
    {
        System.out.println("Silnia z "+this.a+" to: "+this.factorial_recurrence(a));
        System.out.println("Silnia z "+this.a+" to: "+this.factorial_iteration(a));
    }
    private static int factorial_recurrence(int a) 
    {
        if (a==0)
        {
            return a=1;
        }
        else if(a==1)
        {
            return a;
        }
        else
        {
            return factorial_recurrence(a-1)*a;
        }
    }
    private static int factorial_iteration(int a) 
    {
        int factorial=1;
        for (int i=1;i<=a;i++)
        {
            factorial=factorial*i;
        }
        return factorial;
    }
}