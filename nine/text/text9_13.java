package text;

import java.util.Scanner;
//Location
public class text9_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number od rows and columns in array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter the array:");
        double[][] num = new double[10010][10010];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                num[i][j] = input.nextDouble();
            }
        }
        Location ans = new Location();
        ans = lacateLargest(num, row, column);
        System.out.println("The location od the largest element is " + ans.maxValue + " at (" + ans.row + ", " + ans.column + ")");
    }

    public static Location lacateLargest(double[][] a, int n, int m) {
        Location temp = new Location();
        double maxx = -0x3f3f3f3f;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maxx < a[i][j]) {
                    maxx = a[i][j];
                    temp.row = i + 1;
                    temp.column = j + 1;
                }
            }
        }
        temp.maxValue = maxx;
        return temp;
    }
}
