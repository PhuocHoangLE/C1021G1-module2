package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int size1 ;
        int size2 ;
        do {
            System.out.println("Enter a size 1 : ");
            size1 = scanner.nextInt() ;
            System.out.println("Enter a size 2 : ");
            size2 = scanner.nextInt() ;
        } while (size1 > 10 || size2 > 10) ;
            int array[][] = new int[size1][size2] ;
            for (int i = 0 ; i < size1 ; i++){
                for (int j = 0 ; j < size2 ; j++){
                    System.out.println("Enter index " + i + "-" + j);
                    array[i][j] = scanner.nextInt();
                }
            }
            // Dùng để in ra các phần tử vừa nhập
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Enter rows caculated :");
        int rows = scanner.nextInt() ;
        double sum = 0 ;
        for (int i = 0 ; i < size1 ; i++){
            sum += array[i][rows] ;
        }
        System.out.println("Total in rows " + rows + " là : " +sum);
        }
    }
