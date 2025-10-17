package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */
/*
Cho phép người dùng nhập vào địa chỉ email, xuất ra màn hình phần tên địa chỉ đó
Ví dụ: chuỗi nhập: thanh.dh@ou.edu.vn ® xuất ra màn hình: thanh.dh
*/
public class BTTH01_Bai3a {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Nhap email: ");
            String email = sc.nextLine();
            email = email.substring(0, email.indexOf("@"));
            System.out.println(email);
        }
    }
}
