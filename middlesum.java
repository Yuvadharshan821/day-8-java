import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s += i;
            ns[i - 1] = s;
        }

        System.out.println(ns[n/2]);
    }
}
