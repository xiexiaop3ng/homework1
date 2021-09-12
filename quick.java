package HOMEWORK;

public class quick {
    public static void sort(int a[],int left,int right){
        if(left<right) {
            int x =a[left];
            int temp = 0;
            int i = left, j = right;
            do {
                while ((a[i]) < x && i < right) {
                    i++;
                }
                while ((a[j]) > x && j > left) {
                    j--;
                }
             if (i<=j){
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                 i++;j--;
             }
            } while (i <= j);
        if(left<j) sort(a,left,j);
        if(right>i) sort(a,i,right);
        }
    }
    public static void main(String args[]){
    int b[]=new int[] {48,5,89,80,81,23,45,16,2};
    sort(b,0,8);
    for(int i=0;i<b.length;i++)
        System.out.print(b[i]+",");}
}
