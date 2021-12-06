package lab5;

import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        Fun(a,b);
    }
    public static int Fun(int a,int b){
        System.out.println(a);
    if(a<b) return Fun(a=a+1,b);
    else if(a>b) return Fun(a=a-1,b);
    else return a;
    }
}
