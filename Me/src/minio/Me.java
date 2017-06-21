/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minio;
import java.util.Scanner;
/**
 *
 * @author Minio
 */
public class Me 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        String surname;
        int age;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        name=scan.next();
        System.out.println("Podaj nazwisko: ");
        surname=scan.next();
        System.out.println("Podaj wiek: ");
        age=scan.nextInt();
        
        Me_class ms = new Me_class(name,surname,age);
        System.out.println(ms.getAllData());
        
    }
    
}
