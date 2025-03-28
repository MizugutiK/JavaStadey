
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;
import java.util.stream.Stream;

public class no9 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("フォルダ表示");
        System.out.println("JavaStadeyStadey以降のファイルパスを入れてください(フォルダ内を探す場合は\\\\で接続)");

        String fileName = inputScanner.next();
        Path folderPath = Paths.get("C:\\Users\\MZGT\\Documents\\JavaStadey\\" + fileName);

        if (!Files.exists(folderPath)) {
            System.out.println("❌ 指定されたフォルダが存在しません: " + folderPath);
        } else if (!Files.isDirectory(folderPath)) {
            System.out.println("❌ 指定されたパスはフォルダではありません: " + folderPath);
        } else {
            System.out.println("📂 フォルダ内容: " + folderPath);
            printTree(folderPath, ""); // フォルダツリーを表示
        }

        inputScanner.close(); // Scanner を閉じる
    }

    public static void printTree(Path folder, String indent) {
        try (Stream<Path> stream = Files.list(folder)) {
            Path[] files = stream.toArray(Path[]::new); // フォルダ内のファイル一覧を取得

            for (int i = 0; i < files.length; i++) {
                Path file = files[i];
                boolean isLast = (i == files.length - 1);
                String prefix = isLast ? "└── " : "├── ";

                System.out.println(indent + prefix + file.getFileName());

                // サブフォルダがある場合は再帰的に表示
                if (Files.isDirectory(file)) {
                    printTree(file, indent + (isLast ? "    " : "│   "));
                }
            }
        } catch (IOException e) {
            System.out.println("⚠ フォルダを読み込めませんでした: " + folder);
        }
    }
}
