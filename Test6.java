package HOMEWORK;

import java.util.Random;

public class Test6  {
    public static void main(String[] args){
        int a[] = new int[20];
        Random random = new Random();
        for (int i=0; i < 20; i++) {
            a[i] = random.nextInt(382) + 77;
        }
        for(int i=0;i<20;i++){
            System.out.println(a[i]);
        }
        int min = a[0], max = a[0], b = 0;
        double average = 0;
        for (int i = 0; i < 20; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
            b += a[i];
        }
        average = (double) b/20;
        System.out.println("最小值："+min+"  最大值：" + max + " 平均值：" + average + " 总和：" + b);
    }
}

