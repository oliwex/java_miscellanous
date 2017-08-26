
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Lista
{
    public static ArrayList<Integer> lista=new ArrayList<Integer>();
    public volatile static boolean running_flag=true;
    
    public static void changeFlag()
    {
        Lista.running_flag=false;
    }
}