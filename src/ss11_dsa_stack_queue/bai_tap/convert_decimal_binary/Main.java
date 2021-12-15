package ss11_dsa_stack_queue.bai_tap.convert_decimal_binary;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>() ;
        Scanner scanner = new Scanner(System.in) ;
        String result = " " ;
        System.out.println("Enter the number of decimals to convert : ");
        int number = scanner.nextInt() ;

        while (number != 0){
            stack.push(number % 2) ;
            number /= 2 ;
        }
        while (!stack.empty()){
            result += stack.pop() ;
        }
        System.out.println("After converting to binary : " + result);
    }
}
