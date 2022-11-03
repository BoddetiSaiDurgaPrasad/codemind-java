import java.util.*;
class hw{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        int cnt=0;
        int q=sc.nextInt();
        for(int i=0;i<n1;i++){
            if(a1[i]<=q && a2[i]>=q){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}