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
public class Dodawanie extends Thread
{
    private int a;
    private int b;
    
    public Dodawanie(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    private int suma()
    {
        return this.a+this.b;
    }
    
    @Override
    public void run()
    {
        System.out.println("Suma wynosi: "+this.suma());
    }
}
