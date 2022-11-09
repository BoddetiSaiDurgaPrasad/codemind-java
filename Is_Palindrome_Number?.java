import java.util.*;
class psa
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int temp=s,a=0;
        while(s!=0)
        {
            int r=s%10;
            a=(a*10)+r;
            s=s/10;
        }
        if(a==temp)
        {
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
}
