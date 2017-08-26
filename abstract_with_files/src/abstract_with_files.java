/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class abstract_with_files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dzialania_implementation di=new Dzialania_implementation();
        di.tworzPlik();
        System.out.println("Utworzono");
        di.zapisz();
        System.out.println("Zapisano");
        di.czytaj();
        System.out.println("Wypisano");
    }
    
}
