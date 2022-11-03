import java.util.*;
class pal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n,s=0;
        while(n!=0){
            s=(s*10)+(n%10);
            n=n/10;
        }
        if(s==k){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}