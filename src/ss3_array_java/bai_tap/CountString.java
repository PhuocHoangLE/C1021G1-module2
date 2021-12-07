package ss3_array_java.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String :");
        String string = scanner.nextLine();
        char kiTu;
        System.out.println("Enter string want count");
        kiTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == kiTu) {
                count++;
            }
        }
        System.out.println("The number of occurrences : " + count);

    }
}
