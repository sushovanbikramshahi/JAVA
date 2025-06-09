import java.util.*;
class Letter
{
    private String str;
    public void getStr(String str)
    {
        this.str=str;
    }
    public void displayResult()
    {
        int digits=0;
        int vowel=0;
        int consonents=0;
        int whitespace=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c))
            {
                digits++;
            }
            else if(Character.isSpaceChar(c))
            {
                whitespace++;
            }
            else if(Character.isLetter(c))
            {


                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                    vowel++;
                }
                else{
                    consonents++;
                }
            }

        }
        System.out.println("the number of words are:"+(whitespace+1));
        System.out.println("the number of digits are:"+(digits));
        System.out.println("the number of space are:"+(whitespace));
        System.out.println("the number of vowels are:"+(vowel));
        System.out.println("the number of consonents are:"+(consonents));
        
    }
}

public class Count
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String str=sc.nextLine();
        Letter l=new Letter();
        l.getStr(str);
        l.displayResult();
    }
}