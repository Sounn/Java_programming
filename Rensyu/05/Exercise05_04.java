// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習4
import java.io.*;

class Exercise05_04
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("0から10までの整数を入力してください。");

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      if(res >= 0 && res <= 10){
         System.out.println("正解です。");
      }
      else{
         System.out.println("まちがいです。");
      }
   }
}