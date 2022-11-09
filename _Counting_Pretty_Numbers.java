import java.util.*;
class psa
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int j=0;j<s;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int i=a;i<=b;i++)
            {
                if(i%10==2 || i%10==3 || i%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
