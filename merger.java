package HOMEWORK;

public class merger {
    public static void sort(int a[], int left, int right) {
        int t = 1;
        int size = right - left + 1;
        while (t < size) {
            int s = t;
            t = 2 * s;
            int i = left;
            while (i + (t - 1) < size) {
                fun(a, i, i + (s - 1), i + (t - 1));
                i += t;
            }
            if (i + (s - 1) < right)
                fun(a, i, i + (s - 1), right);
        }
    }

    private static void fun(int c[], int p, int q, int r) {
        int B[] = new int[c.length];
        int s = p;
        int t = q + 1;
        int k = p;
        while (s <= q && t <= r) {
            if (c[s] <= c[t]) {
                B[k] = c[s];
                s++;
            } else {
                B[k] = c[t];
                t++;
            }
            k++;
        }
        if (s == q + 1) B[k++] = c[t++];
        else B[k++] = c[s++];
        for (int i = p; i <= r; i++)
            c[i] = B[i];
    }


    public static void main(String args[]) {
        int b[] = new int[]{48, 5, 89, 80, 81, 23, 45, 16, 2};
        sort(b, 0, 8);
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + ",");
    }
}
