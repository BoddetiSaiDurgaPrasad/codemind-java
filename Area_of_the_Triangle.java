import java.util.*;
//import java.Math;
class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double s=(double)(a+b+c)/2;
        double d=(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.printf("%.2f",d);
    }
}