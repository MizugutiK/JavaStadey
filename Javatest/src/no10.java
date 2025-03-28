
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Javatest以降のファイルパスを入れてください(フォルダ内を探す場合は\\\\で接続)");
        String fileName = inputScanner.next();
        Path folderPath = Paths.get("C:\\Users\\MZGT\\Documents\\JavaStadey\\Javatest\\" + fileName);

        // メタファイルデータ
        try {

            FileTime fileTime = Files.getLastModifiedTime(folderPath);
            System.out.println("更新前： " + fileTime);

            FileTime NewfileTime = FileTime.from(Instant.now());
            Files.setLastModifiedTime(folderPath, NewfileTime);
            System.out.println("更新後： " + NewfileTime);

        } catch (IOException e) {
            System.out.println("エラー: ファイルが見つかりません - " + fileName);

        }
        inputScanner.close(); // Scanner を閉じる
    }
}
