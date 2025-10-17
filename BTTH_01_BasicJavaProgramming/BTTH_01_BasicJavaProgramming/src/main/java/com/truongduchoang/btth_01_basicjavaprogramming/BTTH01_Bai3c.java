package com.truongduchoang.btth_01_basicjavaprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Truong Duc Hoang
 */
public class BTTH01_Bai3c {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/main/resources/input.txt");
        File outputFile = new File("src/main/resources/output.txt");
        try (Scanner sc = new Scanner(inputFile); PrintWriter pw = new PrintWriter(outputFile)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine()).append("\n");
            }
            String s = sb.toString();
            s = s.replaceAll("\\{file\\}", "Tập tin");
            System.out.println(s);
            pw.print(s);
        }
    }
}
