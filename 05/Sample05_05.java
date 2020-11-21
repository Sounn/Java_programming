// 学籍番号:19H081，氏名:久井颯生，Sample番号:5
import java.io.*;

class Sample05_05
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数を入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      switch(res){
         case 1:
            System.out.println("1が入力されました。");
            break;
         case 2:
            System.out.println("2が入力されました。");
            break;
         default:
            System.out.println("1か2を入力してください。");
            break;
       }
   }
}
