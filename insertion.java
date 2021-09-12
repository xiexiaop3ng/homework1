package HOMEWORK;

public class insertion {
    public static void sort(int a[]) {
        int temp = 0;
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
                else break;
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