import java.util.Random;
import java.util.Scanner;

public class no1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("数字を入れてください");
        String numberStr = scanner.next();
        // 文字列を整数に変換
        int number = Integer.parseInt(numberStr);

        Random rand = new Random();

        for(int i = 0; i < number; i++) {
           int  randomNumber = rand.nextInt(number);
            System.out.println("生成された乱数です:"+randomNumber);

        }


        scanner.close();  // Scanner を閉じる
    }
}
