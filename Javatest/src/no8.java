
import java.util.Random;
import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("数字あて");
        System.out.println("0~99の数字を入れてください");

        // 文字列を整数に変換
        int number = 0;
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        while (number != randomNumber) {
            String numberStr = scanner.next();


            try {
                number = Integer.parseInt(numberStr); // 文字列を整数に変換
            } catch (NumberFormatException e) {
                System.out.println("⚠ 数字を入力してください！");
                continue;
            }

            if (number < 0 || number > 99) {
                System.out.println("⚠ 0〜99の範囲で入力してください！");
                continue;
            }

            if (number < randomNumber) {
                System.out.println("小さすぎます");

            } else if (number > randomNumber) {
                System.out.println("大きすぎます");
            } 
            System.out.println("もう一度数字を入れてください");
        }

        System.out.println("あたりです:" + randomNumber);

        // 一時的に格納するリスト
        scanner.close(); // Scanner を閉じる

    }
}
