

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {  
        Dane dane=new Dane(5,5);
        dane.showData();
        System.out.println("---------------------");
        Dane.Dzialania dzialania=dane.new Dzialania(5,5);
        System.out.println("Dodawanie: "+dzialania.sum());
    }
    
}
