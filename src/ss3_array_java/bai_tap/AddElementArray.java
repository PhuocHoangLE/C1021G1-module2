package ss3_array_java.bai_tap;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int[] array ;
        int n ;

        do {
            System.out.println("Enter size array  :");
            n = scanner.nextInt();
        } while (n > 10);
        // Gán n vào mảng cho người dùng nhập vào
        array = new int[n] ;
        // Dùng vòng lặp hiển thị các mảng đã nhập
        for ( int i = 0 ; i < array.length ; i++){
            System.out.println("Enter element :" + (i+1) );
            array[i] = scanner.nextInt() ;
        }
        // Cho người dùng nhập và số và nơi muốn chèn
        System.out.println("Enter number add : ");
        int add = scanner.nextInt() ;
        System.out.println("Enter index add");
        int index = scanner.nextInt();

        // Sử dụng hàm Arrays.copyOf
        array = Arrays.copyOf(array,n+1) ;

        for ( int i = n - 1 ; i >= index ; i--){
            array[i+1] = array[i] ;
        }
        array[index] = add ;
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }

    }
}
