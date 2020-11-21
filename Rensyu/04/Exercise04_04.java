// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習4
import java.io.*;
class Exercise04_04
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("三角形の高さと底辺を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      String str2 = br.readLine();

      double height = Integer.parseInt(str1);
      double width = Integer.parseInt(str2);

      System.out.println("三角形の面積は" + (height * width /(double) 2)+ "です。");
   }
}
