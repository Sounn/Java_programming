// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習2
import java.io.*;

class Exercise05_02
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      if((res % 2) == 0)
         System.out.println(res + "は偶数です。");
      else
         System.out.println(res + "は奇数です。");
   }
}
