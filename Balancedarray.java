
import java.util.*;

class Demo {
    
    private int[] num =new int[4];
    

    public void setdata()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
    }
    public int returnRes()
    {
        int flag=0;
        for(int i=0;i<num.length;i++)
        {
            if(i%2==0)
            {
                if(num[i]%2==0)
                {
                    flag=1;
                }
                
            }
            if(i%2!=0)
            {
                if(num[i]%2!=0)
                {
                    flag=1;
                }
            }

        }
        return(flag);



    }
}
public class Balancedarray
{

    public static void main(String[] args) {
        Demo d=new Demo();
        d.setdata();
        int res=d.returnRes();
        if (res==1)
        {
            System.out.println("the array is balanced");
        }
        else{
            System.out.println("the array isnot balanced");


        }
        
    }
    
    

}
