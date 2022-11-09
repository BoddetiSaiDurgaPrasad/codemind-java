import java.util.*;
class psa
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a=sc.nextInt();
        int c=0,c1=0;
        for(int i=1;i<=s/2;i++){
            if(s%i==0){
                c+=i;
            }
        }
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                c1+=i;
            }
        }
        if(c==a && c1==s)
        {
            System.out.println("Amicable");
        }
        else
        {
        System.out.println("Not Amicable");
        }
    }
}
