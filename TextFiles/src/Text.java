/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Minio
 */
public class Text extends Thread
{
    private String textPath;
    Text(String path)
    {
        this.textPath=path;
    }
    public void run()
    {
        try {
            this.readFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void readFromFile() throws FileNotFoundException
    {
        
        File filename=new File(this.textPath);
        Scanner sc=new Scanner(filename);
        
        
        while (sc.hasNextLine())
        {
            String line=sc.nextLine();
            System.out.println(line);   
        }
        sc.close();
    }
}
