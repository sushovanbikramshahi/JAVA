import java.util.*;
class Demo
{
    private int len,bre;
    public Demo()
    {
        len=0;
        bre=0;
    }
    public Demo(int len,int bre)
    {
        this.len=len;
        this.bre=bre;
    }
    public void DisplayResult()
    {
        System.out.println("Area:"+(len*bre));
        System.out.println("perimeter:"+(2*(len+bre)));

    }
}
public class Rectangle
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the len and bre");
        int len=sc.nextInt();
        int bre=sc.nextInt();
        Demo d=new Demo(len,bre);
        d.DisplayResult();
        

        
    }
}