package HOMEWORK;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("输入数组：");
        int n=in.nextInt();
        int a[]=new int[n];
        int i,total=0;
        double average;
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
            total+=a[i];}
         average=(double)total/n;
        for(i=0;i<n;i++) {
            if (a[i] > average)
                System.out.println(a[i] );
        }
    }
}
