


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Dane
{
    
    private final Dzialania object;
    
    Dane(int a,int b)
    {
        this.object=new Dzialania(a,b);
    }    
    
    public class Dzialania
    {
        private final int liczba_a;
        private final int liczba_b;
        
        
        Dzialania(int a, int b) {
            this.liczba_a=a;
            this.liczba_b=b;
        }

        
        int sum()
        {
            return this.liczba_a+this.liczba_b;
        }
        private int difference()
        {
            return this.liczba_a-this.liczba_b;
        }
        private int multiply()
        {
            return this.liczba_a+this.liczba_b;
        }
        private int divide()
        {
            return this.liczba_a/this.liczba_b;
        }
    }
    public void showData()
    {
        System.out.println("Wyniki");
        System.out.println("Dodawanie: "+this.object.sum());
        System.out.println("Odejmowanie: "+this.object.difference());
        System.out.println("Mnożenie: "+this.object.multiply());
        System.out.println("Dodawanie: "+this.object.divide());
    }
    
    
}