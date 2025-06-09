import java.util.*;
class Even
{
    private int num;
    public void setNum(int num)
    {
        this.num=num;
    }

    public double getSum()
    {
        double sum=0;
        
       
        while(num!=0)
        {
            int ext=num%10;
            if(ext%2==0)
            {
                sum=sum+Math.pow(ext,2);
            }
            num=num/10;

        }
        return(sum);
        



    }
}


public class Sumofevennum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        Even o=new Even();
        o.setNum(num);
        double res=o.getSum();
        System.out.println("result="+res);

        

    }
}