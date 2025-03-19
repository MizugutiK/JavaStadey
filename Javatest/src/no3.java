import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class no3 {
    public static void main(String[] args) {
        try {
            // FileWriterクラスのオブジェクトを生成する
            FileWriter file = new FileWriter("/Users/MZGT/Documents/JavaStadey/Javatest/testfolda/java.txt");
            // PrintWriterクラスのオブジェクトを生成する
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            // ファイルに書き込む
            pw.println("Hellow World");
            
            System.out.println("java.txtに書き込まれました");

            // ファイルを閉じる
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
