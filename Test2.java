package homework;

import java.util.Scanner;

public class Test2 {
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Fibonacci数列：");
        int number=in.nextInt();
        int i=0,j=1;
        while(j<=number){
            System.out.print(""+i+""+j);
            i=i+j;
            j=i+j;
        }
    }
}
