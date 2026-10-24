package Kadai4;

import java.util.Scanner;

public class Kadai4 {

    public static void main(String[] args) {

        // キーボード入力を受け取る準備
        Scanner scanner = new Scanner(System.in);

        // 生成する数字の個数を入力してもらう
        System.out.print("数字の個数を入力してください：");
        int count = scanner.nextInt();

        // 0以下の場合はメッセージを表示
        if (count <= 0) {
            System.out.println("1以上の整数を入力してください。");
        } else {

            // ランダムな数字を生成する
            int[] numbers = createRandomNumbers(count);

            // 生成された数字を表示する
            System.out.print("生成された数字は、");
            printNumbers(numbers);

            // 数字を大きい順に並べ替える
            sortDescending(numbers);

            // 並べ替えた数字を表示する
            System.out.print("大きい順に並べると、");
            printNumbers(numbers);
        }

        // Scannerを閉じる
        scanner.close();
    }

    // 指定された個数のランダムな数字を生成するメソッド
    public static int[] createRandomNumbers(int count) {

        // 数字を保存する配列を作成
        int[] numbers = new int[count];

        // 1から30までの数字を生成して配列に保存
        for (int i = 0; i < count; i++) {
            numbers[i] = (int) (Math.random() * 30) + 1;
        }

        // 生成した配列を返す
        return numbers;
    }

    // バブルソートで大きい順に並べ替えるメソッド
    public static void sortDescending(int[] numbers) {

        // 配列全体を繰り返し確認する
        for (int i = 0; i < numbers.length - 1; i++) {

            // 隣り合う数字を比較する
            for (int j = 0; j < numbers.length - 1 - i; j++) {

                // 左側が右側より小さい場合は入れ替える
                if (numbers[j] < numbers[j + 1]) {

                    // 左側の数字を一時的に保存する
                    int temp = numbers[j];

                    // 右側の数字を左側に移動する
                    numbers[j] = numbers[j + 1];

                    // 保存していた数字を右側に移動する
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    // 配列の数字をカンマ区切りで表示するメソッド
    public static void printNumbers(int[] numbers) {

        // 配列の数字を先頭から順番に表示する
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            // 最後の数字以外には区切り文字を付ける
            if (i < numbers.length - 1) {
                System.out.print("、");
            }
        }

        // 表示が終わったら改行する
        System.out.println("です。");
    }
}

