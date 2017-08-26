
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Person implements Serializable
{
    private String name;
    private String surname;
    private int wiek;
    
    Person(String name,String surname,int wiek)
    {
        this.name=name;
        this.surname=surname;
        this.wiek=wiek;
    }
    
    public String showData()
    {
        return this.name+" "+this.surname+" "+this.wiek;
    }
}
