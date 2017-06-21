/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Minio
 */
public class Thread_Fight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Podaj liczbę: ");
        int n=sc.nextInt();
        
        int a=0;
        KlasaA kA=new KlasaA();
        KlasaB kB=new KlasaB();
        
        for (int i=0;i<n;i++)
        {
            a=kA.countPlus(a);
            a=kB.countPlus(a);
        }
        System.out.print("Liczba a: "+a);
        
    }
    
}
