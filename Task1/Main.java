package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int arr[][] =    {{12,5,7,6},
                        {4,0,2,7},
                        {9,1,3,2},
                        {10,-2,4,6}};
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= m; j++)
                if (n == i && m == j)
                    System.out.println(arr[i][j]);

    }
    }

