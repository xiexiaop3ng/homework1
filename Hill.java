package HOMEWORK;

public class Hill {
    public static void sort(int a[]) {
        int n = a.length;
        while (n != 0) {
            n = n / 2;
            for (int i = 0; i < n; i++) {
                for (int j = n; j < a.length; j += n) {
                    int k = j - n;
                    int temp = a[j];
                    for (; k >= 0 && temp < a[k]; k -= n) {
                        a[k + n] = a[k];
                    }
                    a[k + n] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
    int b[]=new int[] {48,5,89,80,81,23,45,16,2};
    sort(b);
    for(int i=0;i<b.length;i++)
        System.out.print(b[i]+",");
    }
}
