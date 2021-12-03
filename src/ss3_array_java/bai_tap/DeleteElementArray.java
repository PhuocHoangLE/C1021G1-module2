package ss3_array_java.bai_tap;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int[] delete ;
        int n = 0 ;
        do {
            System.out.println("Enter size array : ");
            n = scanner.nextInt();
        } while (n < 0) ;
        // Hiển ra các phần tử trong mảng
        delete = new int[n] ;
        for ( int i = 0 ; i < delete.length ; i++ ){
            System.out.println("Enter element : " + (i + 1) );
            delete[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < delete.length ; i++){
            System.out.println(delete[i]);
        }
        //  1. Cho người dùng nhập vào phần tử muốn xoá
        //  2. Dùng vòng for duyệt phần tử muốn xoá
        System.out.println("Enter number delete : ");
        int find = scanner.nextInt() ;
        for ( int i = 0 ; i < delete.length ; i++ ){
            if ( find == delete[i]){
                for ( int j = i ; j < delete.length - 1 ; j++){
                    delete[j] = delete[j + 1] ;
                }
                delete[delete.length - 1] = 0 ;
            }
        }
        // Dùng để in ra phần tử còn lại sau khi xoá
        System.out.println("Element remain :");
        for ( int i = 0 ; i < delete.length ; i++){
            System.out.println(delete[i]);
        }

    }
}
