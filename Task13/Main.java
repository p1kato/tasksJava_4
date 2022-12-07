package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(arr[i][j] % 2 != 0) {
                    System.out.print("0" + " ");
                }else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

