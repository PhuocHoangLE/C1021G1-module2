package ss4_class_and_object_java.bai_tap.bai_1_phuong_trinh_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Enter a :");
        int a = scanner.nextInt();
        System.out.println(" Enter b : ");
        int b = scanner.nextInt();
        System.out.println(" Enter c : ");
        int c = scanner.nextInt();

        BuildQuadraticEquation2 ptbh = new BuildQuadraticEquation2(a,b,c) ;
        ptbh.check();
    }
}
