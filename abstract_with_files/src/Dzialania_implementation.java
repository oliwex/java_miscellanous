
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class Dzialania_implementation extends Dzialania
{
    private String plik_nazwa="plik.txt";
    private File plik=new File(this.plik_nazwa);
    
    @Override
    public void zapisz() 
    {
        PrintWriter zapis=null;
        try {
            zapis = new PrintWriter(this.plik_nazwa);
            zapis.println("Ala ma kota");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dzialania_implementation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            zapis.close();
        }
    }

    @Override
    public void czytaj() 
    {
        try {
            Scanner in=new Scanner(this.plik);
            
            String zdanie=in.nextLine();
            System.out.println(zdanie);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dzialania_implementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void tworzPlik()
    {
        try
        {
            if (this.plik.createNewFile())
            {
                System.out.println("Sukces");
            }
            else
            {
                System.out.println("Błąd, plik już istnieje");
            }
        }
        catch(IOException err)
        {
            err.printStackTrace();
        }
    }
}


