package Kadai3;

import java.util.Scanner;

public class Kadai3 {

    public static void main(String[] args) {

        // 入力を受け取る準備
        Scanner scanner = new Scanner(System.in);

        // サイズを入力してもらう
        System.out.print("サイズを入力してください：");
        int size = scanner.nextInt();

        // 0以下の場合はメッセージを表示
        if (size <= 0) {
            System.out.println("1以上の整数を入力してください。");
        } else {

            // 行数を1からサイズまで繰り返す
            for (int i = 1; i <= size; i++) {

                // 行数に応じて空白を表示する
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }

                // 行数に応じて＊の数を減らす
                for (int j = 1; j <= size * 2 - 2 * i + 1; j++) {
                    System.out.print("＊");
                }

                // 行末で改行する
                System.out.println();
            }
        }

        // Scannerを閉じる
        scanner.close();
    }
}

