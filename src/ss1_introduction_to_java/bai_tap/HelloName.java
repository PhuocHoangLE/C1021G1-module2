package ss1_introduction_to_java.Bai_Tap;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Name :");
        String name = scanner.nextLine() ;
        System.out.println("Hello " + name);

    }
}
