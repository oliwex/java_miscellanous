
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Minio
 */
public class list_with_threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Thread_1 t1=new Thread_1();
        Thread_2 t2=new Thread_2();
        int i=0;
        while(Lista.running_flag)
        {
            t1.start();
            t2.start();
            Scanner sc=new Scanner(System.in);
            sc.nextLine();
            Lista.changeFlag();
            System.out.println(Lista.lista.get(i));
            i++;
        }
    }
    
}
