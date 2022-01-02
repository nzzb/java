package text;

import java.util.Scanner;

public class text11_19 {
    public static void main(String[] args) {
        int[] w = new int[1010];
        int[] vis = new int[1010];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = input.nextInt();
        System.out.print("Enter the weoghts of objects: ");
        for (int i = 1; i <= n; i++) {
            w[i] = input.nextInt();
        }
        int tot = 0;
        int pos = 1;
        while (tot < n) {
            int last = 0;
            System.out.print("Container " + pos + " contains objects with weight");
            for (int i = 1; i <= n; i++) {
                if (last + w[i] <= 10 && vis[i] == 0) {
                    System.out.print(" " + w[i]);
                    vis[i] = 1;
                    last += w[i];
                    tot++;
                }
            }
            System.out.println();
            pos++;
        }
    }
}
