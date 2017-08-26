
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Serialize 
{
    private String nazwa;
    private File plik;
    
    private Person person;
    
    Serialize(String nazwa)
    {
        this.nazwa=nazwa; //"plik.bin";
        this.plik=new File(this.nazwa);
        this.person=new Person("Minio","Oliwex",22);
    }
    public void write()
    {

        try(FileOutputStream fs= new FileOutputStream(this.nazwa)) 
        {
           
           ObjectOutputStream zapis = new ObjectOutputStream(fs);
           zapis.writeObject(this.person);
           zapis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    public void read()
    {

        try {
            FileInputStream fi = new FileInputStream(this.nazwa);
            ObjectInputStream czytaj=new ObjectInputStream(fi);
            Person person=(Person)czytaj.readObject();
            fi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(person);


    }
        
    
    public void createFile()
    {
        try {
            if (this.plik.createNewFile())
            {
                System.out.println("Sukces");
            }
            else
            {
                System.out.println("Plik nie został utworzony.");
            }
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
