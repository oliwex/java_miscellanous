
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
public class Thread_synchronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        thread_symchronize thread = new thread_symchronize();
        thread.start();
        
        System.out.println("Click enter to stop: ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
        thread.shutdown();
    }
    
}
