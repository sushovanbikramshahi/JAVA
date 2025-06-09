import java.util.*;
class Arithmetic
{
    private double n1,n2;
    private double sum,diff,mul,div;

    public void setnumber(double n1,double n2)
    {
        this.n1=n1;
        this.n2=n2;
    }

    public void displayresult()
    {
        System.out.println("sum="+(n1+n2));
        System.out.println("diff="+(n1-n2));
        System.out.println("mul="+(n1*n2));
        System.out.println("div="+(n1/n2));
    }
}

public class Demo{

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        Arithmetic a=new Arithmetic();
        a.setnumber(n1,n2);
        a.displayresult();
    }
}