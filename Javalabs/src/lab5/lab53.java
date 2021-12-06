package lab5;

import java.util.Scanner;

public class lab53 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int a,s=0;
        a=k.nextInt();
        System.out.println(fun(a,s));
    }
    public static int fun(int a,int s){
        s=s+a%10;
        a=a/10;
        if(a!=0) return fun(a,s);
        else return s;
    }
}
