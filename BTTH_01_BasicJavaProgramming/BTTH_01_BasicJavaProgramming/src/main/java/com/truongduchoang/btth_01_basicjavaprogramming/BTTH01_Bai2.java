package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */

/**
Viết chương trình nhập vào số nguyên dương n là bậc của đa thức và n + 1 số 
nguyên ai (0 ≤ i ≤ n, ai là hệ số của xi) là hệ số của đa thức bậc n và giá trị nguyên x.
Yêu cầu tính giá trị biểu thức đó.
Ví dụ: n = 2, a = [2, 3, 1], x = 2 nghĩa ta cần tính giá trị đa thức bậc 2 f(x) = x2 + 3x + 2
tại x = 2 à f(2) = 4 + 6 + 2 = 12
 */

public class BTTH01_Bai2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap n: ");
            int n = sc.nextInt();
            System.out.println("Nhap x: ");
            double x = sc.nextDouble();
            double result = 0;
            for(int i = 0; i <= n; i++){
                System.out.printf("Nhap he so cua x^%d: ", i);
                int heSo = sc.nextInt();
                result += Math.pow(x, i)*heSo;
            }
            System.out.printf("Ket qua cua da thuc tren la %.2f", result);
        }
    }
}
