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
    
    public static void xuatMaTran2(int[][] a){
        for(var row : a){
            for(var x : row){
                System.out.printf("%d\t", x);
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
    
    public static void tinhTongDong2(int[][] a){
        for(int i = 0; i < a.length; i++){
            long tongDong = 0;
            for(int j = 0; j < a[i].length; j++){
                tongDong += a[i][j];
            }
            System.out.printf("Tong dong thu %d = %d\n", i, tongDong);
        }
    }
    
    public static void tinhTongMaxMinDong(int[][] a){
        for(int i = 0; i < a.length; i++){
            long tongDong = IntStream.of(a[i]).sum();
            System.out.printf("Tong dong thu %d = %d\n", i, tongDong);
            
            long max = IntStream.of(a[i]).max().getAsInt();
            System.out.printf("Max dong thu %d = %d\n", i, max);
            
            long min = IntStream.of(a[i]).min().getAsInt();
            System.out.printf("Min dong thu %d = %d\n", i, min);
            
        }
    }
    
    public static void tinhTongCot2(int[][] a){
        for(int j = 0; j < a[0].length; j++){
            long tongCot = 0;
            for(int i = 0; i < a.length; i++){
                tongCot += a[i][j];
            }
            System.out.printf("Tong cot thu %d = %d\n", j, tongCot);
        }
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
    
    public static void timMinMaxCot(int[][] a){
        for(int j = 0; j < a[0].length; j++){
            int max = a[0][0];
            int min = a[0][0];
            for(int i = 0; i < a.length; i++){
                if(a[i][j] >= max){
                    max = a[i][j];
                }
                if(a[i][j] <= min){
                    min = a[i][j];
                }
            }
            System.out.printf("Min cua cot %d = %d\nMax cua cot %d = %d\n", j, min, j, max);
        }
    }

    public static void main(String[] args) {
        int m = 3; 
        int n = 3;
        int[][] a = randomMaTran(m,n);
        xuatMaTran2(a);
//        System.out.println(a[0].length);
//        System.out.println(tinhTongCot(a, 0));
//        System.out.println(tinhTongDong(a, 0));
//        System.out.println(timGiaTriNhoNhatDong(a, 0));
//        System.out.println(timGiaTriLonNhatDong(a, 0));
//        System.out.println(timGiaTriLonNhatCot(a, 0));
//        System.out.println(timGiaTriNhoNhatCot(a, 0));
          tinhTongMaxMinDong(a);
          tinhTongCot2(a);
          timMinMaxCot(a);
    }
}
