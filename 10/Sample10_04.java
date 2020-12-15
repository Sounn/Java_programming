// 学籍番号:19H081，氏名:久井颯生，Sample番号:4
import java.io.*;

class Sample10_04
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("文字列を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();

      System.out.println("追加する文字列を入力してください。");

      String str2 = br.readLine();

      StringBuffer sb = new StringBuffer(str1);
      sb.append(str2);
      
      System.out.println(str1 + "に" + str2 + "を追加すると" + sb + "です。");
   }
}
