package ss3_array_java.bai_tap;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int enter ;
            do {
                System.out.println("Enter size :");
                enter = scanner.nextInt();
            } while (enter > 10) ;
            // Khai báo mảng mới và gán enter
            int[] array = new int[enter] ;

            for (int i = 0 ; i < array.length;i++) {
                System.out.println("Enter index : " + (i+1));
                array[i] = scanner.nextInt() ;
            }
            // Khai báo và tìm giá trị nhỏ nhất
            int min = array[0] ;
            for (int i = 0 ; i < array.length ; i++) {
                if ( min > array[i]) {
                    min = array[i];
                }
            }
        System.out.println("Min Array : " + min);




        }
    }

