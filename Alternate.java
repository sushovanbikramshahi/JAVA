import java.util.*;
class Word
{
    private String str;
    public void getWord(String str)
    {
        this.str=str;

    }
    
    public void displayResults()
    {
        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
        char c =str.charAt(i);
        if((i%2)==0)
        {
            result.append(Character.toUpperCase(c));

        }
        else
        {
            result.append(c=Character.toLowerCase(c));

        }
        
    }
    System.out.println("the output is:" +result);

    }

}

 public class Alternate
 {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String str=sc.nextLine();
        Word l=new Word();
        l.getWord(str);
        l.displayResults();
    }
}
