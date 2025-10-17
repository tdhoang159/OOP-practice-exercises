package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */

/*
Cho phép người dùng nhập vào một chuỗi và in số lượng ký tự hoa có trong chuỗi
Ví dụ: chuỗi nhập: Hello World ® số ký tự hoa: 2
Gợi ý: tìm hiểu các phương thức lớp Character.
*/
public class BTTH01_Bai3b {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Nhap vao 1 chuoi: ");
            String s = sc.nextLine();
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(Character.isUpperCase(s.charAt(i)) == true){
                    ++count;
                }
            }
            System.out.printf("So luong ki tu in hoa la: %d", count);
        }
    }
}
