/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Dzialania.*;
/**
 *
 * @author Minio
 */
public class Dzialania extends ThreadGroup
{
    private int wybor;
    private int a;
    private int b;
    
    private ThreadGroup grupa_watkow;
    private Dodawanie suma;
    private Dzielenie iloraz;
    private Fibonacci fibonacci;
    private Mnożenie iloczyn;
    private Odejmowanie różnica;
    private Silnia silnia;

    
    Dzialania(int wybor,int a,int b)
    {
        super("Kalkulator"); //ponieważ musi być odpowiedni konstruktor dla klasy thread group
        
        this.a=a;
        this.b=b;
        
        
        
        this.wybor=wybor;
        
        try
        {
            this.grupa_watkow = new ThreadGroup("Kalkulator");
            
            /* prawdopodobnie niepotrzebne
            this.suma=new Dodawanie(this.a,this.b);
            this.iloraz=new Dzielenie(this.a,this.b);
            this.fibonacci=new Fibonacci(this.a);
            this.iloczyn=new Mnożenie(this.a,this.b);
            this.różnica=new Odejmowanie(this.a,this.b);
            this.silnia=new Silnia(this.a);
            */
            
        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }

    
    private void wybierz_dzialanie()
    {
       switch(this.wybor)
        {
            case 1:
            {
                Dodawanie suma=new Dodawanie(this.a,this.b);
                Thread dodawanie = new Thread(this.grupa_watkow,suma,"suma");     
                dodawanie.start();

                break;
            }
            case 2:
            {
                Dzielenie iloraz=new Dzielenie(this.a,this.b);
                Thread dzielenie = new Thread(this.grupa_watkow,iloraz,"iloraz");     
                dzielenie.start();
                break;
            }
            case 3:
            {
                Fibonacci fibonacci=new Fibonacci(this.a);
                Thread fib = new Thread(this.grupa_watkow,fibonacci,"fibonacci");     
                fib.start();
                break;
            }
            case 4:
            {
                Mnożenie iloczyn=new Mnożenie(this.a,this.b);
                Thread mnożenie = new Thread(this.grupa_watkow,iloczyn,"iloczyn");     
                mnożenie.start();
                break;
            }
            case 5:
            {
                Odejmowanie różnica=new Odejmowanie(this.a,this.b);
                Thread odejmowanie = new Thread(this.grupa_watkow,różnica,"odejmowanie");     
                odejmowanie.start();
                break;
            }
            case 6:
            {
                Silnia silnia=new Silnia(this.a);
                Thread odejmowanie = new Thread(this.grupa_watkow,silnia,"silnia");     
                odejmowanie.start();
                break;
            }
        }
       Thread.currentThread().getThreadGroup().interrupt();  //przerwanie wszystkich wątków w górze
    }
    public void run()
    {
        this.wybierz_dzialanie();
    }
}
