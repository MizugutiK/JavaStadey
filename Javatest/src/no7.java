import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class no7 {
    public static void main(String[] args) {

        double a = 0.1; // 放物線の開き具合（絶対値を大きくすると急なカーブ）
        int width = 80;
        int height = 40;

        try {
            // FileWriterクラスのオブジェクトを生成する
            FileWriter file = new FileWriter("/Users/MZGT/Documents/JavaStadey/Javatest/testfolda/parabola.txt");
            // PrintWriterクラスのオブジェクトを生成する
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            
            // 放物線
            for (int y = -height / 2; y <= height / 2; y++) {
                double yf = (double) y;
                double xf = a * yf * yf; // y座標の計算
                int x = (int) (width - 1 - xf); // 座標変換

                // インデントを調整して * を表示
                String spaces = " ".repeat(Math.max(0, x));
                // ファイルに書き込む
                pw.println(spaces + "*");
            }
            System.out.println("parabola.txtに書き込まれました");

            // ファイルを閉じる
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
