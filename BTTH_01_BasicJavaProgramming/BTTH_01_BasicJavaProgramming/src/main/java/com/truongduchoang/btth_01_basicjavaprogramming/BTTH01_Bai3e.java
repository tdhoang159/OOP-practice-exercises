package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */

/*
Chuẩn hóa chuỗi như sau: xóa khoảng trắng hai đầu, giữa hai từ có nhiều khoảng
trắng thì xóa hết chỉ giữ lại một khoảng trắng, ký tự đầu của mỗi từ đều viết hoa và
các ký tự khác của từ viết thường.
 */
public class BTTH01_Bai3e {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
//            System.out.println("Nhap chuoi: ");
//            String s = sc.nextLine();
            String s = "     JaVa   ,;;,;,   iS ,;  ;,  sIMplE,,, ; ,,   tRUonG dUC HoANg    ";
            String[] words = s.trim().split("[,;\\s]+");
            StringBuilder str = new StringBuilder();
            for(String word : words){
                str.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
            }
            
            String result = str.toString().trim();
            System.out.printf("Chuoi sau khi chuan hoa: %s", result);
        }
    }
}
