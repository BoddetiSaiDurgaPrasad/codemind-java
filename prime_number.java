import java.util.*;
class psa
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       if(a==0 || a==1)
       {
           System.out.println("not a prime");
       }
       else
       {
           boolean aa=true;
           for(int i=2;i*i<=a;i++)
           {
               if(a%i==0)
               {
                   aa=false;
                   break;
               }
           }
           if(aa)
           {
               System.out.println("prime");
           }
           else{
               System.out.println("not a prime");
           }
       }
    }
}
