import java.util.*;
class Letter
{
    private StringBuilder str;
    public void getStr(StringBuilder str)
    {
        this.str= str;
    }
    public void removevowel()
    {
        
        
        for(int i=0;i<str.length();i++)
        {
             char c=str.charAt(i);
            


                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                   str.deleteCharAt(i);
                   i--;
                }
               
            

        }
        System.out.println ("the word becomes:" + str);
    }
}

public class Remove
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        StringBuilder str=sc.nextLine();
        Letter l=new Letter();
        l.getStr(str);
        l.removevowel();
    }
}