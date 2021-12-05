package ss3_array_java.thuc_hanh;

import java.util.Scanner;

public class PassStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int enter ;
        int[] array ;
        do {
            System.out.println("Enter a size : ");
            enter = scanner.nextInt() ;
            if (enter > 30)
                System.out.println("Size should not exceed 30");
        } while (enter > 30) ;

        array = new int[enter] ;
        int i = 0 ;
        while (i < array.length){
            System.out.println("Enter a mark for student " + (i + 1) + " : ");
            array[i] = scanner.nextInt() ;
            i++ ;
        }
        int count = 0 ;
        System.out.println("List of mark : ");
        for (int j = 0 ; j < array.length;j++){
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++ ;
        }
        System.out.println("\n The number of students passing the exam is " + count);


        }
    }
