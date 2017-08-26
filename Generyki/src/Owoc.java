/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class Owoc
{
    private String nazwa;
    private String pochodzenie;
    private int wiek;
    Owoc(String nazwa, String pochodzenie, int wiek)
    {
        this.nazwa=nazwa;
        this.pochodzenie=pochodzenie;
        this.wiek=wiek;
    }
    public void pisz()
    {
        System.out.println("Nazwa: "+this.nazwa);
        System.out.println("Pochodzenie: "+this.pochodzenie);
        System.out.println("Wiek: "+this.wiek);
    }

}
