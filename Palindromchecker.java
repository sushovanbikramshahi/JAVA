import java.util.*;
class Palindrom
{
    private int num;
    public void setNum(int num)
    {
        this.num=num;
    }

    public boolean checkPalindrom()
    {
        int rev=0;
        int temp=num;
        
       
        while(num!=0)
        {
            int ext=num%10;
            rev=rev*10+ext;
            
            num=num/10;

        }

        if(rev==temp)
        {
            return (true);
        }
        else
        {
            return (false);
        }
        



    }
}


public class Palindromchecker
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        Palindrom c=new Palindrom();
        boolean res=c.checkPalindrom();
        if (res==true)
        {
            System.out.println(" the number is palindrom");
        }
        else if(res==false)
        {
            System.out.println("the number isnot palindrom");
        }

        

    }
}