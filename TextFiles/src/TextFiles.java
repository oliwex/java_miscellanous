/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class TextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String penis="penis.txt";
        Text text=new Text(penis);
        Thread thread=new Thread(text);
        thread.start();
        
    }
    
}
