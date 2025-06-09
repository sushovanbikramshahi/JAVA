import sun.jvm.hotspot.oops.java_lang_Class;
import java.util.*;
class Armstrong
{
    private int num;
    public void setNum(int num)
    {
        this.num=num;
    }

    public void checkArmstrong()
    {
        double sum=0;
        int temp=num;
        int count=String.valueOf(num).length();
        
       
        while(temp!=0)
        {
        
            int ext=temp%10;
            sum=sum+Math.pow(ext,count);
            
            temp=temp/10;

        }

        if(num==sum)
        {
            System.out.println(" the number is Armstrong");
        }
        else
        {
            System.out.println(" the number isnot Armstrong");
        }
        



    }
}


public class Armstrongchecker
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        Armstrong a=new Armstrong();
        a.setNum(num);
        a.checkArmstrong();
        
        

    }
}