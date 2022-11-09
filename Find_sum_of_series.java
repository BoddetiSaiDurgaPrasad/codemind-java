import java.util.*;
class psa
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float c=0;
        for(int i=1;i<=a;i++){
            c+=(1/(i*0.1));
        }
        System.out.printf("%.2f",(c/10));
    }
}
