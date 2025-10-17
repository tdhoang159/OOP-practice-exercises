package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */

/**
Viết chương trình sinh ngẫu nhiên một số nguyên dương trong khoảng từ 1 đến
100, cho phép người dùng nhập vào số dự đoán số ngẫu nhiêu vừa được sinh ra, nếu số
nhập vào lớn hơn ha nhỏ hơn thì hiện câu thông báo tương ứng “Số bạn đoán lớn hơn”,
“Số bạn đoán nhỏ hơn”, quá trình này lặp lại cho đến khi người dùng đoán đúng số vừa
đã phát sinh ngẫu nhiên ra thì hiện thông báo “Bạn đã đoán đúng”.
Ví dụ: Số ngẫu nhiên sinh ra 55
- Số bạn đoán: 45 -> Số bạn đoán nhỏ hơn
- Số bạn đoán: 57 -> Số bạn đoán lớn hơn
- Số bạn đoán: 55 -> Bạn đã đoán đúng
Gợi ý: sử dụng phương thức Math.random() để sinh ngẫu nhiên số. 
 */
public class BTTH01_Bai1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = (int) (Math.random() * 100);
            int soDoan;
            do {
                System.out.println("Nhap so ban doan: ");
                soDoan = sc.nextInt();
                if (soDoan > n) {
                    System.out.println("So ban doan lon hon| Vui long doan so nho hon!");
                } else if (soDoan < n) {
                    System.out.println("So ban doan nho hon| Vui long doan so lon hon!");
                } else {
                    System.out.println("Ban doan dung roi! ");
                }
            } while (soDoan != n);
        }
    }
}
