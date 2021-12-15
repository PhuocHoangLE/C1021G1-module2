package ss11_dsa_stack_queue.bai_tap.reverse_array_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>() ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhập n số phần tử của mảng số nguyên: ");
        int n = scanner.nextInt() ;
        int[] arrays = new int[n] ;
        for ( int i = 0 ; i < arrays.length ; i++){
            arrays[i] = scanner.nextInt();
            stack.push(arrays[i]) ;
        }

        System.out.println("Dãy số của mảng : ");
        for (int i = 0 ; i < arrays.length ; i++ ){
            System.out.println(arrays[i]);
        }
        System.out.println("Đảo ngược các phần tử của mảng : ");
        for ( int i = 0 ; i < arrays.length ; i++){
            System.out.println(stack.pop());
        }
    }
}
