
import java.util.ArrayList;
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
public class Generyki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Owoc> lista=new ArrayList<Owoc>();
        Owoc owoc=new Owoc("jabłko","Polska",18);
        
        lista.add(owoc);
        owoc.pisz();
        

            

    }
    
}
