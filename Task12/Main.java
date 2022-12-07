package Task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int x = 0;
        int y = 0;
        int arr[][] = new int[n][m];
        int max = arr[0][0];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}

