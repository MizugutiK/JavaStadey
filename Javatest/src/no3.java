import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class no3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Javatest以降のファイルパスを入れてください(フォルダ内を探す場合は\\\\で接続)");
        String fileName = inputScanner.next();
        String filePath = "C:\\Users\\MZGT\\Documents\\JavaStadey\\Javatest\\" + fileName;

        try (Scanner fileScanner  = new Scanner(new File(filePath))) {

            while (fileScanner.hasNextLine()) { // 1行ずつ読み取る
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("エラー: ファイルが見つかりません - " + fileName);
        }
        inputScanner.close(); // Scanner を閉じる

    }
}
