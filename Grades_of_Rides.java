import java.util.*;
class grades
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int f=sc.nextInt();
        int g=sc.nextInt();
        if(e>50 && f>60 && g>100)
            System.out.print(10);
        else if(e>50 && f>60)
            System.out.print(9);
        else if(f>60 && g>100)
            System.out.print(8);
        else if(e>50 && g>100)
            System.out.print(7);
        else if(e>50 || f>60 || g>100)
            System.out.print(6);
        else
            System.out.print(5);
    }
}