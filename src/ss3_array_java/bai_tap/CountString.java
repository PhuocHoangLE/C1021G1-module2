package ss3_array_java.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi ");
        String chuoi1 = scanner.nextLine();
        char kiTu;
        System.out.println("nhập kí tự cần đếm");
        kiTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chuoi1.length(); i++) {
            if (chuoi1.charAt(i) == kiTu) {
                count++;
            }
        }
        System.out.println(count);

    }
}
