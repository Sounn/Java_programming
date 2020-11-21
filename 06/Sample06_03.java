// 学籍番号:19H081，氏名:久井颯生，Sample番号:3
import java.io.*;

class  Sample06_03
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("いくつ*を出力しますか？");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);
            
      for(int i=1; i<=num; i++){
         System.out.print("*");
      }
   }
}
