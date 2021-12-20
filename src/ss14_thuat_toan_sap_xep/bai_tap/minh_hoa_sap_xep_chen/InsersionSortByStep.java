package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_sap_xep_chen;

import java.util.Scanner;

public class InsersionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size : ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println(" Enter " + list.length + " Index :");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("List Enter : ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println("Sort Start : ");
        insersionSort(list);

    }
    public static void insersionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int x = list[i];
            int index = i;
            while (index > 0 && x < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
                System.out.println(" Move Index : " + list[index]);
            }
            if (index!=i) {
                System.out.println(" Insert " + x +" at position " + index);
                list[index] = x;
            }
        }
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();
    }
}
