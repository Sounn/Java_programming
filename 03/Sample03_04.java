// 学籍番号:19H081，氏名:久井颯生，Sample番号:4
import java.io.*;

class Sample03_04
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("文字列を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      
      System.out.println(str + "が入力されました。");
   }
}
