// 学籍番号:19H081，氏名:久井颯生，Sample番号:2
import java.io.*;

class Sample05_02
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      if(res == 1){
         System.out.println("1が入力されました。");
         System.out.println("1が選択されました。");
      }

      System.out.println("処理を終了します。");
   }
}
