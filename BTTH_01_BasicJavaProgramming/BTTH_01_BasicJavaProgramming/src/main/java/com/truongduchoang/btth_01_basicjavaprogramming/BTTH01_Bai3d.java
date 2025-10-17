package com.truongduchoang.btth_01_basicjavaprogramming;

import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */

/*
Đếm số từ trong xâu (giả sử các từ cách nhau bằng các khoảng trống, dấu phẩy hoặc
dấu chấm phẩy) và tìm từ dài nhất trong chuỗi.
*/
public class BTTH01_Bai3d {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
//            System.out.println("Nhap chuoi: ");
//            String s = sc.nextLine();
            String s = "     JaVa   ,;;,;,   iS ,;  ;,  sIMplE, ;;,,  TruongDucHoang";
            String[] words = s.trim().split("[,;\\s]+");
   
            System.out.printf("So tu trong chuoi la: %d\n", words.length);
            
            String longestWord = words[0];
            for(String word : words){
                if(word.length() > longestWord.length()){
                    longestWord = word;
                }
            }
            System.out.printf("Tu dai nhat trong chuoi la: %s", longestWord);
        }
    }
}
