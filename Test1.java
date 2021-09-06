package homework;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入出生年份：");
        int born=in.nextInt();
        int death=born+100;
        int year=0;
        for(int i=born;i<=death;i++){
            if((i%400==0)||(i%4==0&&i%100!=0)) year++;
    }
        System.out.println("他能过"+year+"闰年");
    }
}
