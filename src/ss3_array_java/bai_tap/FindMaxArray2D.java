package ss3_array_java.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FindMaxArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        // Khai báo biến
        int arr1 ;
        int arr2 ;
        // Sử dụng do-white cho người dùng nhập trước
        do {
            System.out.println("Enter size arr1 : ");
            arr1 = scanner.nextInt() ;
            System.out.println("Enter size arr2 : ");
            arr2 = scanner.nextInt() ;
        } while (arr1 < 10 && arr2 > 10) ;
        // Khai báo mảng hai chiều gán arr1 và 2 vào mảng
        int arr[][] = new int[arr1][arr2] ;
        // Dùng vòng lặp for để duyệt mảng và in ra vị trí của mảng
        for (int i = 0 ; i < arr1 ; i++) {
            for (int j = 0 ; j < arr2 ; j++){
                System.out.println("Enter index " + i + "-" + j );
                arr[i][j] = scanner.nextInt() ;
            }
        }
        // In ra phần tử nhập vào
        for (int i = 0 ; i < arr1 ; i++) {
            for (int j = 0 ; j < arr2 ; j++) {
                // System.out.println(arr[i][j] + "\t");
            }
            // System.out.println("\n");
        }
        // Khai báo biến max để trả về giá trị lớn nhất trong mảng
        int max = arr[0][0] ;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length;j++){
                if (max < arr[i][j]) {
                    max = arr[i][j] ;
                }
            }
        }
        System.out.println("Max array 2D : " + max);



    }
}
