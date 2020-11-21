// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習5
import java.io.*;

class Exercise05_05
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("成績を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      switch(res){
         case 1:
            System.out.println("もっとがんばりましょう。");
            break;
         case 2:
            System.out.println("もう少しがんばりましょう。");
            break;
         case 3:
            System.out.println("さらに上をめざしましょう。");
            break;
         case 4:
            System.out.println("たいへんよくできました。");
            break;
         case 5:
            System.out.println("たいへん優秀です。");
            break;
      }
   }
}
