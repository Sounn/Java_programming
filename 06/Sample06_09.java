// 学籍番号:19H081，氏名:久井颯生，Sample番号:9
import java.io.*;

class Sample06_09
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("何番目でループを中止しますか？（1～10）");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      for(int i=1; i<=10; i++){
         System.out.println(i + "番目の処理です。");
         if(i == res)
            break; 
      }
   }
}
