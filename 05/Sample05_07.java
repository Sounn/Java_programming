// 学籍番号:19H081，氏名:久井颯生，Sample番号:7
import java.io.*;

class Sample05_07
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("あなたは男性ですか？");
      System.out.println("YまたはNを入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      char res = str.charAt(0);

      if(res == 'Y' || res == 'y'){
         System.out.println("あなたは男性ですね。");
      }
      else if(res == 'N' || res == 'n'){
         System.out.println("あなたは女性ですね。");
      }
      else{
         System.out.println("YまたはNを入力してください。");
      }
   }
}
