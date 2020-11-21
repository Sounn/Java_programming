
// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習3
import java.io.*;

class Exercise03_03
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("あなたは何歳ですか？");

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();

      int num = Integer.parseInt(str);

      System.out.println("あなたは" + num + "歳です。");
   }
}
