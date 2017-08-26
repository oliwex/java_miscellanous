/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class class_serialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Serialize serial=new Serialize("plik.bin");
        serial.createFile();
        System.out.println("Plik utworzono");
        serial.write();
        System.out.println("Zapisano dane");
        serial.read();
    }
    
}
