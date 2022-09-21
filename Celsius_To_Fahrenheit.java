import java.util.*;
class fahrenheit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        double f;
        f=(double)(c*1.8)+32;
        System.out.format("%.2f",f);
    }
}