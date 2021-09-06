package homework;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        for (; 0 != a % b; ) {
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println("a和b的最大公因数为" + b);
    }
}
