/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Calculator_class 
{
    private int liczba_a;
    private int liczba_b;
    
    Calculator_class(int a,int b)
    {
        try
        {
            this.liczba_a=a;
            this.liczba_b=b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: "+e);
        }
    }
    public float action_return(int i)
    {
       return this.action(i);
    }
    private float action(int i)
    {
        int c=0;
        switch(i)
        {
            case 1:
            {
                c=this.liczba_a+this.liczba_b;
                break;
            }
            case 2:
            {
                c=this.liczba_a-this.liczba_b;
                break;
            }
            case 3:
            {
                try
                {
                   c=this.liczba_a/this.liczba_b;
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Error: "+e);
                }
                break;
            }
            case 4:
            {
                c=this.liczba_a*this.liczba_b;
                break;
            }
        }
        return c;
    }
}
