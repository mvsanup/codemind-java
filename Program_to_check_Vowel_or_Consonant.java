import java.util.Scanner;
class check
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}    
        