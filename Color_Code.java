import java.util.Scanner;
class color
{
    public static void main(String args[])
    {
        char v;
        Scanner sc=new Scanner(System.in);
        v=sc.nextLine().charAt(0);
        if(v=='V' || v=='v')
        {
            System.out.println("Violet");
        }
        else if(v=='I'|| v=='i')
        {
            System.out.println("Indigo");
        }
        else if(v=='B' || v=='b')
        {
            System.out.println("Blue");
        }
        else if(v=='G' || v=='g')
        {
            System.out.println("Green");
        }
        else if(v=='Y' || v=='y')       
        {
            System.out.println("Yellow");
        }
        else if(v=='O' || v=='o')
        {
            System.out.println("Orange");
        }
        else if(v=='R' || v=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println(-1);
        }
        sc.close();
    }
}