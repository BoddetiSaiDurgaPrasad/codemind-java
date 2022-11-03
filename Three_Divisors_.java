import java.util.*;
class div{
    public static boolean fac(int n){
        if(n==1)return false;
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        return cnt==2;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=f;i++){
            if((i*i)<=f){
                if(fac(i*i)){
                    cnt++;
                }
            }
            else{
                break;
            }
        }
        System.out.println(cnt);
    }
}