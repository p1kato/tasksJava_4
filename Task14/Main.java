package Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int x = 0;
        int y = 0;
        int arr[][] = new int[n][m];

        int max_i = 0;
        int max_j = 0;
        int min_i = 0;
        int min_j = 0;


        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_i = i;
                    max_j = j;

                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                    min_i = i;
                    min_j = j;
                }
            }
        }
        arr[max_i][max_j] = min;
        arr[min_i][min_j] = max;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

