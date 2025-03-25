
// import java.util.ArrayList;

// import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("数字を入れてください");
        String numberStr = scanner.next();
        // 文字列を整数に変換
        int number = Integer.parseInt(numberStr);

        Random rand = new Random();
        int randomNumber = rand.nextInt(number);

        for (int i = 0; i < number; i++) {
            System.out.println("生成された乱数です:" + randomNumber);

        }

        // 一時的に格納するリスト
        scanner.close(); // Scanner を閉じる

    }
}
