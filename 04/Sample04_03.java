// 学籍番号:19H081，氏名:久井颯生，Sample番号:3
import java.io.*;

class Sample04_03
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数を2つ入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      String str2 = br.readLine();

      int num1 = Integer.parseInt(str1);
      int num2 = Integer.parseInt(str2);

      System.out.println("たし算の結果は" + (num1+num2) + "です。");
   }
}
