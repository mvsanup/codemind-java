import java.util.*;
class abs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int e=(int)(Math.log10(d));
        int f=sc.nextInt();
        int g=d%((int)(Math.pow(10,f)));
        int h=d/((int)(Math.pow(10,e-f+1)));
        System.out.print(Math.abs(g-h));
    }
}