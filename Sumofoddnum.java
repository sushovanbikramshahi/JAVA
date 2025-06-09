import java.util.*;
class Odd
{
    private int num;
    public void setNum(int num)
    {
        this.num=num;
    }

    public int getSum()
    {
        int sum=0;
        
       
        while(num!=0)
        {
            int ext=num%10;
            if(ext%2!=0)
            {
                sum=sum+ext;
            }
            num=num/10;

        }
        return(sum);
        



    }
}


public class Sumofoddnum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        Odd o=new Odd();
        o.setNum(num);
        int res=o.getSum();
        System.out.println("result="+res);

        

    }
}