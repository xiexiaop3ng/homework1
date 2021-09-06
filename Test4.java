package homework;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        System.out.println("输入一个字符数组：");
        String str=in.nextLine();
        for(int i=65;i<123;i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(i==str.charAt(j)){
                    count++;
                }
            }
            if(count!=0){
                System.out.println((char)i+":"+count);
            }
        }
    }
}
