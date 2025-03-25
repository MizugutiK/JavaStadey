import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class no5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("カウント");
        System.out.println("Javatest以降のファイルパスを入れてください(フォルダ内を探す場合は\\\\で接続)");
        String fileName = inputScanner.next();
        String filePath = "C:\\Users\\MZGT\\Documents\\JavaStadey\\Javatest\\" + fileName;

        // 一時的に格納するリスト
        Map<String, Integer> wordCount = new HashMap<>();

        try (Scanner fileScanner = new Scanner(new File(filePath))) {

            while (fileScanner.hasNext()) { // 1行ずつ読み取る
                String word = fileScanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9ぁ-んァ-ヶ一-龠]", ""); // 記号を除去
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            System.out.println("単語の出現回数:");

            wordCount.entrySet()
                    .stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // 出現回数の多い順にソート
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        } catch (FileNotFoundException e) {
            System.out.println("エラー: ファイルが見つかりません - " + fileName);
        }
        inputScanner.close(); // Scanner を閉じる

    }
}
