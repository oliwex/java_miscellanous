/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minio
 */
public class quadric_function_class 
{
    private int a;
    private int b;
    private int c;
    private double delta;
    private double zero_place1;
    private double zero_place2;
    
    quadric_function_class(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private double count_delta(int a, int b, int c)
    {
        this.delta=(Math.pow(this.b,2)-4*(this.a*this.c));
        return this.delta;
    }
    public void count_cero_place()
    {
        quadric_function_class qfc=new quadric_function_class(this.a,this.b,this.c);
        this.delta=qfc.count_delta(this.a,this.b,this.c); //check delta
        if (delta > 0)
        {
            this.zero_place1=((-this.b)-Math.sqrt(delta))/(2*this.a);
            this.zero_place2=((-this.b)-Math.sqrt(delta))/(2*this.a);
            System.out.println("Miejsca zerowe to: "+this.zero_place1+" "+this.zero_place2);
        }
        else
        {
            if (delta == 0)
            {
                this.zero_place1=(-this.b)/(2*this.a);
                System.out.println("Miejsca zerowe to: "+this.zero_place1);
            }
            else
            {
                System.out.println("Brak miejsc zerowych");
            }
        }
    }
}
