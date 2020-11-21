// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習4
import java.io.*;

class Exercise03_04
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("円周率の値はいくつですか？");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
      
      String str = br.readLine();

      double pi = Double.parseDouble(str);

      System.out.println("円周率の値は" + pi + "です。");
   }
}
