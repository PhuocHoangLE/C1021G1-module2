package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter amount of money :");
        float usd =  sc.nextFloat() ;
        float vnd = usd / 23 ;
        System.out.print("The amount to be exchanged is : " + vnd);
    }
}
