package ss2_loop_to_java.bai_tap;

import java.util.Scanner;

public class PrimeNumberMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scanner.nextInt();

        System.out.println("Các số nguyên tố nhỏ hơn " +n+ " là :");

        for( int i = 1 ; i < n ; i++){
            int dem = 0 ;
            for ( int j = 1 ; j <= i ; j++){
                if ( i % j == 0 ) {
                    dem++ ;
                }
            }
            if (dem == 2) {
                System.out.print(" "+ i);
            }
        }
    }
}
