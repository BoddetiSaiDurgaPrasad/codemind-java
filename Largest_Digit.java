import java.util.*;
class psa
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ans=0;
        while(s!=0)
        {
            if(s%10>ans){
                ans=s%10;
            }
            s=s/10;
        }
        System.out.println(ans);
    }
}
