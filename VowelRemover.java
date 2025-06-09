
import java.util.*;
class Demo
{
    private String nam;
    public Demo(String nam)
    {
        this.nam=nam;
    }
    public void Remove()
    {
        String res="";
        for(int i=0;i<nam.length();i++)
        {
            char c=nam.charAt(i);
            if(c!='a'&& c!='e'&& c!='i'&& c!='o'&& c!='u'&& c!='A'&& c!='E'&& c!='I'&& c!='O'&& c!='U')
                {
                    res=res+c;

                   
                }


        }
        System.out.println("the removed string is:"+res);

    }
}
public class VowelRemover {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String nam=sc.nextLine();
        Demo d=new Demo(nam);
        d.Remove();
    }
    

}
