import java.util.*;
public class Mm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double s=(a+b+c)/2;
        double aa=Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        System.out.printf("%.2f",aa);
    }
}