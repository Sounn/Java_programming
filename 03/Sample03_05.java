// 学籍番号:19H081，氏名:久井颯生，Sample番号:5
import java.io.*;

class Sample03_05
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();

      int num = Integer.parseInt(str);

      System.out.println(num + "が入力されました。");
   }
}
