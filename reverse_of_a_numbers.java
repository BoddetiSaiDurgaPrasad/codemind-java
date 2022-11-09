import java.util.*;
class psa
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a=0;
        while(s!=0)
        {
            a=(a*10)+(s%10);
            s=s/10;
        }
        System.out.println(a);
    }
}
