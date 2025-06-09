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
        
       
        while(num!=0)
        {
            int ext=num%10;
            sum=sum+Math.pow(ext,ext);
            
            num=num/10;

        }

        if(temp==sum)
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
        a.checkArmstrong();
        
        

    }
}