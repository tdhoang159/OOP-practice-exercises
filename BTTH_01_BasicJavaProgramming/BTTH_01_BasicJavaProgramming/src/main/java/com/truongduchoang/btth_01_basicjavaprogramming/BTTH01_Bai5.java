package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.stream.IntStream;

/**
 *
 * @author Truong Duc Hoang
 */
public class BTTH01_Bai5 {

    public static int[][] randomMaTran(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        return a;
    }

    public static void xuatMaTran(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static long tinhTongCot(int[][] a, int n){
        long sum = 0;
        for(int i = 0;i < a.length; i++){
            sum += a[i][n];
        }
        return sum;
    }
    
    public static long tinhTongDong(int[][] a, int m){
        int sum = IntStream.of(a[m]).sum();
        return sum;
    }
    
    public static long timGiaTriNhoNhatDong(int[][] a, int m){
        int min = IntStream.of(a[m]).min().getAsInt();
        return min;
    }
    
    public static int timGiaTriLonNhatCot(int[][] a, int n){
        int max = a[0][0];
        for(int i = 0; i < a.length; i++){
            if(a[i][n] > max){
                max = a[i][n];
            }
        }
        return max;
    }
    
    public static int timGiaTriNhoNhatCot(int[][] a, int n){
        int min = a[0][0];
        for(int i = 0; i < a.length; i++){
            if(a[i][n] < min){
                min = a[i][n];
            }
        }
        return min;
    }
    
    public static long timGiaTriLonNhatDong(int[][] a, int m){
        int max = IntStream.of(a[m]).max().getAsInt();
        return max;
    }
    

    public static void main(String[] args) {
        int m = 3; 
        int n = 3;
        int[][] a = randomMaTran(m,n);
        xuatMaTran(a, m, n);
        System.out.println(tinhTongCot(a, 0));
        System.out.println(tinhTongDong(a, 0));
        System.out.println(timGiaTriNhoNhatDong(a, 0));
        System.out.println(timGiaTriLonNhatDong(a, 0));
        System.out.println(timGiaTriLonNhatCot(a, 0));
        System.out.println(timGiaTriNhoNhatCot(a, 0));
    }
}
