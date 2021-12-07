package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter size :");
            n = scanner.nextInt();
        } while (n > 10);
        int arrays[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" Enter index " + i + " - " + j);
                arrays[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i][i];
        }
        System.out.println(" Tổng đường chéo ma trận vuông là :" + sum);
    }
}
