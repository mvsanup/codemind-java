
import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    StringBuffer a=new StringBuffer("");
	    for (int i=0;i<s.length();i++)
	    {
	        a.append(Character.toLowerCase(s.charAt(i)));
	    }
	    System.out.print(a);
    }
}
