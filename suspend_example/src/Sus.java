//Thread Example Program for suspend()
/**
* @author   candidjava.com
* @description: This method is used for to suspend the current thread.
*/

public class Sus
{
    public static void main(String args[])
    {
        Sleep s1=new Sleep();
        s1.start();
        s1.suspend();//its suspends the current thread.
        for(int j=0;j<=2;j++)
        {
            System.out.println("new");
        }
        s1.resume();//its resume the suspended thread.
    }
}