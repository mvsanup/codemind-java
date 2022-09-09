import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=32+(c*1.8);
        System.out.format("%.2f",f);
        sc.close();
    }
}