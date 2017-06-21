/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minio;

/**
 *
 * @author Minio
 */
public class Me_class 
{
    private String name;
    private String surname;
    private int age;
    
    Me_class(String name, String surname, int age)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    private String getData()
    {
        return this.name+" "+this.surname+" "+this.age;
    }
    public String getAllData()
    {
        return this.getData();
    }
}
