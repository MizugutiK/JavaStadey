import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class no5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Javatest以降のファイルパスを入れてください(フォルダ内を探す場合は\\\\で接続)");
        String fileName = inputScanner.next();
        String filePath = "C:\\Users\\MZGT\\Documents\\JavaStadey\\Javatest\\" + fileName;
        
        // 一時的に格納するリスト
        List<String> lines = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(filePath))) {

            while (fileScanner.hasNextLine()) { // 1行ずつ読み取る
                lines.add(fileScanner.nextLine()); // 1行ずつリストに追加

            }
            // リストを配列に変換
            String[] instruments = lines.toArray(new String[0]);
            // ソート
            Arrays.sort(instruments);

            System.out.println("ソート後の内容:");

            // 配列の要素をすべて取り出すfor文
            for (String line : instruments) {
                //格納するリストlineに上書きして出力
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            System.out.println("エラー: ファイルが見つかりません - " + fileName);
        }
        inputScanner.close(); // Scanner を閉じる

    }
}
