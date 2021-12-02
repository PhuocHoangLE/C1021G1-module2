package ss2_loop_to_java.bai_tap;

import java.util.Scanner;

public class PrintPicture {
    public static void main(String[] args) {
       int height ;
       int width ;
       Scanner sc = new Scanner(System.in) ;

        System.out.print("Nhập vào Height : ");
        height = sc.nextInt();

        System.out.print("Nhập vào Width : ");
        width = sc.nextInt() ;
        for ( int i = 2 ; i < height ; i++){
            for ( int j = 0 ; j < width ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        for ( int i = 1 ; i <= height ; i++){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        for ( int i = height ; i >= 1 ; i--){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
